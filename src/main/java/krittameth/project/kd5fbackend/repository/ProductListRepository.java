package krittameth.project.kd5fbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import krittameth.project.kd5fbackend.model.ProductList;
import krittameth.project.kd5fbackend.model.ProductListId;

import java.util.List;


@Repository
public interface ProductListRepository extends JpaRepository<ProductList, ProductListId> {
    List<ProductList> findByProductId(int productId);
    List<ProductList> findByCategoryId(int categoryId);
    List<ProductList> findByUserId(int userId);
}
