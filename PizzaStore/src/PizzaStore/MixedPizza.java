package PizzaStore;

public abstract class MixedPizza extends Pizza {

	@Override
	public abstract String adi();
	@Override
	public abstract String boyut();
	@Override
	public abstract float fiyat();
	@Override
	public void prepare() {	
	}

	@Override
	public void bake() {
	}

	@Override
	public void cut() {
	}

	@Override
	public void box() {	
	}

	@Override
	public void ready() {	
	}	
}
