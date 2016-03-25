package ClothesInventory;
import java.util.ArrayList;
public class Inventory 
{
	private ArrayList<Garment> garms;
	public Inventory ()
	{
		garms = new ArrayList<>();
	}
	public void addGarm(Garment g)
	{
		garms.add(g);
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
	
}
