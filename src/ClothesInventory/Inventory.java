package ClothesInventory;
import java.util.ArrayList;
import java.util.Collections;
public class Inventory 
{
	private ArrayList<Garment> garms;
	//holds the numerical place for each category
	private int [] flags;
	// Logic for ^: Counts per item of each category The sum of each in order will give the placements of each
	public Inventory ()
	{
		garms = new ArrayList<>();
		flags = new int [4];
		
	}
	public void addGarm(Garment g)
	{
		garms.add(g);
	}
	public void addGarm(Garment g,int q)
	{
		for(int i=0;i<q;i++)
		{
			g.incrementStock();
		}
	}
	public void removeGarm(Garment g)
	{
		garms.remove(g);
	}
	public void removeGarm(Garment g,int q)
	{
		for(int i=0;i<q;i++)
		{
			if(g.getQuantity() > 0)
			{
				g.decrementStock();
			}
		}
		if(g.getQuantity() == 0)
		{
			garms.remove(g);
		}
	}
	public Garment searchGarment(String name, String designer)
	{
		Garment temp = null;
		for(Garment e: garms)
		{
			if(e.getName().equalsIgnoreCase(name))
			{
				if(e.getDesigner().equalsIgnoreCase(designer))
				{
					temp = e;
				}
			}
		}
		return temp;
	}
	public Garment searchGarment(String upc)
	{
		Garment temp = null;
		for(Garment e: garms)
		{
			if(e.getbcode().equals(upc))
			{
				temp=e;
			}
		}
		return temp;
	}
	//Sorts in this order: Outerwear,top,pants,acessories 
	public void sortByCategory()
	{
		Collections.sort(garms);
	}
}
