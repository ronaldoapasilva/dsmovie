package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

	//chave composta
	@EmbeddedId
	private ScorePK2 id = new ScorePK2();
	
	private Double value;
	
	public Score() {		
	}

	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}
	
	public ScorePK2 getId() {
		return id;
	}

	public void setId(ScorePK2 id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
