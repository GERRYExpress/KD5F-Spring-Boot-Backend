package krittameth.project.kd5fbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "isHidden")
    private boolean hidden;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getHidden() {
        return hidden;
    }

}
