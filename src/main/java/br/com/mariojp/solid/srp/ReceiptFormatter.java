package br.com.mariojp.solid.srp;

import java.util.Locale;

public class ReceiptFormatter {

	   public String formatReceipt(Order order, double subtotal, double tax, double total) {
	        StringBuilder sb = new StringBuilder();
	        sb.append("Recibo:\n");
	        for (Item item : order.getItems()) {
	            sb.append(item.getName())
	              .append(" - ")
	              .append(String.format(Locale.US, "%.2f", item.getUnitPrice() * item.getQuantity()))
	              .append("\n");
	        }
	        sb.append("Subtotal: ").append(String.format(Locale.US, "%.2f", subtotal)).append("\n");
	        sb.append("Tax: ").append(String.format(Locale.US, "%.2f", tax)).append("\n");
	        sb.append("Total: ").append(String.format(Locale.US, "%.2f", total)).append("\n");
	        return sb.toString();
	    }
	}
