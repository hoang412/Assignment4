package application;

public class Property extends java.lang.Object{
	
	private java.lang.String city;
	private java.lang.String owner;
	private java.lang.String propertyName;
	private double rentAmount = 0;
	private Plot plot;
	
	
	public Property() {
		plot = new Plot(0, 0, 1, 1); //default value of x, y, width, depth 
	}
	
	Property(Property p){ //copy constructor
		this.city = p.city;
		this.owner = p.owner;
		this.propertyName = p.propertyName;
		this.rentAmount = p.rentAmount;
		this.plot = p.plot;
	}
	
	public Property(java.lang.String propertyName, java.lang.String city, double rentAmount, java.lang.String owner) {
		setPropertyName(propertyName);
		setCity(city);
		setRentAmount(rentAmount);
		setOwner(owner);
	}
	
	public Property(java.lang.String propertyName, java.lang.String city, double rentAmount, java.lang.String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot (x, y, width, depth); //pass to Plot class
	}
	
	public void setCity(java.lang.String city) {
		this.city = city;
	}
	
	public java.lang.String getCity(){
		return city;
	}
	
	public void setOwner(java.lang.String owner) {
		this.owner = owner;
	}
	
	public java.lang.String getOwner(){
		return owner;
	}
	
	public void setPropertyName(java.lang.String propertyName) {
		this.propertyName = propertyName;
	}
	
	public java.lang.String getPropertyNAme(){
		return propertyName;
	}
	
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	public double getRentAmount() {
		return rentAmount;
	}
	
	public Plot setPlot(int x, int y, int width, int depth) {
		plot = new Plot (x, y, width, depth);
		return plot;
	}
	
	 @Override 
	public java.lang.String toString(){
		System.out.println("Property Name: " + propertyName);
		System.out.println(" Located in "+ city);
		System.out.println(" Belonging to: "+ owner);
		System.out.println(" Mortgage Amount: "+rentAmount);
		
		return ("Property Name: " + propertyName)+ 
				("\n Located in "+ city) +
				("\n Belonging to: "+ owner)+
				("\n Mortgage Amount: "+rentAmount);
		
	}
}
