/* NOTICE: All materials provided by this project, and materials derived 
 * from the project, are the property of the University of Texas. 
 * Project materials, or those derived from the materials, cannot be placed 
 * into publicly accessible locations on the web. Project materials cannot 
 * be shared with other project teams. Making project materials publicly 
 * accessible, or sharing with other project teams will result in the 
 * failure of the team responsible and any team that uses the shared materials. 
 * Sharing project materials or using shared materials will also result 
 * in the reporting of all team members for academic dishonesty. 
 */ 
 
package cs4347.hibernateProject.ecomm.entity;

import javax.persistence.*;

import java.sql.Date;

@Entity
@Table (name = "purchase")
public class Purchase 
{
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false, insertable = true, updatable = true)
	private Long id;
	
	@Column(name ="purchaseDate", unique = false, nullable = true, insertable = true, updatable = true)
	private Date purchaseDate;
	
	@Column(name ="purchaseAmount", unique = false, nullable = true, insertable = true, updatable = true)
	private double purchaseAmount;
	
	@ManyToOne
	@JoinColumn( name = "customer")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn( name = "product")
	private Product product;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Date getPurchaseDate()
	{
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate)
	{
		this.purchaseDate = purchaseDate;
	}

	public double getPurchaseAmount()
	{
		return purchaseAmount;
	}

	public void setPurchaseAmount(double purchaseAmount)
	{
		this.purchaseAmount = purchaseAmount;
	}

	public Customer getCustomer()
	{
		return customer;
	}

	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	public Product getProduct()
	{
		return product;
	}

	public void setProduct(Product product)
	{
		this.product = product;
	}

}
