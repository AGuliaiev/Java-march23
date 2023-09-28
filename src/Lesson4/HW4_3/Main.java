package Lesson4.HW4_3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();

        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");
        Person person3 = new Person("Sergi");
        Person person4 = new Person("Luda");
        Person person5 = new Person("Vasia");


        Pet pet1 = new Pet("Cat", "Bengal");
        Pet pet2 = new Pet("Cat", "Sphinx");
        Pet pet3 = new Pet("Hamster", "Dzungarian");
        Pet pet4 = new Pet("Dog", "Shar Pei");
        Pet pet5 = new Pet("Dog", "Husky");

        zooClub.addMember(person1);
        zooClub.addMember(person2);
        zooClub.addMember(person3);
        zooClub.addMember(person4);
        zooClub.addMember(person5);

        zooClub.addPetToMember(person1, pet1);
        zooClub.addPetToMember(person2, pet2);
        zooClub.addPetToMember(person3, pet3);
        zooClub.addPetToMember(person4, pet4);
        zooClub.addPetToMember(person5, pet5);

        System.out.println("Zoo Club:");
        zooClub.printClub();

        zooClub.removePetFromMember(person1, pet1);
        zooClub.removeMember(person2);


        System.out.println("\nUpdated Zoo Club:");
        zooClub.printClub();

        Pet pet6 = new Pet("Parrot", "Ara");
        zooClub.addPetToMember(person1, pet6);

        System.out.println("\nZoo Club after adding a parrot to Alice:");
        zooClub.printClub();

        zooClub.removePetFromAllMembers("");


        System.out.println("\nZoo Club after removing all pets of the same view: ");
        zooClub.printClub();

    }
}
