package com.mf.catalog.entities.pk;

import java.io.Serializable;

import com.mf.catalog.entities.Crochet;
import com.mf.catalog.entities.User;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class PaymentPk implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="crochet_id")
	private Crochet crochet;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

}
