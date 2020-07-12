package br.com.refactor1;


import br.com.model.Item;
import br.com.model.Order;

public class Main {
	 public static void main( String[] args ) { 
	Notduplicatede feature = new Notduplicatede();
    
    Order order = new Order("Information using Nonduplicated code");
    
    Item item1 = new Item("Computador Dell", 3000.0);
    Item item2 = new Item("Notebook Lenovo", 2000.0);
    Item item3= new Item("Tablet Samsung", 800.0);
    
    order.addItem(item1);
    order.addItem(item2);
    order.addItem(item3);
    
    double start = System.currentTimeMillis();
    
    feature.printOrder(order);
    
    double end = System.currentTimeMillis();
    
    System.out.println("\n\nExecution time: " + (end - start));
}  

}
