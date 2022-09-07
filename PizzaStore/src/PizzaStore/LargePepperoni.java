package PizzaStore;

public class LargePepperoni extends PepperoniPizza {

	@Override
	public String adi() {
		return "Pepperoni Pizza";
	}

	@Override
	public String boyut() {
		return "Büyük Boy";
	}

	@Override
	public float fiyat() {
		return 40.f;
	}

}
