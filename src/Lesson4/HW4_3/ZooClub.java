package Lesson4.HW4_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
    private final Map<Person, List<Pet>> club;
    public ZooClub() {
        club = new HashMap<>();
    }

    public void addMember(Person person) {
        club.putIfAbsent(person, new ArrayList<>());
    }

    public void addPetToMember(Person person, Pet pet) {
        club.computeIfPresent(person, (key, pets) -> {
            pets.add(pet);
            return pets;
        });
    }

    public void removePetFromMember(Person person, Pet pet) {
        club.computeIfPresent(person, (key, pets) -> {
            pets.remove(pet);
            return pets;
        });
    }

    public void removeMember(Person person) {
        club.remove(person);
    }

    public void removePetFromAllMembers(Pet pet) {
        club.values().forEach(pets -> pets.removeIf(p -> p.equals(pet)));
    }

    public void printClub() {
        club.forEach((person, pets) -> {
            System.out.println(person.getName() + "'s pets: " + pets);
        });
    }
}
