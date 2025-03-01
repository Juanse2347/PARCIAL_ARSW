package edu.eci.arsw;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/productos")

public class ProductController {
    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();

    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        getProductById(1);
        getProducts();
        return productService.addProduct(product.getNombre(), product.getPrecio());
    }
}

