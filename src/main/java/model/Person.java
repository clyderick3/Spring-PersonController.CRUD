package model;

import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;

@Entity
@Table(name = "people")
public class Person {
    @Column(name = "fName")
    String firstName;
    @Column(name = "lName")
    String lastName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String idNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
