package model;

public class Person {
    private final String name;
    private final String address;
    private final Mail mail;
    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.mail = new Mail(email);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Mail getEmail() {
        return mail;
    }
    
    
    
}
