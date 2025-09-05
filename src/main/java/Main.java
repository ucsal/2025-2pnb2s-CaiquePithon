import br.com.mariojp.solid.srp.*;

public class Main {
	
	public static void main(String[] args) {
        Order order = new Order();
        order.add(new Item("Café", 8.00,2));
        order.add(new Item("Bolo", 12.5,1));

        ReceiptService receipt = new ReceiptService();
        
        System.out.println(receipt.generate(order));
    }
}
