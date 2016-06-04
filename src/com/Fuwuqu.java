package com;

import javax.persistence.*;

@Entity
@Table(name="service")
public class Fuwuqu {
	@Id @Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private long moveOut;
	private long moveIn;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMoveOut() {
		return moveOut;
	}
	public void setMoveOut(long moveOut) {
		this.moveOut = moveOut;
	}
	public long getMoveIn() {
		return moveIn;
	}
	public void setMoveIn(long moveIn) {
		this.moveIn = moveIn;
	}
	
	
}
