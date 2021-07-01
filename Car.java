package com.tts.utility;

public class Car {
	
	private String make;
	private String model;
	private String bodyStyle;
	private String modelType;
	private String price;
	private String color;
	
	public Car() {
		
	}
	
	public Car(String make, String model,String price) {
		this.make = make;
		this.model = model;
		this.price = price;
		
	}
	
	public Car(String make, String model, String bodyStyle, String modelType, String price, String color) {
		this.make = make;
		this.model = model;
		this.bodyStyle = bodyStyle;
		this.modelType = modelType;
		this.price = price;
		this.color = color.toUpperCase();
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the bodyStyle
	 */
	public String getBodyStyle() {
		return bodyStyle;
	}

	/**
	 * @param bodyStyle the bodyStyle to set
	 */
	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}

	/**
	 * @return the modelType
	 */
	public String getModelType() {
		return modelType;
	}

	/**
	 * @param modelType the modelType to set
	 */
	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color.toUpperCase();
	}
	
	public boolean isColorMatch(String color)
	{
		
		if (color.toUpperCase().equals(this.getColor())){ 
				return true;
		}
		else 
		{
			    return false;
		}
	}
	
	public String carDetails() {
		
		return (this.getMake() +" " + this.getModel() + " " + this.getBodyStyle() + " " + this.getModelType() + " " + this.getPrice() + " " + this.getColor());
	}
	
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Volve ","S90 ","4DR ","Sedan ","60000","Black");
		System.out.println(car1.getBodyStyle());
		System.out.println(car1.isColorMatch("BLACK"));
		System.out.println(car1.carDetails());
	}
}



