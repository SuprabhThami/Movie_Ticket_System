package model;

import java.util.ArrayList;

public class Ticket {
    ArrayList<User> User;
    ArrayList<Seat> Seat;

    public Ticket(ArrayList<model.User> user, ArrayList<model.Seat> seat) {
        User = user;
        Seat = seat;
    }

    public ArrayList<model.User> getUser() {
        return User;
    }

    public void setUser(ArrayList<model.User> user) {
        User = user;
    }

    public ArrayList<model.Seat> getSeat() {
        return Seat;
    }

    public void setSeat(ArrayList<model.Seat> seat) {
        Seat = seat;
    }
}