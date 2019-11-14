package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private Date manufactureDate;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct (String name, Double price, Date manufacturedDate) {
		super(name, price);
		this.manufactureDate = manufacturedDate;
	}
	
	public Date getManufactureDate() {
		return manufactureDate;
	}
	
	public void setManufacturedDate(Date manufacturedDate) {
		this.manufactureDate = manufactureDate;
	}
	
	
	@Override
	public String priceTag() {
		return getName()
				+ "(used) $"
				+ getPrice()
				+ "(Manufacture date: "
				+ sdf.format(manufactureDate)
				+ ")";
	}
	
}
