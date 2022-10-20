
public class FoodHabits {

	public static void main(String[] args)
	{
		HealthyFood h=new HealthyFood();
		h.showDetails();
		h.prepareFood("pavbhaji");
		h.shareRecipie();
		
		JunkFood j=new JunkFood();
		j.showDetails();
        j.prepareFood("pizza");	
        j.shareRecipie();

	}

}
