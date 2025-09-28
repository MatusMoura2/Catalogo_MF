package com.mf.catalog.dto;

import java.util.UUID;

import com.mf.catalog.entities.Crochet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CrochetDTO {

	private UUID id;
	private Double price;
	private String urlImg;
	private Double weight;
	private String title;
	private String description;
	private Double size;
	
	public CrochetDTO(Crochet crochet) {
		this.id = crochet.getId();
		this.price = crochet.getPrice();
		this.urlImg = crochet.getUrlImg();
		this.weight = crochet.getWeight();
		this.title = crochet.getTitle();
		this.description = crochet.getDescription();
		this.size = crochet.getSize();
	}
	
	
	
}
