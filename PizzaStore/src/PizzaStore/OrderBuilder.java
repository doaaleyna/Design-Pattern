package PizzaStore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder extends Pizza {
      
	

	public OrderedItems preparePizza() throws IOException{
		OrderedItems itemsOrder= new OrderedItems();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("****Pizza Store****");
		System.out.println("\n");
		System.out.println("Pizza se�iminizi yap�n�z...");
		System.out.println("    1-Margherita Pizza");
		System.out.println("    2-Pepperoni Pizza");
		System.out.println("    3-Kar���k Pizza");
		System.out.println("\n\n");
		 
		int pizzaandcolddrinkchoice=Integer.parseInt(br.readLine());  

		switch(pizzaandcolddrinkchoice) 
		{
		    case 1:{
			System.out.println("Margherita pizza sipari� ettiniz.");
			System.out.println("\n\n");
			System.out.println("Pizzan�n boyutunu se�iniz:");
			System.out.println("------------------------------");  
			System.out.println("      1-K���k Boy");
			System.out.println("      2-Orta Boy ");
			System.out.println("      3-B�y�k Boy ");
		    System.out.println("------------------------------");  
		    
		    int margheritapizzasize=Integer.parseInt(br.readLine());  
		     switch(margheritapizzasize) {
		     case 1:
		    	 itemsOrder.addItems(new SmallMargherita());
		    	 
		    	 break;
		     case 2:
		    	 itemsOrder.addItems(new MediumMargherita());
		    	 
		    	 break;
		     case 3:
		    	 itemsOrder.addItems(new LargeMargherita());
		    	 
		    	 break;     	 
		     }
		        
		      } 
		    break;
		    
		    case 2:{
		    	System.out.println("Pepperoni Pizza sipari� ettiniz.");
		    	System.out.println("\n\n");
				System.out.println("Pizzan�n boyutunu se�iniz:");
				System.out.println("------------------------------");  
				System.out.println("      1-K���k Boy");
				System.out.println("      2-Orta Boy ");
				System.out.println("      3-B�y�k Boy ");
			    System.out.println("------------------------------");  
			    
			    int pepperonipizzasize=Integer.parseInt(br.readLine());
			    
			    switch(pepperonipizzasize) {
			    case 1:
			    	itemsOrder.addItems(new SmallPepperoni());
			    	break;
			    case 2:
			    	itemsOrder.addItems(new MediumPepperoni());
			    	break;	
			    case 3:
			    	itemsOrder.addItems(new LargePepperoni());
			    	break;
			    }
		    	
		    }
		    break;
		    case 3:{
		    	System.out.println("Kar���k pizza sipari� ettiniz.");
				System.out.println("/n/n");
				System.out.println("Pizzan�n boyutunu se�iniz:");
				System.out.println("------------------------------");  
				System.out.println("      1-K���k Boy");
				System.out.println("      2-Orta Boy ");
				System.out.println("      3-B�y�k Boy ");
			    System.out.println("------------------------------"); 
			    
			    int mixedpizzasize=Integer.parseInt(br.readLine());  
			    switch(mixedpizzasize) {
			    case 1:
			    	itemsOrder.addItems(new SmallMixed());
			    	break;
			    case 2:
			    	itemsOrder.addItems(new MediumMixed());
			    	break;
			    case 3:
			    	itemsOrder.addItems(new LargeMixed());
			    	break;
			    }
		    }
		    break;
		}
		
		    System.out.println("��ecek se�imini yap�n�z. ");    
	        System.out.println("============================");  
	        System.out.println("      1. Cola  ");  
	        System.out.println("      2. Ice-Tea        ");  
	        System.out.println("      3. Exit             ");  
	        System.out.println("============================"); 
	        
	        int coldDrink=Integer.parseInt(br.readLine());  
	        switch(coldDrink) 
	        {
	            case 1:{
	            	System.out.println(" Cola se�imi yapt�n�z. ");  
                    System.out.println(" ��ece�inizin boyutunu se�iniz.");  
                    System.out.println("------------------------");  
                    System.out.println("    1. K���k Boy-250 ml ");  
                    System.out.println("    2. B�y�k Boy-450 ml ");   
                    System.out.println("------------------------"); 
                    
                    int cokesize=Integer.parseInt(br.readLine());
                    switch(cokesize)  
                    {  
                        case 1:  
                         itemsOrder.addItems(new SmallCoke());  
                         break;     
                        case 2:  
                         itemsOrder.addItems(new LargeCoke());  
                         break;            
                      }
	            }
	            break;
	            case 2:{
	            	System.out.println(" Ice-Tea se�imi yapt�n�z. ");  
                    System.out.println(" ��ece�inizin boyutunu se�iniz.");  
                    System.out.println("------------------------");  
                    System.out.println("    1. K���k Boy-330ml ");  
                    System.out.println("    2. B�y�k Boy-500 ml ");   
                    System.out.println("------------------------"); 
                    
                    int iceteasize=Integer.parseInt(br.readLine());
                    switch(iceteasize)
                    {
                       case 1:  
                        itemsOrder.addItems(new SmallIceTea());  
                        break;     
                       case 2:  
                        itemsOrder.addItems(new LargeIceTea());  
                        break; 
                    }
	            }
	            break;
	            default:{
	            	break;
	            }
	        }
 return itemsOrder;	
	}

	@Override
	public String adi() {
		return null;
	}

	@Override
	public String boyut() {
		return null;
	}

	@Override
	public float fiyat() {
		return 0;
	}

	@Override
	public void prepare() {
		System.out.println("Sipari�iniz haz�rlan�yor...");
	}
	@Override
	public void bake() {
		System.out.println("Pi�iriliyor...");
	}
	@Override
	public void cut() {
		System.out.println("Dilimleniyor...");
	}
	@Override
	public void box() {
		System.out.println("Paketleniyor..");
	}
	@Override
	public void ready() {
		System.out.println("Sipari�iniz haz�r...");
	}

	
}
