package com.mf.catalog.entities;

import com.mf.catalog.entities.pk.PaymentPk;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_payment")
public class Payment {
	
	@EmbeddedId
	private PaymentPk id = new PaymentPk();
	
	public void setCrochet (Crochet crochet) {
		id.setCrochet(crochet);
	}
	
	public void setUser (User user) {
		id.setUser(user);
	}
}
