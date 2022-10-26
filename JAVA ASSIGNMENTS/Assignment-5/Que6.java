// Q.6] 

import java.util.Scanner;

abstract class Vehicle
{
	int no_of_wheels;
	String fuel_type;
	
	abstract void property();
	abstract void start();
	abstract void stop();
	abstract void workOn();
}

class Jeep extends Vehicle
{
	
	static
	{
		System.out.println("\nVehicle Type :: Jeep");
	}
	
	Jeep()
	{
		no_of_wheels = 4;
		fuel_type = "disel";
	}
	
	void property()
	{
		System.out.println("\nNo of wheels = " + no_of_wheels);
		System.out.println("\nFuel type    = " + fuel_type);
	}
	
	void start()
	{
		System.out.println("\nKey start");
	}
	
	void stop()
	{
		System.out.println("\nKey stop");
	}
	
	void workOn()
	{
		System.out.println("\nWorks on Road");
	}
}

class Ship extends Vehicle
{
	
	static
	{
		System.out.println("\nVehicle Type :: Ship");
	}
	
	Ship()
	{
		no_of_wheels = 0;
		fuel_type = "turbines";
	}

	void property()
	{
		System.out.println("\nNo of wheels = " + no_of_wheels);
		System.out.println("\nFuel type    = " + fuel_type);
	}
	
	void start()
	{
		System.out.println("\nButton start");
	}
	
	void stop()
	{
		System.out.println("\nButton stop");
	}
	
	void workOn()
	{
		System.out.println("\nWorks in Water");
	}
}

class Plane extends Vehicle
{
	static
	{
		System.out.println("\nVehicle Type :: Plane");
	}
	
	Plane()
	{
		no_of_wheels = 8;
		fuel_type = "petrol";
	}
	
	void property()
	{
		System.out.println("\nNo of wheels = " + no_of_wheels);
		System.out.println("\nFuel type    = " + fuel_type);
	}

	void start()
	{
		System.out.println("\nButton start");
	}
	
	void stop()
	{
		System.out.println("\nButton stop");
	}
	
	void workOn()
	{
		System.out.println("\nWorks in Air");
	}
}

class Que6
{
	public static void main(String args[])
	{
		//Vehicle vobj = new Vehicle();			//error
		
		Jeep jeep = new Jeep();
		jeep.property();
		jeep.start();
		jeep.stop();
		jeep.workOn();
		
		Ship ship = new Ship();
		ship.property();
		ship.start();
		ship.stop();
		ship.workOn();
		
		Plane plane = new Plane();
		plane.property();
		plane.start();
		plane.stop();
		plane.workOn();
	}
}
