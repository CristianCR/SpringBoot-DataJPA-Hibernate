package es.cristian.example.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class CarRent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "carRents")
    private Set<User> users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarRent carRent = (CarRent) o;
        return id == carRent.id &&
                Objects.equals(name, carRent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
