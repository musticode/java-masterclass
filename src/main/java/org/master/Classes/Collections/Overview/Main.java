package org.master.Classes.Collections.Overview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        theatre.getSeats();

/*
        if (theatre.reserveSeat("H11")){
            System.out.println("Please pay" );
        }else {
            System.out.println("sorry it's taken");
        }

        if (theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry it's taken");
        }

*/


        Theatre theatre1 = new Theatre("Test", 8, 12);
        List<Seat> seatListCopy = new ArrayList<>(theatre1.seats);

        Seat seatMin = Collections.min(seatListCopy);
        Seat seatMax = Collections.max(seatListCopy);
        System.out.println(seatMin.getSeatNumber());
        System.out.println(seatMax.getSeatNumber());


        List<Seat> reversedSeat = new ArrayList<>(theatre1.seats);
        Collections.reverse(reversedSeat);
        printList(reversedSeat);


        List<Seat> priceSeats = new ArrayList<>(theatre1.seats);
        priceSeats.add(new Seat("BOO", 13.00));
        priceSeats.add(new Seat("AOO", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);




    }

    public static void printList(List<Seat> list){
        for (Seat seat: list){
            System.out.print( " " + seat.getSeatNumber()+ " price: "+ seat.getPrice());
        }
        System.out.println();
        System.out.println("-------------------------------");
    }


    public static void sortList(List<? extends Seat> list){
        for (int i = 0; i < list.size(); i++ ){
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list, i , j);
                }
            }
        }
    }

}
