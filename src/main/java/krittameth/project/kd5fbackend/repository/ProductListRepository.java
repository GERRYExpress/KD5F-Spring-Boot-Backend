package krittameth.project.kd5fbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import krittameth.project.kd5fbackend.model.ProductList;
import krittameth.project.kd5fbackend.model.ProductListId;
import krittameth.project.kd5fbackend.projection.ProductListProjection;

import java.util.List;


@Repository
public interface ProductListRepository extends JpaRepository<ProductList, ProductListId> {
    @Query(value = "SELECT pl.product_id, STRING_AGG(c.name, ', ') AS category, p.name, p.price, p.poster_url " +
                "FROM product_lists pl " +
                "INNER JOIN products p ON p.product_id = pl.product_id " +
                "INNER JOIN categories c ON c.category_id = pl.category_id " +
                "WHERE c.is_hidden = false " +
                "GROUP BY pl.product_id, p.name, p.price, p.poster_url " +
                "ORDER BY p.name ASC", 
        nativeQuery = true)
    List<ProductListProjection> findAllReleaseProduct();
    List<ProductList> findByProductId(int productId);
    List<ProductList> findByCategoryId(int categoryId);
    List<ProductList> findByUserId(int userId);
}
