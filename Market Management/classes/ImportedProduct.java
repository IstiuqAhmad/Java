package  classes;
import java.lang.*;


public class ImportedProduct extends Product
{
	private String countryName;
	
	public void setCountryName(String countryName)
	{
		this.countryName = countryName;
	}
	
	public String getCountryName( ) 
	{
		return countryName;
	}
	
	public void showInfo()
	{
		System.out.println("Product Id : "+getName());
		System.out.println("Product Name : "+getPid());
		System.out.println("Product Price : "+getPrice());
		System.out.println("Available Quantity : "+getAvailableQuantity());
		
		System.out.println("Country Name : "+countryName);
		System.out.println();
	}   
	
	
}