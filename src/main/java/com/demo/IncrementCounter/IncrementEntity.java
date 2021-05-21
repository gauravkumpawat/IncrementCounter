package com.demo.IncrementCounter;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="Counter")
public class IncrementEntity {

	@Id 
	private int id;
	private long sno;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public IncrementEntity() {
		super();
	}


	public long getSno() {
		return sno;
	}

	public void setSno(long sno) {
		this.sno = sno;
	}

	public IncrementEntity(long sno, int id) {
		super();
		this.sno = sno;
		this.id = id;
	}

	@Override
	public String toString() {
		return "IncrementEntity [sno=" + sno + ", id=" + id + "]";
	}


	
	
}
