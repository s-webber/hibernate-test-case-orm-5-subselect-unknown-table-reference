package org.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TableTwoEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "three", nullable = true)
	private TableThreeEntity three;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TableThreeEntity getThree() {
		return three;
	}

	public void setThree(TableThreeEntity three) {
		this.three = three;
	}
}
