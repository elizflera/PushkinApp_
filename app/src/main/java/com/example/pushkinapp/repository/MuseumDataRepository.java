package com.example.pushkinapp.repository;

import com.example.pushkinapp.R;
import com.example.pushkinapp.model.ExpoCatalogItem;
import com.example.pushkinapp.model.MuseumCatalogItem;

import java.util.ArrayList;
import java.util.List;

public class MuseumDataRepository {

   public MuseumDataRepository(){

   }
   public static List<MuseumCatalogItem> museumCatalogItemList = populateItems();

   public static List<MuseumCatalogItem> populateItems()
   {
       List<MuseumCatalogItem> museumCatalogItem = new ArrayList<>();


       museumCatalogItem.add(new MuseumCatalogItem(0,200, "Пушкинский музей",R.drawable.museum_pushkin_main_pic,"Средняя цена билета: 200 рублей",
               R.drawable.museum_pushkin_logo,
               "Средняя цена билета: 250 рублей"+ "\n" +"Московский музей зарубежного искусства, основанный профессором Московского университета Иваном Цветаевым в 1912 " +
                       "году как «Музей изящных искусств имени императора Александра III при Императорском Московском университете». " +
                       "Здание музея было построено по проекту архитектора Романа Клейна в неоклассическом стиле в виде античного храма. " +
                       "Изначально музей был задуман как учебный, однако после революции 1917 года учреждение было преобразовано в Государственный музей изобразительных искусств. " +
                       "В 1937-м музей получил имя поэта Александра Пушкина. В 1991 году ГМИИ имени Пушкина внесли в Государственный свод особо ценных объектов культурного наследия народов России."));

       museumCatalogItem.add(new MuseumCatalogItem(1,350, "ММОМА",R.drawable.museum_mmoma_main_pic,
               "Средняя цена билета: 350 рублей", R.drawable.museum_mmoma_logo,
               "Средняя цена билета: 350 рублей"+ "\n" +"Первый в России государственный музей современного искусства, " +
                       "в коллекциях которого представлены исключительно произведения визуальной культуры ХХ и XXI веков. " +
                       "Музей был основан в 1999 году при поддержке Правительства Москвы и Департамента культуры столицы. " +
                       "Основателем и директором ММоМА является Зураб Церетели. " +
                       "Постоянная коллекция насчитывает более 12 тыс. арт-объектов: картин, фотографий, скульптур, инсталляций. " +
                       "Музей также занимается организацией временных выставок, осуществляет научную, реставрационную и издательскую деятельность. " +
                       "Музей располагает пятью площадками в центре Москвы. Главное здание находится по адресу ул. Петровка, 25."));


       museumCatalogItem.add(new MuseumCatalogItem(2,650,"Гараж",R.drawable.museum_garage_main_pic,"Средняя цена билета: 650 рублей"
       , R.drawable.museum_garage_logo,
               "Средняя цена билета: 650 рублей"+ "\n" +"Российский музей современного искусства. Основан в 2008 году Дарьей Жуковой и Романом Абрамовичем, " +
                       "располагается в Парке Горького в Москве. Занимает пятое место по посещаемости среди музеев Москвы, " +
                       "в 2018 году музей посетили 818 тысяч человек, в 2019 году музей посетили 942 тысячи человек."));

       return museumCatalogItem;
   }

    public static List<List<ExpoCatalogItem>> expoCatalogItemList = populateExpoItems();

    public static List<List<ExpoCatalogItem>> populateExpoItems()
    {
        List<ExpoCatalogItem> pushkinExpoCatalogItem = new ArrayList<>();
        List<List<ExpoCatalogItem>> expoFullSet = new ArrayList<>();

        pushkinExpoCatalogItem.add(new ExpoCatalogItem(11,R.raw.track01, "Поль Сезанн. Персики и груши", R.drawable.pushkin1_peaches_and_pears, "Картину «Персики и груши» специалисты относят к первой половине 1980-х годов. Натюрморты Сезанна того времени часто сравнивают с его пейзажами: углы смятой белой скатерти действительно чем-то напоминают холмы Экса на его пейзажах. На картине изображены груши, персики, разложенные на смятой белой скатерти с рисунком. Круглая, почти шарообразная сахарница и вытянутый молочник дополняют композицию. Художник использует простые формы и чистые цвета."));
        pushkinExpoCatalogItem.add(new ExpoCatalogItem(12, R.raw.track02,"Поль Гоген. Жена короля", R.drawable.pushkin2_kings_wife, "На картине обнаженная юная таитянка лежит рядом с деревом, которое обвивает змей. Это не только реальное дерево, за которым можно различить двух беседующих старцев, но и символическое древо познания добра и зла. Таитянка нисколько не стыдится своей наготы, ее поза напоминает позу молодой женщины, с которой Тициан в середине XVI века писал свою «Венеру Урбинскую». Искусствоведы предполагают, что художник изобразил на картине свою таитянскую жену. Сам живописец был доволен своей картиной и считал эту работу одной из лучших. Яркие насыщенные цвета и сложные композиционные ритмы придают полотну почти орнаментальное звучание."));
        pushkinExpoCatalogItem.add(new ExpoCatalogItem(13, R.raw.track01,"Эдгар Дега. Голубые танцовщицы", R.drawable.pushkin3_blue_dancers, "На картине зритель видит четырех танцовщиц, но у него может сложиться впечатление, что это одна и та же балерина, изображенная в разные моменты времени. Вот она завязывает пуант, потом поправляет платье, осматривает свой костюм, держась за край декораций. Ее простые и естественные движения на картине превращаются в прекрасный танец.\n" +
                "\n" +
                "Дега стал одним из первых мастеров, создававших с помощью пастели большие, законченные картины. Для этой картины он также выбрал технику пастели, которая помогла ему передать удивительное богатство фактуры и цветовых сочетаний, красивые синие тени и цветные блики на волосах танцовщиц."));
        pushkinExpoCatalogItem.add(new ExpoCatalogItem(14, R.raw.track01,"Анри Матисс. Танец", R.drawable.pushkin4_dance, "На масштабном полотне изображены пять обнаженных фигур в полтора раза больше натуральной величины. Взявшись за руки, они танцуют на зеленом холме.\n" +
                "\n" +
                "Фигуры представлены в нарочито упрощенном стиле, их пропорции нарушены, а части тел выглядят то чрезмерно вытянутыми, то сокращенными. Фигуры танцующих выгибаются и перекручиваются: им словно тесно в пределах картины.\n" +
                "\n" +
                "Лица персонажей не видны: они либо склоняют голову, либо поворачиваются к зрителю спиной. И только у одной женской фигуры художник несколькими короткими штрихами обозначает черты лица - брови, глаза, нос и губы. Гораздо больше внимания Матисс уделяет изображению ступней с натянутыми носками и крепких мускулистых ног, которые разведены в прыжке или сведены в сложном па. Энергичные позы подсказывают, что танцующие стремительно движутся по кругу, словно подчиняясь какому-то безудержному ритму.\n" +
                "\n" +
                "Чтобы выдержать ритм, персонажи крепко цепляются за руки друг друга. Эту цепь рук разрывает падающая фигура на переднем плане. Ноги ее подкашиваются, она словно спотыкается о нижний край картины и вот-вот рухнет на землю, потеряв равновесие."));
        pushkinExpoCatalogItem.add(new ExpoCatalogItem(15, R.raw.track01,"Клод Моне. Белые кувшинки", R.drawable.pushkin5_white_flowers, "Солнечный день. Через заросший пруд дугой перекинут японский мостик. Поверхность воды устилает ковер из зеленых листьев и водяных лилий. Цветочный ковер прорезают участки зеркальной водной глади, в которой отражаются деревья. Незамысловатая форма моста передана тремя параллельными дугами пролета и перил и вертикалями ограды. Пруд обрамляет густая растительность: слева к воде склоняются ветви плакучей ивы, написанные параллельными вертикальными мазками, а справа в просвете между густой кудрявой листвой сияет чистое голубое небо. Вдоль берега в разные стороны тянутся длинные стебли цветов, камышей и трав.\n" +
                "\n" +
                "Картина построена на свежих оттенках голубого и зеленого, которые в ярких лучах солнца приобретают теплый желтоватый тон. Даже мостик в рефлексах окружающей зелени кажется не белым, а светло-зеленым.\n" +
                "\n"));
        pushkinExpoCatalogItem.add(new ExpoCatalogItem(16,R.raw.track01,"Поль Сезанн. Персики и груши", R.drawable.pushkin1_peaches_and_pears, "Картину «Персики и груши» специалисты относят к первой половине 1980-х годов. Натюрморты Сезанна того времени часто сравнивают с его пейзажами: углы смятой белой скатерти действительно чем-то напоминают холмы Экса на его пейзажах. На картине изображены груши, персики, разложенные на смятой белой скатерти с рисунком. Круглая, почти шарообразная сахарница и вытянутый молочник дополняют композицию. Художник использует простые формы и чистые цвета."));
        pushkinExpoCatalogItem.add(new ExpoCatalogItem(17,R.raw.track02,"Поль Сезанн. Персики и груши", R.drawable.pushkin1_peaches_and_pears, "Картину «Персики и груши» специалисты относят к первой половине 1980-х годов. Натюрморты Сезанна того времени часто сравнивают с его пейзажами: углы смятой белой скатерти действительно чем-то напоминают холмы Экса на его пейзажах. На картине изображены груши, персики, разложенные на смятой белой скатерти с рисунком. Круглая, почти шарообразная сахарница и вытянутый молочник дополняют композицию. Художник использует простые формы и чистые цвета."));
        pushkinExpoCatalogItem.add(new ExpoCatalogItem(18,R.raw.track01,"Поль Сезанн. Персики и груши", R.drawable.pushkin1_peaches_and_pears, "Картину «Персики и груши» специалисты относят к первой половине 1980-х годов. Натюрморты Сезанна того времени часто сравнивают с его пейзажами: углы смятой белой скатерти действительно чем-то напоминают холмы Экса на его пейзажах. На картине изображены груши, персики, разложенные на смятой белой скатерти с рисунком. Круглая, почти шарообразная сахарница и вытянутый молочник дополняют композицию. Художник использует простые формы и чистые цвета."));

        pushkinExpoCatalogItem.add(new ExpoCatalogItem(19,R.raw.track01,"Поль Сезанн. Персики и груши", R.drawable.pushkin1_peaches_and_pears, "Картину «Персики и груши» специалисты относят к первой половине 1980-х годов. Натюрморты Сезанна того времени часто сравнивают с его пейзажами: углы смятой белой скатерти действительно чем-то напоминают холмы Экса на его пейзажах. На картине изображены груши, персики, разложенные на смятой белой скатерти с рисунком. Круглая, почти шарообразная сахарница и вытянутый молочник дополняют композицию. Художник использует простые формы и чистые цвета."));
        pushkinExpoCatalogItem.add(new ExpoCatalogItem(110,R.raw.track01,"Поль Сезанн. Персики и груши", R.drawable.pushkin1_peaches_and_pears, "Картину «Персики и груши» специалисты относят к первой половине 1980-х годов. Натюрморты Сезанна того времени часто сравнивают с его пейзажами: углы смятой белой скатерти действительно чем-то напоминают холмы Экса на его пейзажах. На картине изображены груши, персики, разложенные на смятой белой скатерти с рисунком. Круглая, почти шарообразная сахарница и вытянутый молочник дополняют композицию. Художник использует простые формы и чистые цвета."));
        pushkinExpoCatalogItem.add(new ExpoCatalogItem(111,R.raw.track01,"Поль Сезанн. Персики и груши", R.drawable.pushkin1_peaches_and_pears, "Картину «Персики и груши» специалисты относят к первой половине 1980-х годов. Натюрморты Сезанна того времени часто сравнивают с его пейзажами: углы смятой белой скатерти действительно чем-то напоминают холмы Экса на его пейзажах. На картине изображены груши, персики, разложенные на смятой белой скатерти с рисунком. Круглая, почти шарообразная сахарница и вытянутый молочник дополняют композицию. Художник использует простые формы и чистые цвета."));
        pushkinExpoCatalogItem.add(new ExpoCatalogItem(112,R.raw.track01,"Поль Сезанн. Персики и груши", R.drawable.pushkin1_peaches_and_pears, "Картину «Персики и груши» специалисты относят к первой половине 1980-х годов. Натюрморты Сезанна того времени часто сравнивают с его пейзажами: углы смятой белой скатерти действительно чем-то напоминают холмы Экса на его пейзажах. На картине изображены груши, персики, разложенные на смятой белой скатерти с рисунком. Круглая, почти шарообразная сахарница и вытянутый молочник дополняют композицию. Художник использует простые формы и чистые цвета."));

        List<ExpoCatalogItem> mmomaExpoCatalogItem = new ArrayList<>();
        mmomaExpoCatalogItem.add(new ExpoCatalogItem(21, R.raw.track01,"title", R.drawable.museum_mmoma_main_pic, "InfoText"));
        mmomaExpoCatalogItem.add(new ExpoCatalogItem(22, R.raw.track01,"title", R.drawable.museum_mmoma_main_pic, "InfoText"));
        mmomaExpoCatalogItem.add(new ExpoCatalogItem(23, R.raw.track01,"title", R.drawable.museum_mmoma_main_pic, "InfoText"));
        mmomaExpoCatalogItem.add(new ExpoCatalogItem(21, R.raw.track01,"title", R.drawable.museum_mmoma_main_pic, "InfoText"));
        mmomaExpoCatalogItem.add(new ExpoCatalogItem(22, R.raw.track01,"title", R.drawable.museum_mmoma_main_pic, "InfoText"));
        mmomaExpoCatalogItem.add(new ExpoCatalogItem(23, R.raw.track01,"title", R.drawable.museum_mmoma_main_pic, "InfoText"));
        mmomaExpoCatalogItem.add(new ExpoCatalogItem(21, R.raw.track01,"title", R.drawable.museum_mmoma_main_pic, "InfoText"));
        mmomaExpoCatalogItem.add(new ExpoCatalogItem(22, R.raw.track01,"title", R.drawable.museum_mmoma_main_pic, "InfoText"));
        mmomaExpoCatalogItem.add(new ExpoCatalogItem(23, R.raw.track01,"title", R.drawable.museum_mmoma_main_pic, "InfoText"));

        List<ExpoCatalogItem> garageExpoCatalogItem = new ArrayList<>();
        garageExpoCatalogItem.add(new ExpoCatalogItem(31, R.raw.track01,"Title", R.drawable.museum_garage_logo, "InfoText"));
        garageExpoCatalogItem.add(new ExpoCatalogItem(32, R.raw.track01,"Title", R.drawable.museum_garage_logo, "InfoText"));
        garageExpoCatalogItem.add(new ExpoCatalogItem(33, R.raw.track01,"Title", R.drawable.museum_garage_logo, "InfoText"));
        garageExpoCatalogItem.add(new ExpoCatalogItem(31, R.raw.track01,"Title", R.drawable.museum_garage_logo, "InfoText"));
        garageExpoCatalogItem.add(new ExpoCatalogItem(32, R.raw.track01,"Title", R.drawable.museum_garage_logo, "InfoText"));
        garageExpoCatalogItem.add(new ExpoCatalogItem(31, R.raw.track01,"Title", R.drawable.museum_garage_logo, "InfoText"));
        garageExpoCatalogItem.add(new ExpoCatalogItem(32, R.raw.track01,"Title", R.drawable.museum_garage_logo, "InfoText"));
        garageExpoCatalogItem.add(new ExpoCatalogItem(32, R.raw.track01,"Title", R.drawable.museum_garage_logo, "InfoText"));
        garageExpoCatalogItem.add(new ExpoCatalogItem(31, R.raw.track01,"Title", R.drawable.museum_garage_logo, "InfoText"));
        garageExpoCatalogItem.add(new ExpoCatalogItem(32, R.raw.track01,"Title", R.drawable.museum_garage_logo, "InfoText"));


        expoFullSet.add(pushkinExpoCatalogItem);
        expoFullSet.add(mmomaExpoCatalogItem);
        expoFullSet.add(garageExpoCatalogItem);
        return expoFullSet;
    }

}
