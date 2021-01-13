package enumerations;

public enum EnumFruits {
	
	APPLE(20), BANANA(40), GRAPES(30), AVOCADO(15), APRICOT(5), CHERRY(25);
	
	private int price;
	
	private EnumFruits(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

}
