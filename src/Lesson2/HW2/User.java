package Lesson2.HW2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String userName;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    public User(int id, String name, String userName, String email,  String phone, String website) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.website = website;

    }
    public User(int id, String name, String userName, String email, String street, String suit, String city, String zipcode, String lat, String lng, String phone, String website, String nameCompany, String catchPhrase, String bs) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.address = new Address(street, suit, city, zipcode, new Geo(lat, lng));
        this.phone = phone;
        this.website = website;
        this.company = new Company(nameCompany, catchPhrase, bs);

    }


}
