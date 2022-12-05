package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneContext phoneContext = new PhoneContext();
        System.out.println("--- Default state ---");
        System.out.println(phoneContext.alert() + "\n");

        System.out.println("--- State = Ringing() ---");
        phoneContext.setCurState(new Ringing());
        System.out.println(phoneContext.alert() + "\n");

        System.out.println("--- State = Charging() ---");
        phoneContext.setCurState(new Charging());
        System.out.println(phoneContext.alert()+ "\n");
    }
}