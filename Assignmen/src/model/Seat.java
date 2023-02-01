package model;

import java.util.ArrayList;

public class Seat extends ArrayList<Seat> {
    String Row;
    String SeatNumber;


    public Seat(String row, String seatNumber) {
        Row = row;
        SeatNumber = seatNumber;
    }

    public String getRow() {
        return Row;
    }

    public void setRow(String row) {
        Row = row;
    }

    public String getSeatNumber() {
        return SeatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        SeatNumber = seatNumber;
    }

}