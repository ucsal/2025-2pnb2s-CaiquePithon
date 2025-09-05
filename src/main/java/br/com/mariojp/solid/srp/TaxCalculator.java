package br.com.mariojp.solid.srp;

public class TaxCalculator {
		
		private final double taxRate;

		public TaxCalculator() {
			
		    String taxRateProp = System.getProperty("tax.rate");
		    this.taxRate = (taxRateProp != null) ? Double.parseDouble(taxRateProp) : 0.10;
		}

		public double calculateTax(double subtotal) {
			
			return subtotal * taxRate;
		}

		public double getTaxRate() {
			
			return taxRate;
		}
		
}
