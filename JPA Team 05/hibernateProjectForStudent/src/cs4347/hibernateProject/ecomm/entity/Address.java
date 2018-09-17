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
@Table( name = "address")
public class Address 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id", unique = true, nullable = false, insertable = true, updatable = true)
	private Long id;
	
	@Column(name ="address1", unique = false, nullable = true, insertable = true, updatable = true)
	private String address1;
	
	@Column(name ="address2", unique = false, nullable = true, insertable = true, updatable = true)
	private String address2;
	
	@Column(name ="city", unique = false, nullable = true, insertable = true, updatable = true)
	private String city;
	
	@Column(name ="state", unique = false, nullable = true, insertable = true, updatable = true)
	private String state;
	
	@Column(name ="zipcode", unique = false, nullable = true, insertable = true, updatable = true)
	private String zipcode;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getAddress1()
	{
		return address1;
	}

	public void setAddress1(String address1)
	{
		this.address1 = address1;
	}

	public String getAddress2()
	{
		return address2;
	}

	public void setAddress2(String address2)
	{
		this.address2 = address2;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getZipcode()
	{
		return zipcode;
	}

	public void setZipcode(String zipcode)
	{
		this.zipcode = zipcode;
	}

}
