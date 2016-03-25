package ClothesInventory;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileNotFoundException; 


// RichardBeltran 
// Manages an Inventory object, handles main file carries out changes to any Garments
public class InventoryManagement 
{
	Inventory myInv;
	private ArrayList <UPC> upcs;
	Scanner fileIn;
	File data;
	//constructor requires a file to be passed to intiate myInv
	public InventoryManagement(File in) throws FileNotFoundException
	{
		myInv = new Inventory();
		upcs = new ArrayList<>();
		data = in;
		fileIn = new Scanner(in);
		while(fileIn.hasNext())
		{
			StringTokenizer st = new StringTokenizer(fileIn.next(),",");
			String iName = st.nextToken();
			String dName = st.nextToken();
			String oName = st.nextToken();
			String q = st.nextToken();
			if(st.hasMoreTokens())
			{
				String sku = st.nextToken();
				if(st.hasMoreTokens())
				{
					String upc  = st.nextToken();
					
				}
				else
				{
					
				}
			}
			else
			{
				
			}
		}
		fileIn.close();
		
	}
	//Add Garment using completed information
	public void addGarment(String n,String d,String c,String s,String u)
	{
		
	}
	
	//will add Garment using name,designer,category then prompt user to add UPC
	public void addGarment(String n,String d,String c,String s)
	{
		
	}
	//add Garment, generates a SKU
	public void addGarment(String n,String d,String c)
	{
		
	}
	//Check is UPC is used (only used internally)
	private boolean checkUPC(String upc)
	{
		for(UPC e: upcs)
		{
			if(e.getBarcode().equals(e))
			{
				return false;
			}
		}
		return true;
	}
	//Scan in an item
	public void scanIn(String upc)
	{
		if(checkUPC(upc))
		{
			
		}
	}
	//scan out an item
	public void scanOut(String upc,int q)
	{
		if(checkUPC(upc))
		{
			Garment temp = myInv.searchGarment(upc);
			myInv.removeGarm(temp, q);
			updateQuantity(temp);
		}
	}
	//writes onto file, Locates item by name then designer changes item 
	public void updateQuantity(Garment s)
	{
		
	}
	//writes a new line in file for a new item
	public void writeNewItem(Garment s)
	{
		
	}
	
}
