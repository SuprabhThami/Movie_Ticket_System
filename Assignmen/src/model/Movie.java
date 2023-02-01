package model;

public class Movie extends Category{
    String Name;
    String ShowTime;
    String Price;

    public Movie(String sitting_arrangement, String genre, String name, String showTime, String price) {
        super(sitting_arrangement, genre);
        Name = name;
        ShowTime = showTime;
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getShowTime() {
        return ShowTime;
    }

    public void setShowTime(String showTime) {
        ShowTime = showTime;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void getInfo(){
        System.out.println("Type: "+super.sitting_arrangement);
        System.out.println("Genre: "+super.genre);
        System.out.println("Name: "+this.Name);
        System.out.println("Showtime: "+this.ShowTime);
        System.out.println("Price: "+this.Price);
        System.out.println("--------------------------------------------");
    }

}