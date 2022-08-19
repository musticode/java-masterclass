package org.master.Classes.ListArrayList.ChallengePlaylist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


// https://pages.cs.wisc.edu/~mcw/cs367/lectures/linkedlists.html
public class Main {

    public static void main(String[] args) {
        LinkedList<Song> songLinkedList = new LinkedList<Song>();

        Song song1 = new Song("t1", 3);
        Song song2 = new Song("t2", 4);
        Song song3 = new Song("t3", 5);


        songLinkedList.add(song1);
        songLinkedList.add(song2);
        songLinkedList.add(song3);

        listen(songLinkedList);





    }

    public static void listen(LinkedList<Song> songLinkedList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<Song> songListIterator = songLinkedList.listIterator();

//        if (songLinkedList.getFirst().getTitle() == ""){
//            System.out.println("nothing in the list");
//            return;
//        }else {
            System.out.println("Listening "+ songListIterator.next().getTitle());
            printMenu();
//        }

        while (!quit){
            int action = scanner.nextInt();
            switch (action){
                case 0:
                    System.out.println("quiting");
                    quit = true;
                    break;
                case 1:
                    if (songListIterator.hasNext()){
                        System.out.println("listening forw: "+ songListIterator.next().getTitle());
                    }else{
                        System.out.println("end of the list --->");
                    }
                    break;
                case 2:
                    if (songListIterator.hasPrevious()){
                        System.out.println("listening back: " + songListIterator.previous().getTitle());
                    }else{
                        System.out.println("begining of the list ---->");
                    }
                    break;
                case 3:
                    songListIterator.previous();
                    System.out.println("Current song: " + songListIterator.next().getTitle());
                    break;
                case 4:
                    if (songListIterator.hasNext() && songListIterator.hasPrevious()){
                        songListIterator.remove();
                        System.out.println("Song is removed");
                    }
                    break;
                case 5:
                    printMenu();
            }
        }

    }

    public boolean addToPlayList(int track, List<Song>  songList){
        int index = track-1;
        if ((index>0) && index <= songList.size() ){

        }
        return false;
    }

    private static void printMenu(){
        System.out.println("Actions\npress: ");
        System.out.println("0 - quit\n"+
                "1- skip forward\n"+
                "2- skip backward\n"+
                "3- replay current\n"+ //sorunlu
                "4- remove\n"+
                "5- print menu");
    }

}
