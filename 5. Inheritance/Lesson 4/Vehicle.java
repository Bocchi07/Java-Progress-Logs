class Vehicle{
	private String brand;
	private String model;
	private int year;

	public Vehicle(String brand, String model, int year){
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public void displayInfo(){
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year + "\n");
	}

	public String getName(){
		return brand;
	}
}