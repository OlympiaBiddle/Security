package com.demo.spring_security.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(unique = true, length = 256, nullable = false)
	private String name;

	@Column(length = 256, nullable = false)
	private String description;

	@Column(length = 256, nullable = false)
	private String category;

	@Column(length = 256, nullable = false, unique = true)
	private String image_path;

	private double price;

	public Product() {
		super();
	}

	public Product(String name, String description, String category, String image_path, float price) {
		super();
		this.name = name;
		this.description = description;
		this.category = category;
		this.image_path = image_path;
		this.price = price;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", image_path=" + image_path + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, description, id, image_path, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && Objects.equals(description, other.description)
				&& Objects.equals(id, other.id) && Objects.equals(image_path, other.image_path)
				&& Objects.equals(name, other.name) && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

}

