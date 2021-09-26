package com.company;

import java.util.Arrays;
import java.util.List;


public class Main {

    public static void fifth(){
        Publication p = new PublicationBuilder().setName("История транзистора").setRate(10).setTags("история", "it", "электроника").setText("Дорога к твердотельным переключателям была долгой. \n" +
                "Она началась с открытия того, что определенные \n" +
                "материалы странно ведут себя в присутствии \n" +
                "электричества. В 1874 году Фердинанд Браун \n" +
                "опубликовал статью “О прохождении электрических \n" +
                "токов через сульфиды металлов”. И все завертелось…\n").setComments(new Comment(1, "Держите ссылку на то как работают светодиоды из \n" +
                "карбида кремния ввв.свет.ру"), new Comment(0, "Это перевод? Пойду оригинал почитаю"), new Comment(5, "Какую только дичь не писали в журналах 20-30гг \n" +
                "пытаясь объяснить работу кристаллического детектора\n")).getPub();
        p.comments.get(0).addSubcomms(new Comment(0, "Спасибо"), new Comment(0, "Thanks!"));
        p.comments.get(1).addSubcomms(new Comment(0," а где ссылка на оригинал?"));
        p.comments.get(1).subcomms.get(0).addSubcomms(new Comment(3, " автор, добавь ссылку в начало статьи"));



        System.out.println(p);
    }

    public static void fourth(){
        Album kuk = new Album("Кукловод", "Металлов");
        Album oop = new Album("Шоссе к ООП", "Асид");

        Song sost = new Song("Состояние объектов");
        sost.coAuthors = new String[1];
        sost.coAuthors[0] = "Янг";

        Song songoop = new Song("Шоссе к ООП");

        Song onep = new Song("Одноразовый программист");
        onep.coAuthors = new String[1];
        onep.coAuthors[0] = "Бертон";

        sost.album = oop;
        songoop.album = oop;
        onep.album = kuk;

        oop.addSong(sost, songoop);
        kuk.addSong(onep);

        for (Song s: sost.album.tracks)
            System.out.println(s);
    }

    public static void third(){
        City[] cities = new City[6];
        City a = cities[0] = new City("A");
        City b = cities[1] = new City("B");
        City c = cities[2] = new City("C");
        City d = cities[3] = new City("D");
        City e = cities[4] = new City("E");
        City f = cities[5] = new City("F");

        Road[] roads = new Road[8];
        Road ab = roads[0] = new Road(a, b, 5);
        Road af = roads[1] = new Road(a, f, 1);
        Road ad = roads[2] = new Road(a, d, 6);
        Road fb = roads[3] = new Road(f, b, 2);
        Road fe = roads[4] = new Road(f, e, 2);
        Road bc = roads[5] = new Road(b, c, 3);
        Road ed = roads[6] = new Road(e, d, 2);
        Road cd = roads[7] = new Road(c, d, 4);

     /*   for (int i = 0; i<cities.length; i++){
            cities[i].setUnknownRoads(roads);
            System.out.println(cities[i]);
        } */

        for (City ct: cities){
            ct.setUnknownRoads(roads);
            System.out.println(ct);
        }

    }

    public static void second(){
        Note[] nVas = {new Note(5, "Информатика", "Ермаков"),
                       new Note(4, "Математика", "Петрова"),
                       new Note(5,"Физика", "Сидоров")};

        MarkBook mbVas = new MarkBook(171896, "Вася", nVas);

        System.out.println(mbVas);

        mbVas.notes[2] = new Note(4, "Английский язык", "Буров");

        MarkBook mbPet = new MarkBook(173654, "Вася", nVas);
        System.out.println(mbPet);

        mbPet.notes = Arrays.copyOf(nVas, nVas.length);
        mbPet.notes[1].setNote(5);
        System.out.println(mbPet);

    }

    public static void first(){
        int[] notesPet = {3, 4, 5};
        Student pet = new Student("Петя", notesPet);

        Student vas = new Student("Вася", pet.getNotes());
        System.out.println(pet + "\n" + vas);
    }



    public static void main(String[] args) {
        fifth();

    }


}


