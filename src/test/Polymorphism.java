//Overriding 
package test;

class Earth 
{
 void water()
 {
	 System.out.println(" Earth has a lot of water");
 }
}

class India extends Earth
{
	void water()
	{
		System.out.println("India has many rivers");
	}
}
class Polymorphism
{
public static void main (String args[])
{
India Ind = new India();
Ind.water();
Earth Ear =new Earth();
Ear.water();
}
}