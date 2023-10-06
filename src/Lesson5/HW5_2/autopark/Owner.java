package Lesson5.HW5_2.autopark;

import java.util.Objects;

public class Owner {
    private String name;
    private int age;
    private int exp;

    public Owner() {
    }

    public Owner(String name, int age, int exp) {
        this.name = name;
        this.age = age;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Owner owner = (Owner) o;

        if (age != owner.age) return false;
        if (exp != owner.exp) return false;
        return Objects.equals(name, owner.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + exp;
        return result;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", exp=" + exp +
                '}';
    }
}
