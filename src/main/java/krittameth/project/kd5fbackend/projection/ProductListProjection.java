package krittameth.project.kd5fbackend.projection;

public interface ProductListProjection {
    Integer getProduct_id();
    String getCategory();
    String getName();
    Double getPrice();
    String getPoster_url();
}