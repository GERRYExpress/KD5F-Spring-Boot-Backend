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
@Table(name = "videos")
public class Video {
    @Id
    @GeneratedValue
    @Column(name = "video_id")
    private int videoId;

    @Column(name = "video_url")
    private String imageURL;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
