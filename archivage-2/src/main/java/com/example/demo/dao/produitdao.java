package com.example.demo.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.*;
public interface produitdao extends JpaRepository<produit, Long> {

	

}
