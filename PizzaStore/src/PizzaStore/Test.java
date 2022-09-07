package PizzaStore;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException{
		
		OrderBuilder builder=new OrderBuilder();
		
		OrderedItems orderedItems=builder.preparePizza();
		
		orderedItems.showItems();
		
		System.out.println("\n");
		System.out.println("Toplam fiyat:" +orderedItems.getCost());
        System.out.println("\n"); 
		builder.buildPizza();
		
        
	}

}
