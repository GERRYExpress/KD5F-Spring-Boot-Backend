package krittameth.project.kd5fbackend.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private int id;

    @OneToMany(mappedBy = "category", cascade = {CascadeType.MERGE})
    @JsonIgnore
    private List<ProductList> productLists = new ArrayList<>();

    @Column(name = "name")
    private String name;

    @Column(name = "isHidden")
    private boolean hidden;
}
