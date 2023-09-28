package Lesson4.HW4_2;


import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Max", "Petrov", "petr@gmail.com", 35, Gender.MALE, new Car("BMW", 2010, 200));

        user1.getSkills().add(new Skill("JS", 8));
        user1.getSkills().add(new Skill("JAVA", 9));
        user1.getSkills().add(new Skill("PYTHON", 10));

        User user2 = new User(2, "Fedor", "Ribkin", "riba@gmail.com", 36, Gender.MALE, new Car("Volvo", 2012, 150));

        user2.getSkills().add(new Skill("JS", 7));
        user2.getSkills().add(new Skill("JAVA", 9));
        user2.getSkills().add(new Skill("PYTHON", 6));

        User user3 = new User(3, "Olga", "Sidorova", "oSidor@gmail.com", 25, Gender.FEMALE, new Car("BMW", 2020, 250));

        user3.getSkills().add(new Skill("JS", 8));
        user3.getSkills().add(new Skill("JAVA", 10));
        user3.getSkills().add(new Skill("PYTHON", 10));

        User user4 = new User(4, "Max", "Guliev", "guliev@gmail.com", 41, Gender.MALE, new Car("Lada", 2010, 85));

        user4.getSkills().add(new Skill("JS", 7));
        user4.getSkills().add(new Skill("JAVA", 9));
        user4.getSkills().add(new Skill("PYTHON", 9));

        User user5 = new User(5, "Sergi", "Kozakov", "kozak@gmail.com", 20, Gender.MALE, new Car("Nissan", 2015, 190));

        user5.getSkills().add(new Skill("JS", 8));
        user5.getSkills().add(new Skill("JAVA", 10));
        user5.getSkills().add(new Skill("PYTHON", 10));

        User user6 = new User(6, "Ludaa", "Petrova", "lPetrova@gmail.com", 27, Gender.FEMALE, new Car("Peugeot", 2022, 190));

        user6.getSkills().add(new Skill("JS", 10));
        user6.getSkills().add(new Skill("JAVA", 9));
        user6.getSkills().add(new Skill("PYTHON", 10));

        User user7 = new User(7, "Anna", "Serova", "AnSer@gmail.com", 28, Gender.FEMALE, new Car("Volvo", 2015, 200));

        user7.getSkills().add(new Skill("JS", 8));
        user7.getSkills().add(new Skill("JAVA", 9));
        user7.getSkills().add(new Skill("PYTHON", 5));

        User user8 = new User(8, "Lisa", "Gulyaeva", "LGulya@gmail.com", 18, Gender.FEMALE, new Car("BMW", 2022, 250));

        user8.getSkills().add(new Skill("JS", 10));
        user8.getSkills().add(new Skill("JAVA", 9));
        user8.getSkills().add(new Skill("PYTHON", 10));

        User user9 = new User(9, "Kosta", "Ribak", "riba@gmail.com", 44, Gender.MALE, new Car("BMW", 2018, 200));

        user9.getSkills().add(new Skill("JS", 8));
        user9.getSkills().add(new Skill("JAVA", 7));
        user9.getSkills().add(new Skill("PYTHON", 10));

        User user10 = new User(10, "Masha", "Kravzova", "krava@gmail.com", 35, Gender.FEMALE, new Car("Mercedes", 2015, 300));

        user10.getSkills().add(new Skill("JS", 8));
        user10.getSkills().add(new Skill("JAVA", 7));
        user10.getSkills().add(new Skill("PYTHON", 9));

        HashSet<User> userHashSet = new HashSet<>();
        userHashSet.add(user1);
        userHashSet.add(user2);
        userHashSet.add(user3);
        userHashSet.add(user4);
        userHashSet.add(user5);
        userHashSet.add(user6);
        userHashSet.add(user7);
        userHashSet.add(user8);
        userHashSet.add(user9);
        userHashSet.add(user10);

        userHashSet.removeIf(user -> user.getGender().equals(Gender.MALE));

        for (User user : userHashSet) {
            System.out.println(user);

        }

        TreeSet<User> userTreeSet = new TreeSet<>();
        userTreeSet.add(user1);
        userTreeSet.add(user2);
        userTreeSet.add(user3);
        userTreeSet.add(user4);
        userTreeSet.add(user5);
        userTreeSet.add(user6);
        userTreeSet.add(user7);
        userTreeSet.add(user8);
        userTreeSet.add(user9);
        userTreeSet.add(user10);


        for (User user : userTreeSet) {
            System.out.println(user);
        }


    }
}
