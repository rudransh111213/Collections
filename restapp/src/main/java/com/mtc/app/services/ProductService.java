package com.mtc.app.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mtc.app.dao.IProductDAO;
import com.mtc.app.dao.ProductDAO;
import com.mtc.app.vo.Product;

@Path("/productservice")
public class ProductService {
	
	private IProductDAO productDAO;
	
	public ProductService() {
		productDAO = new ProductDAO(); 
	}

	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product get(@PathParam("id") int id) {
		return productDAO.findById(id);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getAll(){
		return productDAO.findProducts();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void addProduct(Product product) {
		System.out.println("****addProduct()***");
		System.out.println(product);
		productDAO.add(product);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateProduct(Product product) {
		System.out.println("****addProduct()***");
		System.out.println(product);
        productDAO.update(product);
	}
	
	@POST
	@Path("/add")
	public void addProduct(@FormParam("id")int id,@FormParam("name")String name,@FormParam("price")float price,@FormParam("description")String description,@FormParam("quantity")int quantity) {
		Product product = new Product(id, name, price, quantity, description);
		
		System.out.println(product);
	}
	

}
