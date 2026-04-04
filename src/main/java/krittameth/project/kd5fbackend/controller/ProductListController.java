package krittameth.project.kd5fbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import krittameth.project.kd5fbackend.model.ProductList;
import krittameth.project.kd5fbackend.service.ProductListService;

@RestController
@RequestMapping("/product/release")
public class ProductListController {
    
    @Autowired
    private ProductListService productListService;

    @GetMapping
    public List<ProductList> getAllProductList() {
        return productListService.getAllProductList();
    }

    @GetMapping("/category/{id}")
    public List<ProductList> getByCategoryId(@PathVariable int id) {
        return productListService.getByCategoryId(id);
    }

    @GetMapping("/user/{id}")
    public List<ProductList> getByUserId(@PathVariable int id) {
        return productListService.getByUserId(id);
    }

    @GetMapping("/{id}")
    public List<ProductList> getByProductId(@PathVariable int id) {
        return productListService.getByProductId(id);
    }
}
