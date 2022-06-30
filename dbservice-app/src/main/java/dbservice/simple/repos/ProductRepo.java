/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbservice.simple.repos;

import dbservice.simple.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Vyor
 */
@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{
    
}