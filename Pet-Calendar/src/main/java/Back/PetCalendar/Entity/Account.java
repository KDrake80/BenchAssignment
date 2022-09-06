package Back.PetCalendar.Entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "tbl_Accounts")
public class Account {
    @Id
    @Column(name = "col_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acc_gen")
    @SequenceGenerator(name="acc_gen", initialValue = 1000, allocationSize = 1)
    private int id;
    private String name;
    private String email;
    private String password;
//    private List<Animal> animals;

    public Account() {
//        this.animals = new ArrayList<>();
    }

    public Account(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
 //       this.animals = new ArrayList<>();
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public List<Animal> getAnimals() {
//        return animals;
//    }

//    public void setAnimals(List<Animal> animals) {
//        this.animals = animals;
//    }
//    public boolean addNewAnimal(Animal a){
//        this.animals.add(a);
//
//        return this.animals.contains(a);
//    }
//    public boolean removeAnimal(String name) {
//        Animal a = null;
//        boolean result = false;
//        for (Animal animal: this.animals) {
//            if (animal.getName().equalsIgnoreCase(name)) {
//                a = animal;
//                this.animals.remove(a);
//                result = true;
//                break;
//            }
//        }
//        return result;
//    }
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
//                ", animals=" + animals +
                '}';
    }
}