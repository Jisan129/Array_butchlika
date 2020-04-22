package com.company;

import java.util.*;

import static java.util.Collections.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album =new Album("Bangla","Random");
        album.addSong("Jontrona",3.22);
        album.addSong("Srotoshini",4.15);
        album.addSong("Bhalobasha Baki",3.55);
        album.addSong("Bebodhan",4.16);
        albums.add(album);
        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        album.findSong("C.O.D");
        album.findSong("No no");
        albums.add(album);


        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        play(playList);



    }
    private static void play(LinkedList<Song> playlist){
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        boolean forward=true;
        ListIterator<Song> listIterator=playlist.listIterator();
        if(playlist.size()==0){
            System.out.println("Sorry, No songs found");
        }
        else {
            System.out.println("Now playing "+listIterator.next().toString());
            printMenu();
        }
        while (!quit){
            int action=scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("PlayList Complete");
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                              listIterator.next();
                        }}
                        forward=true;
                        if(listIterator.hasNext()){
                            System.out.println("Now playing "+listIterator.next().toString());
                        }
                        else {
                            System.out.println("We have reached at the end of the playlist");
                            forward = false;
                        }
                        break;
                case 2:

                    if(forward){

                    if(listIterator.hasPrevious()){
                        listIterator.previous();

                    }
                    forward=false;
                }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                    }

                    else {
                        System.out.println("We are at the start of the playlist");
                        forward=true;
                    }
                    break;

                case 3:
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                         forward =false;
                        } else {
                            System.out.println("Starting of the playlist");
                        }
                    }
                    else {
                        if(listIterator.hasNext()){
                            System.out.println("Now playing "+listIterator.next().toString());
                        }
                        else{
                            System.out.println("At the end of the playlist ");
                        }
                    }
                    break;

                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;



            }

        }


    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator=playlist.iterator();
        System.out.println("====================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=====================");

    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");

    }




}




