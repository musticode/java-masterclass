package org.master.classes.collections.Overview;

import java.util.*;

public class Theatre {
    private final String theatreName;
    public List<Seat> seats = new ArrayList<>();


    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if (seat1.getPrice() < seat2.getPrice()){
                return -1;
            } else if (seat1.getPrice() > seat2.getPrice()) {
                return 1;
            }else {
                return 0;
            }
        }
    };


    public Theatre(String theatreName, int numRows, int seatsPerRow){
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows -1);
        for (char row = 'A'; row <= lastRow; row++){
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++){

                double price = 12.00;
                if ((row < 'D') && seatNum >= 4 && seatNum <9 ){
                    price = 14.00;
                } else if ((row < 'F') || seatNum >= 4 || seatNum <9) {
                    price = 7.00;
                }

                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }

    }

    public String getTheatreName() {
        return theatreName;
    }

/*    public boolean reserveSeat(String seatNumber){
        Seat requestSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestSeat, null);
        if (foundSeat >= 0 ){
            return seats.get(foundSeat).reserve();
        }else{
            System.out.println("There is no seat");
            return false;
        }*/

/*        for (Seat seat : seats){
            if (requestSeat.getSeatNumber().equals(seatNumber)){
                requestSeat = seat;
                break;
            }
        }

        if (requestSeat == null){
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestSeat.reserve();*/
    //}


    //for testing
    public void getSeats(){
        for (Seat seat: seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    //2nd
    public Collection<Seat> getSeatsNum(){
        return seats;
    }




    public boolean reserveSeatBinarySearch(String seatNumber){
        int low = 0;
        int high = seats.size()-1;
        while (low <= high){
            System.out.println(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int compare = midVal.getSeatNumber().compareTo(seatNumber);

            if (compare < 0){
                low = mid + 1;
            } else if (compare > 0) {
                high = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
        }
        System.out.println("no seat");
        return false;
    }





}
