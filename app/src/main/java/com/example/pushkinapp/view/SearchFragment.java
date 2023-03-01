package com.example.pushkinapp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.pushkinapp.R;
import com.example.pushkinapp.adapter.MuseumRecyclerViewAdapter;
import com.example.pushkinapp.databinding.FragmentSearchBinding;
import com.example.pushkinapp.model.MuseumCatalogItem;
import com.example.pushkinapp.viewmodel.MuseumSharedViewModel;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {

    private MuseumCardFragment museumCardFragment = new MuseumCardFragment();

    FragmentSearchBinding binding;
    private MuseumRecyclerViewAdapter adapter;
    private MuseumSharedViewModel viewModel = new MuseumSharedViewModel();
    private List<MuseumCatalogItem> getSearchList;

    public SearchFragment() {
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_search, container, false);
        binding.setLifecycleOwner(this);

        SearchView searchView = binding.searchField;
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setIconified(false);
            }
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                search(newText);
                return false;
            }
        });

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(MuseumSharedViewModel.class);
    }

    private Observer<List<MuseumCatalogItem>> museumListUpdateObserver
            = new Observer<List<MuseumCatalogItem>>() {
        @Override
        public void onChanged(List<MuseumCatalogItem> museumArrayList) {
            binding.searchRecyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
            binding.searchRecyclerView.setAdapter(adapter);
        }
    };

    @Override
    public void onStart() {
        getActivity().findViewById(R.id.bottom_navigation).setVisibility(View.VISIBLE);
        super.onStart();
    }

    private void search(String text) {
        ArrayList<MuseumCatalogItem> filteredlist = new ArrayList<>();
        getSearchList = viewModel.getSearchMuseumMutableLiveData().getValue();
        adapter = new MuseumRecyclerViewAdapter(filteredlist);
        for (MuseumCatalogItem item : getSearchList) {
            if ((item.getTitle().toLowerCase().contains(text.toLowerCase()))
            ) {
                filteredlist.add(item);
            }
        }
        if (filteredlist.isEmpty()) {
        } else {
            // at last we are passing that filtered
            // list to our adapter class.
            adapter.filterList(filteredlist);
        }
        viewModel.getSearchMuseumMutableLiveData().observe(getViewLifecycleOwner(), museumListUpdateObserver);
        adapter.setListener((v, position) -> {
            viewModel.setSelected(adapter.getItemAt(position));
            getParentFragmentManager().beginTransaction()
                    .replace(R.id.container, museumCardFragment)
                    .addToBackStack(null)
                    .commit();
            getActivity().findViewById(R.id.bottom_navigation).setVisibility(View.GONE);
        });
    }
}