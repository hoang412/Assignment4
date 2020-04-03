package application;
import java.util.*;

public class ManagementCompany extends java.lang.Object {
	
	private final int MAX_PROPERTY = 5;
	private double mgmFeePer; 
	private String name;
	private Property[] properties;
	private String taxID;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private Plot plot;
	private int index;
	//private List<Property> list = Arrays.asList(properties);
	
	public ManagementCompany() {
		//Maximum properties is 5
		properties = new Property[] {};
		
	}
	
	public ManagementCompany(java.lang.String name, java.lang.String taxID, double mgmFee ) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
	}
	
	public ManagementCompany(java.lang.String name, java.lang.String taxID, double mgmFee, int x, int y, int width, int depth ) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		Plot plot1 = new Plot(x, y, width, depth); // pass to Plot class
		plot = plot1;
		
		
	}
	
	public ManagementCompany(ManagementCompany otherCompany){
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		mgmFeePer = otherCompany.mgmFeePer;
	}
	
	public int getMAX_PROPERTY() {
		return this.MAX_PROPERTY;
	}
	
	/**
	 * add property in properties array
	 * @param property
	 * @return -1 if array is full
	 * 			-2 if property is null
	 * 			-3 if plot is not contain by the MgmtCo plot
	 * 			-4 if plot overlaps
	 *			index of array
	 */
	
	public int addProperty (Property property) {
		//add new property to properties array
	
		properties = new Property[] {property};
		int indexPosition = 0;
		Plot p = new Plot();
		
		for (int i = 0; i < MAX_PROPERTY; i++) {
			properties[i] = property;
		}
		 
		 if (properties.length > MAX_PROPERTY) 
			 return -1; 
		 
		 else if (properties == null)
			 return -2;
		 
		 else if (p.encompasses(plot))
			 return -3;
		 
		 else  if (p.overlaps(plot))
			 return -4;
		 else
		 for(int i = 0; i < properties.length; i++) //look for the array index 
			 if (properties[i] == property)
				 indexPosition = i;
		 
		 return indexPosition;
		
	}
	
	public int addProperty (String name,String city,double rent,String owner) {
		
		Property prop1 = new Property(name, city, rent, owner);
		properties = new Property[] {prop1};
		Plot p2 = new Plot();

		 if (properties.length > MAX_PROPERTY) 
			 return -1; 
		 
		 else if (properties == null)
			 return -2;
		 
		 else if (p2.encompasses(plot))
			 return -3;
		 
		 else  if (p2.overlaps(plot))
			 return -4;
		 else 
			 index = Arrays.asList(properties).indexOf(prop1);
		 	return index;
		
	}
	
	

	public int addProperty(String name,String city,double rent,String owner,int x,int y,int width,int depth) {
		Property prop2 = new Property(name, city, rent, owner, x, y, width, depth);
		properties = new Property[] {prop2};
		Plot p3 = new Plot(x, y, width, depth);
		
		 if (properties.length > MAX_PROPERTY) 
			 return -1; 
		 
		 else if (properties == null)
			 return -2;
		 
		 else if (p3.encompasses(plot))
			 return -3;
		 
		 else  if (p3.overlaps(plot))
			 return -4;
		 else 
			 index = Arrays.asList(properties).indexOf(prop2);
		 	return index;
	}
	
	public double totalRent() {
		double totalRent = 0.0;
		Property rent = new Property();
			for (int i = 0; i < MAX_PROPERTY; i++) {
				totalRent += rent.getRentAmount();
			}
		return totalRent;
	}
	
	
	public double maxRentProp() {
	Property rent = new Property();
	double [] rentArr = new double[] {};
	
	for(int i = 0; i < MAX_PROPERTY; i++) {//add new rent to rent array
		rentArr[i] = rent.getRentAmount(); 
	}
	
		double max = rentArr[0];
		for (int i = 0; i < 5; i++) {
			if (rentArr[i] > max)
				max = rentArr[i];
		}
	return max;	
		
	}
	
	private int maxRentPropertyIndex() {
		double max = maxRentProp();
		int index = 0;
		double [] rentArr = new double[] {};
		Property rent = new Property();
		
		for(int i = 0; i < MAX_PROPERTY; i++) {//add new rent to rent array
			rentArr[i] = rent.getRentAmount(); 
		}
		
		
		for(int i = 0; i < MAX_PROPERTY; i++) 
			if (rentArr[i] == max)
				index = i;
		
		return index;
	}
	
	public java.lang.String displayPropertyAtIndex(int i){
		Property string = new Property();
		String a = null;
		return a;
	}
	
	public java.lang.String toString(){
		String b = null;
		return b;
	}
	
	
	
}
