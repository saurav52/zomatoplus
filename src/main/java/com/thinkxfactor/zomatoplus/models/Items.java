package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_item")
public class Items implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="item_id")
	private Long id;
	
	@Column(name="restaurant_id")
	private Long restaurantId;;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="description")
	private String description;
	
}
