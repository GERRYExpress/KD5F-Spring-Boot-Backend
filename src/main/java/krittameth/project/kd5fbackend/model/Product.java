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
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private int id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;
    
    @Column(name = "poster_url")
    private String poster_url;

    @OneToMany(cascade = {CascadeType.MERGE})
    @JsonIgnore
    private List<Image> images = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.MERGE})
    @JsonIgnore
    private List<Video> videos = new ArrayList<>();

    // Map to Associative Entity (product_lists)
    @OneToMany(mappedBy = "product", cascade = {CascadeType.MERGE})
    @JsonIgnore
    private List<ProductList> productLists = new ArrayList<>();
}