package edu.miracosta.cs113;

public class Person {
    private String lastName;
    private String firstName;

    public int compareTo(Person per) { if (lastName.equals(per.lastName))
        return firstName.compareTo(per.firstName); else
        return lastName.compareTo(per.lastName);
    }

    public void changelastName(boolean justMarried, String newlast) {
        if (justMarried) lastName = newlast;
    }

}
