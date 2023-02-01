package model;

public class User {
    String Username;
    String Address;
    String ContactInfo;

    public User(String username, String address, String contactInfo) {
        Username = username;
        Address = address;
        ContactInfo = contactInfo;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContactInfo() {
        return ContactInfo;
    }

    public void setContactInfo(String contactInfo) {
        ContactInfo = contactInfo;
    }
}