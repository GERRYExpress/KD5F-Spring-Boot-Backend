package krittameth.project.kd5fbackend.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductListId implements Serializable {
    @Column(name = "product_id")
    private int productId;

    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "user_id")
    private int userId;
}