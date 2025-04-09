import java.util.Scanner;
class vehicle{
	int mileage;
	double price;
	vehicle(int mileage,double price)
	{
	this.mileage=mileage;
	this.price=price;
	}
	void display()
	{
	System.out.println("mileage: "+mileage);
	System.out.println("price: "+price);
	}
}
class car extends vehicle{
	double ownercost;
	int warranty,scapacity;
	String fueltype;
	car(int mileage,double price,double ownercost,int warranty,int scapacity,String fueltype)
	{
	super(mileage,price);
	this.ownercost=ownercost;
	this.warranty=warranty;
	this.scapacity=scapacity;
	this.fueltype=fueltype;
	}	
	void display()
	{
	super.display();
	System.out.println("ownercost: "+ownercost);
	System.out.println("seating_capacity: "+scapacity);
	System.out.println("warranty: "+warranty);
	System.out.println("fueltype: "+fueltype);
	}
}
class maruthi extends car{
	int model;
	maruthi(int mileage,double price,double ownercost,int warranty,int scapacity,String fueltype,int model)
	{
	super(mileage,price,ownercost,warranty,scapacity,fueltype);
	this.model=model;
	}
	void display()
	{
	super.display();
	System.out.println("model:"+model);
	}
}
class vehiclemain{
	public static void main(String args[])
	{
	int mil,warr,scapacity,model,n,i;
	double price,oc;
	String fueltype;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of maruthi cars: ");
	n=sc.nextInt();
	maruthi m1[]=new maruthi[n];
	for(i=0;i<n;i++)
	{
	System.out.println("Enter mileage:");
	mil=sc.nextInt();
	System.out.println("price:");
	price=sc.nextDouble();
	System.out.println("ownership_cost:");
	oc=sc.nextDouble();
	System.out.println("warranty:");
	warr=sc.nextInt();
	System.out.println("seating_capacity:");
	scapacity=sc.nextInt();
	System.out.println("Fuel_type:");
	fueltype=sc.next();
	System.out.println("model_type:");
	model=sc.nextInt();
	m1[i]=new maruthi(mil,price,oc,warr,scapacity,fueltype,model);
	}
	for(i=0;i<n;i++)
	{
	System.out.println("");
	System.out.println("maruthi car: "+(i+1));
	m1[i].display();
	}
	}
}
















