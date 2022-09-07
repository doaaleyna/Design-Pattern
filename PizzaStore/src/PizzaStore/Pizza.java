package PizzaStore;

public abstract class Pizza implements Item {

	@Override
	public abstract float fiyat();
	
	public abstract void prepare();
	public abstract void bake();
	public abstract void cut();
	public abstract void box();
	public abstract void ready();
	
	public final void buildPizza() {
		prepare();
		bake();
		cut();
		box();
		ready();
	}
}
