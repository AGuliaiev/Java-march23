package Lesson4.HW4_3;

import java.util.Objects;

public class Pet {
    private String View;
    private String breed;

    public Pet() {
    }

    public Pet(String view, String breed) {
        View = view;
        this.breed = breed;
    }

    public String getView() {
        return View;
    }

    public void setView(String view) {
        View = view;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (!Objects.equals(View, pet.View)) return false;
        return Objects.equals(breed, pet.breed);
    }

    @Override
    public int hashCode() {
        int result = View != null ? View.hashCode() : 0;
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "View='" + View + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
