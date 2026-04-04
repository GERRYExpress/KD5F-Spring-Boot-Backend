package krittameth.project.kd5fbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import krittameth.project.kd5fbackend.model.ProductList;
import krittameth.project.kd5fbackend.repository.ProductListRepository;

@Service
public class ProductListService {

    @Autowired
    private ProductListRepository productListRepository;

    public List<ProductList> getAllProductList() {
        return productListRepository.findAll();
    }

    public List<ProductList> getByProductId(int productId) {
        return productListRepository.findByProductId(productId);
    }

    public List<ProductList> getByCategoryId(int categoryId) {
        return productListRepository.findByCategoryId(categoryId);
    }

    public List<ProductList> getByUserId(int userId) {
        return productListRepository.findByUserId(userId);
    }
}
