package com.boylan.csci;
//Mike Boylan
abstract class Contacts {
    private String name;

    public Contacts(String name){
        this.name = name;
    }

    public abstract void contact();
}

class Email extends Contacts {
    private String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }


    @Override
    public void contact() {
        System.out.println("Emailing to: " + email );

    }
}

class Phone extends Contacts {
    private String phone;

    public Phone(String name, String phone) {
        super(name);
        this.phone = phone;
    }



    @Override
    public void contact() {
        System.out.println("Calling: " + phone);
    }
}



public class Main {

    public static void main(String[] args) {
        Email Joker = new Email("The Joker", "tjokar@twinsdail.org");
        Phone Jokera = new Phone ("Phineas Joker", "614-777-6666");
        Joker.contact();
        Jokera.contact();
    }
}