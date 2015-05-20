package com.jshop.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the serial_t database table.
 * 
 */
@Entity
@Table(name="serial_t")
@NamedQuery(name="SerialT.findAll", query="SELECT s FROM SerialT s")
public class SerialT implements Serializable {
	private static final long serialVersionUID = 1L;
	private String biz;
	private String head;
	private int increment;
	private String lastid;
	private Date updatetime;

	public SerialT() {
	}


	@Id
	@Column(unique=true, nullable=false, length=45)
	public String getBiz() {
		return this.biz;
	}

	public void setBiz(String biz) {
		this.biz = biz;
	}


	@Column(length=20)
	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
	}


	@Column(nullable=false)
	public int getIncrement() {
		return this.increment;
	}

	public void setIncrement(int increment) {
		this.increment = increment;
	}


	@Column(nullable=false, length=20)
	public String getLastid() {
		return this.lastid;
	}

	public void setLastid(String lastid) {
		this.lastid = lastid;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

}