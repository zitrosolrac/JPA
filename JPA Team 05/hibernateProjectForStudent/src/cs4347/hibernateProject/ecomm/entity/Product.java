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

@Entity
@Table( name = "product")
public class Product 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id", unique = true, nullable = false, insertable = true, updatable = true)
	private Long id;
	
	@Column(name ="prodName", unique = false, nullable = true, insertable = true, updatable = true)
	private String prodName;
	
	@Column(name ="prodDescription", unique = false, nullable = true, insertable = true, updatable = true)
	private String prodDescription;
	
	@Column(name ="prodCategory", unique = false, nullable = true, insertable = true, updatable = true)
	private int prodCategory;
	
	@Column(name ="prodUPC", unique = false, nullable = true, insertable = true, updatable = true)
	private String prodUPC;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getProdName()
	{
		return prodName;
	}

	public void setProdName(String prodName)
	{
		this.prodName = prodName;
	}

	public String getProdDescription()
	{
		return prodDescription;
	}

	public void setProdDescription(String prodDescription)
	{
		this.prodDescription = prodDescription;
	}

	public int getProdCategory()
	{
		return prodCategory;
	}

	public void setProdCategory(int prodCategory)
	{
		this.prodCategory = prodCategory;
	}

	public String getProdUPC()
	{
		return prodUPC;
	}

	public void setProdUPC(String prodUPC)
	{
		this.prodUPC = prodUPC;
	}

}
