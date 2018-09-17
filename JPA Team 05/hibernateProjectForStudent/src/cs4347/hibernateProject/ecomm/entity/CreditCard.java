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
@Table( name = "creditcard")
public class CreditCard 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id", unique = true, nullable = false, insertable = true, updatable = true)
	private Long id;
	
	@Column(name ="name", unique = false, nullable = true, insertable = true, updatable = true)
	private String name;
	
	@Column(name ="ccNumber", unique = false, nullable = true, insertable = true, updatable = true)
	private String ccNumber;
	
	@Column(name ="expDate", unique = false, nullable = true, insertable = true, updatable = true)
	private String expDate;
	
	@Column(name ="securityCode", unique = false, nullable = true, insertable = true, updatable = true)
	private String securityCode;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCcNumber()
	{
		return ccNumber;
	}

	public void setCcNumber(String ccNumber)
	{
		this.ccNumber = ccNumber;
	}

	public String getExpDate()
	{
		return expDate;
	}

	public void setExpDate(String expDate)
	{
		this.expDate = expDate;
	}

	public String getSecurityCode()
	{
		return securityCode;
	}

	public void setSecurityCode(String securityCode)
	{
		this.securityCode = securityCode;
	}

}
