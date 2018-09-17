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

import java.sql.Date;


import javax.persistence.*;


@Entity
@Table( name = "customer")

public class Customer 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false, insertable = true, updatable = true)
	private Long id;
	
	@Column(name = "firstName", unique = false, nullable = true, insertable = true, updatable = true)
	private String firstName;
	
	@Column(name = "lastName", unique = false, nullable = true , insertable = true, updatable = true)
	private String lastName;
	
	@Column(name = "gender", unique = false, nullable = true, insertable = true, updatable = true)
	private Character gender;
	
	@Column(name = "dob", unique = false, nullable = true, insertable = true, updatable = true)
	private Date dob;
	
	@Column(name = "email", unique = false, nullable = true, insertable = true, updatable = true)
	private String email;
	
	@OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
	private Address address;
	
	@OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
	private CreditCard creditCard;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public Character getGender()
	{
		return gender;
	}

	public void setGender(Character gender)
	{
		this.gender = gender;
	}

	public Date getDob()
	{
		return dob;
	}

	public void setDob(Date dob)
	{
		this.dob = dob;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public CreditCard getCreditCard()
	{
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard)
	{
		this.creditCard = creditCard;
	}
}
