package Lesson4.HW4_3;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();

        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        Pet pet1 = new Pet("Cat", "Bengal");
        Pet pet2 = new Pet("Dog", "Shar Pei");

        zooClub.addMember(person1);
        zooClub.addMember(person2);

        zooClub.addPetToMember(person1, pet1);
        zooClub.addPetToMember(person2, pet2);

        System.out.println("Zoo Club:");
        zooClub.printClub();

        zooClub.removePetFromMember(person1, pet1);
        zooClub.removeMember(person2);
        zooClub.addPetToMember(person1, pet2);
        zooClub.addPetToMember(person2, pet1);

        System.out.println("\nUpdated Zoo Club:");
        zooClub.printClub();

        Pet pet3 = new Pet("Parrot", "Ara");
        zooClub.addPetToMember(person1, pet3);

        System.out.println("\nZoo Club after adding a parrot to Alice:");
        zooClub.printClub();

        zooClub.removePetFromAllMembers(pet2);

        System.out.println("\nZoo Club after removing all dogs:");
        zooClub.printClub();

    }
}
