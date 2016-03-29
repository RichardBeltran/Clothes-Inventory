package ClothesInventory;



public class Garment implements Comparable<Garment>
{

	private int SKU;
	private String itemName;
	private String designer;
	private String category;
	private int quantity;
	private UPC bcode;
	
	public Garment(int SKU, String itemName, String designer,String category, int quantity)
	{
		this.SKU = SKU;
		this.itemName = itemName;
		this.designer = designer;
		this.category = category;
		this.quantity = quantity; 
		bcode = null;
		
	}
	public Garment(int SKU, String itemName,String designer)
	{
		this.itemName = itemName;
		this.designer = designer;
		this.category = "misc";
		quantity = 1;
	}
	public int addBarcode(String upc)
	{
			if(upc.length() == 12)
			{
				bcode = new UPC(upc);
				return 1;
				
			}
			return 0;
	}
	public int getSKU()
	{
		return SKU;
	}
	public void setSKU(int SKU)
	{
		this.SKU = SKU;
	}
	public String getName()
	{
		return itemName;
	}
	public void setName(String name)
	{
		itemName = name;
	}
	public String getDesigner()
	{
		return designer;
	}
	public void setDesigner(String designer)
	{
		this.designer = designer;
	}
	public void decrementStock()
	{
		quantity = quantity -1;
	}
	public void incrementStock()
	{
		quantity = quantity+1;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public UPC getbcode()
	{
		return bcode;
	}
	
	//obj1.compareTo(obj2) , Negative = obj1 < obj2

	public int compareTo(Garment o) {
		
		return 0;
	}
}
