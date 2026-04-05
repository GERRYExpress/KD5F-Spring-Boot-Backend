package krittameth.project.kd5fbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import krittameth.project.kd5fbackend.model.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer>{
    List<Video> findByProductId(int productId);    
}
