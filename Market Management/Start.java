
import classes.*;
import interfaces.*;
import java.lang.*;
import java.util.*;
import java.io.*;
import fileio.*;

public class Start
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		Market m = new Market();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		
        System.out.println("Welcome to our Market Management Application");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?\n");
			System.out.println("   1.Employee Management");
			System.out.println("   2.Shop Management");
			System.out.println("   3.Shop Product Management");
			System.out.println("   4.Product Quantity Add-Sell");
			System.out.println("   5.Exit\n");
			
			
			System.out.println("Your Choice");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				       
					   System.out.println(".................................");
					   System.out.println("You have choosen Employee Managment");
				       
					   System.out.println("Choose any one Option from the followings\n");
					   System.out.println("	 1. Insert New Employee");
					   System.out.println("	 2. Search an Employee");
					   System.out.println("	 3. Remove Existing Employee");
					   
					   System.out.println("	 4. Show All Employees");
					   System.out.println("	 5. Go Back\n");
					
					   System.out.print("Your Option: ");
					   int option1 = sc.nextInt();
					   
					   
					   switch(option1)
					   {
						   case 1:
						          
								  System.out.println("-------------------------");
							      System.out.println("Insert New Employee");
							
							      System.out.print("Enter Employee ID: ");
							      int empId1 = sc.nextInt();
							      System.out.print("Enter Employee Name: ");
							      String name1 = bfr.readLine();
							      System.out.print("Enter Employee Salary: ");
							      double salary1 = sc.nextDouble();
							
							      Employee e1 = new Employee();
							      e1.setEmpId(empId1);
							      e1.setName(name1);
							      e1.setSalary(salary1);
								  
								  
								  m.insertEmployee(e1);
							
							      System.out.println("--------------------------");
							      break;
								  
								  
							case 2:
							       
								   System.out.println("-------------------------");
							       System.out.println("Search an Employee");
								   
								   System.out.print("Enter Employee ID: ");
							       int empId2 = sc.nextInt();
								   
								   Employee e2 = m.getEmployee(empId2);
								   
								   if(e2 !=null)
							        {
								     System.out.println();
								     System.out.println("Employee ID: "+e2.getEmpId());
								     System.out.println("Employee Name: "+e2.getName());
								     System.out.println("Employee Salary: "+e2.getSalary());
								     System.out.println();
							        }
									
									
								
									System.out.println("---------------------------");
							        break;
									
							case 3:
							       
								   System.out.println("--------------------------");
							       System.out.println("Remove an Existing Employee");
							
							       System.out.print("Enter Employee ID: ");
							       int empId3 = sc.nextInt();
							
							       Employee e3 = m.getEmployee(empId3);
							
							       if(e3 != null)
							       {
								    m.removeEmployee(e3);
							       }
								   
								   
							       System.out.println("---------------------------");
							       break;
								   
							case 4:
							
							       System.out.println("-----------------------------");
							       System.out.println("Show All Employees");
							       m.showAllEmployees();
							       System.out.println("----------------------------");
							       break;
								   
								   
							case 5:
							
							       System.out.println("-----------------------------");
							       System.out.println("Going Back......");
							       System.out.println("-----------------------------");
							       break;
								   
								   
							default:
							
							        System.out.println("-------------------------");
							        System.out.println("Invalid Option");
							        System.out.println("--------------------------");
							        break;
							      
					   }
					   
					   System.out.println("..................................");
					   break;
					   
					   
			    case 2:
				       
					   System.out.println(".................................");
					   System.out.println("You have choosen Shop Management");
					   
					   
					
					   System.out.println("Choose any one Option from the followings:\n");
					   System.out.println("	1. Insert New Shop");
					   System.out.println("	2. Search a Shop");
					   System.out.println("	3. Remove Existing Shop");
					   System.out.println("	4. Show All Shop");
					   System.out.println("	5. Go Back\n");
					
					   System.out.print("Your Option: ");
					   int option2 = sc.nextInt();
					   
					   
					   switch(option2)
					   {
						   case 1:
						         
								 System.out.println("-------------------------");
							     System.out.println("Insert New Shop");
							
							     System.out.print("Enter Shop SID: ");
							     String sid1 = bfr.readLine();
							     System.out.print("Enter Shop Name: ");
							     String name1 = bfr.readLine();
							
							
							     Shop s1 = new Shop();
							     s1.setSid(sid1);
							     s1.setName(name1);
						
							     m.insertShop(s1);
							
							     System.out.println("------------------------");
							     break;
								 
							case 2:
							
							        System.out.println("------------------------");
							        System.out.println("Search a Shop");
							
							        System.out.print("Enter Shop SID: ");
							        String sid2 = bfr.readLine();
							
							        Shop s2 = m.getShop(sid2);
							
							        if(s2 !=null)
							        {
								    System.out.println();
								    System.out.println("Shop SID: "+s2.getSid());
								    System.out.println("Shop Name: "+s2.getName());
								    //s2.showAllProducts();
								    System.out.println();
							        }
							
							        System.out.println("-------------------------");
							        break;
									
									
						    case 3:
							
							      System.out.println("---------------------------");
							      System.out.println("Remove an Existing Shop");
							
							      System.out.print("Enter Shop SID: ");
							      String sid3 = bfr.readLine();
							
							      Shop s3 = m.getShop(sid3);
							
							      if(s3 != null)
							      {
								   m.removeShop(s3);
							      }
								  
								  
							      System.out.println("------------------------");
							      break;
								  
							case 4:
							       
								   System.out.println("------------------------");
							       System.out.println("Show All Shops");
							       m.showAllShops();
							       System.out.println("-------------------------");
							       break;
								   
							case 5:
							       
								   System.out.println("--------------------------");
							       System.out.println("Going Back......");
							       System.out.println("--------------------------");
							       break;
								   
							default:
							        
									System.out.println("-------------------------");
							        System.out.println("Invalid Option");
							        System.out.println("-------------------------");
							        break;
					   }
					   
					   System.out.println("..................................");
					   break;
					   
				case 3:
				       
					   System.out.println(".................................");
					   System.out.println("You have choosen Shop Product Management");
					   
					   System.out.println("Choose any one Option from the followings:\n");
					   System.out.println("	1. Insert New Product");
					   System.out.println("	2. Search a Product");
					   System.out.println("	3. Remove Existing Product");
					   System.out.println("	4. Show All Product");
					   System.out.println("	5. Go Back\n");
					   
					   
					   System.out.print("Your Option: ");
					   int option3 = sc.nextInt();
					   
					   switch(option3)
					   {
						   case 1:
						          
								  
						
							System.out.println("----------------------------");
							System.out.println("Insert New Product for a Shop\n");
							
							Product p = null;
							
							System.out.println("Which type of Product do you want to Insert?\n");
							System.out.println("	1. Imported Product");
							System.out.println("	2. Local Product");
							System.out.println("	3. Go Back");
							
							System.out.print("Enter Type: ");
							int type = sc.nextInt();
							
							if(type == 1)
							{
								ImportedProduct ip = new ImportedProduct();
								
								System.out.print("Enter Product PId: ");
								String pid1 = bfr.readLine();
								System.out.print("Enter Product Name: ");
								String name1 = bfr.readLine();
								System.out.print("Enter Available Quantity: ");
								int availableQuantity1=sc.nextInt();
								System.out.print("Enter Product Price: ");
								double price1 = sc.nextDouble();
								System.out.print("Enter Imported Country: ");
								String importedCountry1=bfr.readLine();
								
								ip.setPid(pid1);
								ip.setName(name1);
								ip.setAvailableQuantity(availableQuantity1);
								ip.setPrice(price1);
								ip.setCountryName(importedCountry1);
								
								p = ip;
								
							}
							else if(type == 2)
							{
								LocalProduct lp = new LocalProduct();
								
								
								System.out.print("Enter Product PId: ");
								String pid2 = bfr.readLine();
								System.out.print("Enter Product Name: ");
								String name2 = bfr.readLine();
								System.out.print("Enter Available Quantity: ");
								int availableQuantity2=sc.nextInt();
								System.out.print("Enter Product Price: ");
								double price2=sc.nextDouble();
								System.out.print("Enter Discount Rate: ");
								double discountRate2=sc.nextDouble();
								
								lp.setPid(pid2);
								lp.setName(name2);
								lp.setAvailableQuantity(availableQuantity2);
								lp.setPrice(price2);
								lp.setDiscountRate(discountRate2);
								
								p = lp;
								
							}
							else if(type == 3)
							{
								System.out.println("Going Back.......");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							if(p!= null)
							{
								System.out.print("Enter Shop SID: ");
								String sid4=bfr.readLine();
								m.getShop(sid4).insertProduct(p);
							}
							
							
							System.out.println("-------------------------");
							break;
							
				    case 2: 
					        try{
							System.out.println("-------------------------");
							System.out.println("Search a Product\n");
							
							System.out.print("Enter Shop SID: ");
							String sid5 = sc.next();
							System.out.print("Enter Product Id: ");
							String pid3 = sc.next();
							
							Product p1 = m.getShop(sid5).getProduct(pid3);
							
							if(p1 != null)
							{
								p1.showInfo();
							}
							
							System.out.println("########################");
							break;
                            }
                            catch(Exception e){
                                System.out.println("Exception: "+e);
                            }
							
					case 3:
					
					        System.out.println("-------------------------");
							System.out.println("Remove Existing Product");
							
							System.out.print("Enter Shop SID: ");
							String sid6 = bfr.readLine();
							System.out.print("Enter Product PId: ");
							String pid4=bfr.readLine();
							
							m.getShop(sid6).removeProduct(m.getShop(sid6).getProduct(pid4));
							
							
							System.out.println("---------------------------");
							break;
							
							
					case 4:
					        try{
					        System.out.println("---------------------------");
							System.out.println("Show All Product");
							
							System.out.print("Enter Shop SID: ");
							String sid7 = bfr.readLine();
							
							m.getShop(sid7).showAllProducts();
							
							System.out.println("---------------------------");
							break;
                            }
                            
                            catch(Exception e){
                                System.out.println("Exception: "+e);
                            }
							
							
					case 5:
					         
							 System.out.println("--------------------------");
							 System.out.println("Going Back..");
							 System.out.println("--------------------------");
							 break;
							 
					default:
					         System.out.println("---------------------------");
							 System.out.println("Invalid Option");
							 System.out.println("---------------------------");
							 break;
							
					         
							
					   }
					   
					   System.out.println("..................................");
					   break;
					   
				case 4:
				       
					   System.out.println(".................................");
					   System.out.println("You have choosen Product Quantity Add-Sell");
					   
					   System.out.println("Choose any one Option from the followings:\n");
					   System.out.println("	1. Add Product");
					   System.out.println("	2. Sell Product");
					   System.out.println("	3. Show Add Sell History");
					   
					   System.out.println("	5. Go Back\n");
					   
					   System.out.print("Your Option: ");
					   int option4 = sc.nextInt();
					   
					   switch(option4)
					   {
						   case 1:
						          
								  System.out.println("------------------------");
								  
								  
							      System.out.println("Add Product");
							      System.out.print("Enter Shop SID: ");
							      String sid8 = bfr.readLine();
							      System.out.print("Enter Product PID: ");
							      String pid5=bfr.readLine();
							      System.out.print("Enter Amount Of Product: ");
							      int amount1=sc.nextInt();
								  
								  if(amount1>0)
							      {
								   m.getShop(sid8).getProduct(pid5).addQuantity(amount1);
								   frwd.writeInFile("$"+amount1+" Product Has Been Added "+ m.getShop(sid8).getName());
								   
							      }
								  
							      System.out.println("-----------------------------");
							      break;
								  
							case 2:
							
							       System.out.println("------------------------");
								  
								  
							       System.out.println("Sell Product");
							       System.out.print("Enter Shop SID: ");
							       String sid9 = bfr.readLine();
							       System.out.print("Enter Product PID: ");
							       String pid6=bfr.readLine();
							       System.out.print("Enter Amount Of Product: ");
							       int amount2 = sc.nextInt();
								   
								   
								   if(amount2>0 && amount2<=m.getShop(sid9).getProduct(pid6).getAvailableQuantity())
							       {
								     m.getShop(sid9).getProduct(pid6).sellQuantity(amount2);
								     frwd.writeInFile("$"+amount2+" Product Has Been SOLD "+ m.getShop(sid9).getName());
							       }
								   
							       System.out.println("------------------------------");
							       break;
								   
								   
							case 3:
							       try{
							       System.out.println("-----------------------");
								   
							       System.out.println("Show Add Sell History\n");
							       frwd.readFromFile();
								   
								   
							       System.out.println("\n----------------------");
							       break;
								   }
                                   catch(Exception e){
                                   System.out.println("Exception: "+e);
                                   }
                                   
							case 4:
							
							       System.out.println("----------------------");
							       System.out.println("Going Back");
							       System.out.println("-----------------------");
							       break;
								   
							default:
							        System.out.println("-----------------------");
							        System.out.println("Invalid Option");
							        System.out.println("------------------------");
							        break;
					   }
					   
					   System.out.println("..................................");
					   break;
					   
				case 5:
				       
					   System.out.println(".................................");
					   System.out.println("Exit");
					   repeat = false;
					   System.out.println("..................................");
					   break;
					   
				default:
				       
					   System.out.println("...................................");
					   System.out.println("Invalid Choice");
					   
					   System.out.println("...................................");
					   break;
			}
			
        }
		
		
	}
}