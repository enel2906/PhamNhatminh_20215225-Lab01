public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public Cart() {
		super();
		this.qtyOrdered = 0;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("Cart reaches maximum quantity of products!");
			return;
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("Product has been added successfully!");
		}
	}
	
	private boolean compareDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (dvd1.getTitle() == dvd2.getTitle() && 
			dvd1.getCategory() == dvd2.getCategory() &&
			dvd1.getDirector() == dvd2.getDirector() &&
			dvd1.getLength() == dvd2.getLength() &&
			dvd1.getCost() == dvd2.getCost()) {
				return true;
		}
		else return false;
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered <= 0) {
			System.out.println("Cart empty, cannot perform products removal!");
			return;
		}
		else {
			for(int i=0; i<qtyOrdered; i++) {
				if(compareDisc(disc, itemsOrdered[i]) == true) {
					DigitalVideoDisc disc_temp = new DigitalVideoDisc();
					itemsOrdered[i] = disc_temp;
					qtyOrdered--;
					System.out.println("Product has been removed successfully!");
					return;
				}
			}
			System.out.println("No product found!");
		}
	}
	
	public float totalCost() {
		float total_cost = 0;
		for (int i=0; i<qtyOrdered; i++) {
			total_cost += itemsOrdered[i].getCost();
		}
		return total_cost;
	}
	
	public void findDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i=0; i<qtyOrdered; i++) {
			if (compareDisc(disc, itemsOrdered[i]) == true) {
				System.out.println(disc + " is in the cart!");
				return;
			}
		}
		System.out.println("Can't found " + disc);
	}
	
	public int getQtyOrdered() {
		return this.qtyOrdered;
	}
}
