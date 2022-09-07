package PizzaStore;

public class SmallMargherita extends MargheritaPizza {


	@Override
	public String adi() {
		return "Margherita Pizza";
	}

	@Override
	public String boyut() {
		return "Küçük Boy";
	}

	@Override
	public float fiyat() {
		return 25.f;
	}

}
