package application;

import com.sun.javafx.geom.Rectangle;

public class Plot {
	
	private int x; //horizon coordinate
	private int y; //vertical coordinate
	private int depth; //horizon size
	private int width; //Vertical size
	
	public Plot(){
		x = 0; 
		y = 0; 
		depth = 1; 
		width = 1; 
		
	}
	
	public Plot (Plot p) { //Copy constructor
		x = p.x;
		y = p.y;
		width = p.width;
		depth = p.depth;
	}
	
	public Plot(int x, int y, int width, int depth) {
		setX(x);
		setY(y);
		setWidth(width);
		setDepth(depth);
	}
	
	/**
	 * check if this 2 plot are overlap 
	 * @param plot
	 * @return true if plot overlap 
	 * @return false if plots are not overlap
	 */
	public boolean overlaps(Plot plot) {
		
		//check if rectangles are not overlap
		if ( x < plot.x + plot.width && x + width > plot.x && y < plot.y + plot.depth && y + depth > plot.y) 
			return false;
		//if rectangles are overlap
		else 
			return true;
	}
		
	/**
	 * This method check if one rectangle is inside another rectangle 
	 * @param plot
	 * @return true if this plot inside the parameter
	 * @return false if plot is not entirely inside parameter
	 */
	
	public boolean encompasses(Plot plot) {
		if( new Rectangle(x, y, width, depth).contains(plot.getX(), plot.getY(), plot.getWidth(), plot.getDepth()))
			return true;
		else 
			return false;
	}

	
	public void setX(int x) {
		this.x = x;
	}
	
	
	public int getX() {
		return this.x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public int getDepth() {
		return this.depth;
	}
	
	@Override
	public java.lang.String toString(){
		Property display = new Property();
		display.toString();
		
		return("Upper left: (" + x + ","+ y +")"+"; "+"Width: "+width+ " Depth: "+depth);
		
	}
}
