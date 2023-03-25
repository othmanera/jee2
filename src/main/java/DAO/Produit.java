package DAO;

import java.io.Serializable;

import javax.persistence.*;



//Javax.persistence not hibernate
@Entity 

@Table(name="Produits")
public class Produit implements Serializable{
	@Id
	@Column(name="IdProduit")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reference;
	@Column(length = 50)
	private String designation;
	private Double prix;
	private int qte;
	
	//constructeur
	public Produit(String designation, Double prix, int qte) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.qte = qte;
	}

	public Long getReference() {
		return reference;
	}

	public void setReference(Long reference) {
		this.reference = reference;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	
	
	
}
