package com.example.demo.contoller;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dao.produitdao;
import com.example.demo.entity.produit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
@RestController
public class prdctcontroller {
    @Autowired
	private produitdao pd;
	
	@RequestMapping(value="/Produits", method=RequestMethod.GET)
public List<produit>listeProduits() {
        return pd.findAll();
    }
@PostMapping(value = "/Produits")
public ResponseEntity<Void> ajouterProduit(@RequestBody produit product) {
    produit productAdded =  pd.save(product);
    if (productAdded == null)
        return ResponseEntity.noContent().build();

    URI location = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(productAdded.getId())
            .toUri();
    return ResponseEntity.created(location).build();
}

}

