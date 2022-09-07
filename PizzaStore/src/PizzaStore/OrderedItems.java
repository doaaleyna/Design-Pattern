package PizzaStore;

import java.util.ArrayList;
import java.util.List;

public class OrderedItems {

	List <Item> items=new ArrayList<Item>();
	
	public void addItems(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost=0.0f;
		   for(Item item:items) {
			cost +=item.fiyat();
		   }
		   return cost;
	}
	
	public void showItems(){
		for(Item item:items) {
		   System.out.println("Ürün adý :"+item.adi());
		   System.out.println("Boyutu :"+item.boyut());
		   System.out.println("Fiyatý :"+item.fiyat());
		   }
		
	}

}
