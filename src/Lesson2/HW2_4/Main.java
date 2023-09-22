package Lesson2.HW2_4;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Max", "Petrov", "petr@gmail.com", 35, Gender.MALE, new Car("BMW", 2010, 200));

        user.getSkills().add(new Skill("JS", 8));
        user.getSkills().add(new Skill("JAVA", 9));
        user.getSkills().add(new Skill("PYTHON", 10));
        System.out.println(user);
    }
}
