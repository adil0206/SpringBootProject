package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "prod_table")
public class Product {
	@Id
	@GeneratedValue
	@Column(name = "prod_id")
	private Integer id;	
	@Column(name = "prod_name")
	private String name;
	@Column(name = "prod_cost")
	private Double cost;
	
	
}
