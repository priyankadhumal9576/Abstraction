
abstract class Food 
{
private  String foodTaste;
private String foodcolour;
 Food(){}
Food(String ft,String fc)
{
	foodTaste=ft;
	foodcolour=fc;	
}
public void showDetails()
{
	System.out.println("the taste is:"+foodTaste);
	System.out.println("Colour of food is:"+foodcolour);
}
  abstract  void prepareFood(String f);
  abstract void shareRecipie();
  
}
class HealthyFood extends Food
{
	HealthyFood()
	{
		super("spicy","red");
	}
	
	public void prepareFood(String food)
	{
		System.out.println("The food is:"+food);
	}
	public void shareRecipie()
	{
		System.out.println("The recipie is complete");
	}
}
class JunkFood extends Food
{
	JunkFood()
	{
		super("sweet","white");
	}
	public void prepareFood(String food)
	{
		System.out.println("The food is:"+food);
	}
	public void shareRecipie()
	{
		System.out.println("The recipie is complicated");
	}
}
