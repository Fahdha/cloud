package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class produit {
		public produit() {
		super();
		// TODO Auto-generated constructor stub
	}
		@Override
		public String toString() {
			return "produit [id=" + id + ", nom=" + nom + ", prix=" + prix + ", getId()=" + getId() + ", getNom()="
					+ getNom() + ", getPrix()=" + getPrix() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
		public produit(Long id, String nom, double prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
	}
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		Long id;
	   public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public double getPrix() {
			return prix;
		}
		public void setPrix(double prix) {
			this.prix = prix;
		}
	String nom;
	   double prix;
	 

}
