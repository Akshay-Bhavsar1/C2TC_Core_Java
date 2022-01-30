
abstract class Vehicle   //partially implemented class
{
	public abstract void NoOfWheels();
	
	public abstract void m();


	
}

abstract class Scooty extends Vehicle
{
	public void NoOfWheels()
	{
		System.out.println(2);
	}
	
	public abstract void m();
}
 
public class Abstract_Demo 
{

	public static void main(String[] args) 
	{

		//Scooty a = new Scooty();

		//Scooty Activa = new Scooty();
//			Activa.NoOfWheels();

	}

}

