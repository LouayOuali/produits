package com.louay.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.louay.produits.entities.Produit;
import com.louay.produits.service.ProduitService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTControllers {
	
	@Autowired
	ProduitService produitService;
	
	@RequestMapping(method = RequestMethod.GET)
	List<Produit> getAllProduit() {
		return produitService.getAllProduits();
	}
} 

