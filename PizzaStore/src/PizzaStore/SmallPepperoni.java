package PizzaStore;

public class SmallPepperoni extends PepperoniPizza {


	@Override
	public String adi() {
		return "Pepperoni Pizza";
	}

	@Override
	public String boyut() {
		return "Küçük Boy";
	}

	@Override
	public float fiyat() {
		return 24.f;
	}

}
