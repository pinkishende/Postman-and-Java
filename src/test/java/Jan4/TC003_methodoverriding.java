package Jan4;

class swipemachine
{
	void readCard() 
	{
		System.out.println("Swipe the card");
	}
}

class chipcarmachine extends swipemachine
{
	void readCard()
	{
		System.out.println("Chipcard");
	}
}
public class TC003_methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swipemachine sm= new swipemachine();
		sm.readCard();
		sm = new chipcarmachine();
		sm.readCard();
		}

}
