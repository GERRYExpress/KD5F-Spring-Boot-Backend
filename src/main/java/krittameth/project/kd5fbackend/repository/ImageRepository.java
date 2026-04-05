package krittameth.project.kd5fbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import krittameth.project.kd5fbackend.model.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer>{
    List<Image> findByProductId(int productId);
}
