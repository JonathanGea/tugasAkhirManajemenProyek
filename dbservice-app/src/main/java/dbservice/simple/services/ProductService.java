/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbservice.simple.services;

import dbservice.simple.entities.Product;
import dbservice.simple.repos.ProductRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vyor
 */
@Service
public class ProductService {
    
    @Autowired
    private ProductRepo productRepo;
    
    public List<Product> finds(){
        return productRepo.findAll();
    }
}
