package org.example;

import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    private List<Address> addresses;

    public Hobby(String name, int frequency, List<Address> addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return name + " (" + frequency + " times/week)";
    }
}

