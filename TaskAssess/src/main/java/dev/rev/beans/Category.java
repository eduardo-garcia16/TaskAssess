package dev.rev.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {

	@Id
	@GeneratedValue(generator = "cat_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "cat_seq", sequenceName = "cat_seq", allocationSize = 1)
	@Column(updatable = false, name = "ID")
	private int id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "COLOR")
	private String color;

	public Category() {
		super();
	}

	public Category(int id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}

	public Category(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
	
	
}
