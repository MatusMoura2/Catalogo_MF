package com.mf.catalog.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_crochet")
public class Crochet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "url_img")
	private String urlImg;
	
	@Column(name = "weight")
	private Double weight;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "descripiton")
	private String description;
	
	@Column(name = "size")
	private Double size;
	
	public Crochet(UUID id, Double price, Double weight, String title, String description, Double size, String urlImg) {
		this.id = id;
		this.price = price;
		this.urlImg = urlImg;
		this.weight = weight;
		this.title = title;
		this.description = description;
		this.size = size;
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
