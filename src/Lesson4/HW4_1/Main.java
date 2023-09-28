package Lesson4.HW4_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Users users1 = new Users(23, "Sergi");
        Users users2 = new Users(25, "Andrii");
        Users users3 = new Users(32, "Olga");
        Users users4 = new Users(26, "Anna");
        Users users5 = new Users(36, "Fedor");
        List<Users> usersList = new ArrayList<>();
        usersList.add(users1);
        usersList.add(users2);
        usersList.add(users3);
        usersList.add(users4);
        usersList.add(users5);

        usersList.sort(Comparator.comparingInt(Users::getAge));
        System.out.println(usersList);
        usersList.sort((o1, o2) -> o2.getAge()- o1.getAge());
        System.out.println(usersList);

        usersList.sort(Comparator.comparingInt(user -> user.getName().length()));

        System.out.println(usersList);

        usersList.sort((user1, user2)-> Integer.compare(user2.getName().length(), user1.getName().length()));

        System.out.println(usersList);

        List<String> words = new ArrayList<>();
        words.add("mather");
        words.add("father");
        words.add("sister");
        words.add("brother");
        words.add("girl");
        words.add("archer");
        words.add("budget");
        words.add("rain");
        words.add("chin");
        words.add("patch");
        words.add("album");
        words.add("zero");
        words.add("almost");
        words.add("palm");
        words.add("you");

        Collections.sort(words);
        System.out.println(words);
        words.sort(Collections.reverseOrder());
        System.out.println(words);
    }


}