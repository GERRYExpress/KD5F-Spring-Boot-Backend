package krittameth.project.kd5fbackend.model;

import java.time.LocalDate;
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
@Table(name = "accounts")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private int id;

    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "total_spend")
    private double totalSpend;

    @Column(name = "total_game")
    private int totalGame;

    @Column(name = "total_sale")
    private double totalSale;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.MERGE})
    @JsonIgnore
    private List<ProductList> productLists = new ArrayList<>();
}
