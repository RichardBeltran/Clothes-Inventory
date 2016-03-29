package ClothesInventory;

import java.awt.TextArea;
import java.awt.Button;
import java.util.ArrayList;
import javax.swing.JFrame;

public class InventoryGUI
{
	private JFrame frame;
	private TextArea text;
	private Button goToScanBarcode;
	
	private InventoryManagement im;
	public InventoryGUI(InventoryManagement im)
	{
		this.im = im;
		createGUI();
		frame.setVisible(true);
		
	}
	private void createGUI()
	{
		frame = new JFrame("Inventory System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		text = new TextArea();
		text.setEditable(false);
		frame.getContentPane().add(text);
		//text.setText(t);
	}
}
