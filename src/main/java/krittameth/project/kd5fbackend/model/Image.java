package krittameth.project.kd5fbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue
    @Column(name = "image_id")
    private int imageId;

    @Column(name = "image_url")
    private String imageURL;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
