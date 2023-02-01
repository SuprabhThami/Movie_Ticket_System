import model.Movie;
import model.Seat;
import model.Ticket;
import model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie m1=new Movie("Sofa", "Action", "Pathaan", "11:45 pm", "Rs. 500");
        Movie m2=new Movie("Seat", "Horror", "M3gan", "1:00 m", "Rs. 210");
        Movie m3=new Movie("Seat", "Social Drama", "Phulbari", "9:45 am", "Rs. 350");
        Movie m4=new Movie("Sofa", "Adventure", "Avatar: The Way of Water", "4:20 pm", "Rs. 410");
        ArrayList<Movie> mo1 = new ArrayList<>();
        ArrayList<Movie> mo2 = new ArrayList<>();
        mo1.add(m1);
        mo2.add(m4);
        User u1=new User("Sonishma Basnet", "Kapan, Kathamandu","9808787944");
        User u2=new User("Deepti Neupane", "Bouddha, Kathmandu", "987969522");
        User u3=new User("Shine Pathak", "Sifal, Kathmandu", "9869856412");
        User u4=new User("Rachit Phuyal", "Maitidevi, Kathmandu", "9845109412");
        ArrayList<User> us1 = new ArrayList<>();
        ArrayList<User> us2 = new ArrayList<>();
        ArrayList<User> us3 = new ArrayList<>();
        ArrayList<User> us4 = new ArrayList<>();

        us1.add(u1);
        us2.add(u2);
        us3.add(u3);
        us4.add(u4);

        Seat s1=new Seat("A", "10");
        Seat s2=new Seat("B", "5");
        Seat s3=new Seat("F", "7");

        Ticket t1=new Ticket(us1, s1);
        Ticket t2=new Ticket(us2, s2);

        

    }
}