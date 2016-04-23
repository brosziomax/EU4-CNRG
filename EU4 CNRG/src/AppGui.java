import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AppGui extends JFrame   {
	
	private List<String> regionen = new ArrayList<String>();
	private ItemListener itemListener;
	
	
	public AppGui(){
		
		itemListener = new ItemListener(){
		@Override
		public void itemStateChanged(ItemEvent e) {
			JCheckBox source = (JCheckBox)e.getItemSelectable();			
			
			if(source.getText().equals("Europe")){
				if (e.getStateChange() == ItemEvent.SELECTED) {
					List<String> eureg = new ArrayList<String>();
					eureg.add("Britain");
					eureg.add("France");
					eureg.add("Germany");
					eureg.add("Iberia");
					eureg.add("Italy");
					eureg.add("Low Countries");
					eureg.add("Scandinavia");
					regionen.addAll(eureg);
				}
					else if (e.getStateChange() == ItemEvent.DESELECTED) {
						
						regionen.remove("Britain");
						regionen.remove("France");
						regionen.remove("Germany");
						regionen.remove("Iberia");
						regionen.remove("Italy");
						regionen.remove("Low Countries");
						regionen.remove("Scandinavia");						
					}
			}
			else if(source.getText().equals("Africa")){
				if (e.getStateChange() == ItemEvent.SELECTED) {
					List<String> afreg = new ArrayList<String>();
					afreg.add("Central Africa");
					afreg.add("East Africa");
					afreg.add("Egypt");
					afreg.add("Horn of Africa");
					afreg.add("Kongo");
					afreg.add("Maghreb");
					afreg.add("South Africa");
					afreg.add("West Africa");
					regionen.addAll(afreg);					
				}
					else if (e.getStateChange() == ItemEvent.DESELECTED) {
					
						regionen.remove("Central Africa");
						regionen.remove("East Africa");
						regionen.remove("Egypt");
						regionen.remove("Horn of Africa");
						regionen.remove("Kongo");
						regionen.remove("Maghreb");
						regionen.remove("South Africa");
						regionen.remove("West Africa");						
				}
			}
			System.out.println(AppGui.this.regionen);
		}
	};
}
		
		public void placeComponents(JPanel panel){
			panel.setLayout(null);
			
			JLabel userLabel = new JLabel("User");
			userLabel.setBounds(10,20,80,25);
			panel.add(userLabel);

		}

		public void boxArray(JPanel panel){
			JCheckBox[] checkBoxes = {new JCheckBox("Europe"), new JCheckBox("Africa"), new JCheckBox("North America"), new JCheckBox("Central America"), new JCheckBox("South America"), new JCheckBox("India")};
			    for (int i = 0; i < checkBoxes.length; i++) {
			        checkBoxes[i].addItemListener(itemListener);
			    	panel.add(checkBoxes[i]);
			        checkBoxes[i].setBounds(i*200+40, 50, 150, 50);
			        
			      
			    }
			JCheckBox[] checkBoxes2 = {new JCheckBox("Persia"), new JCheckBox("East Indies"), new JCheckBox("China"), new JCheckBox("Asia General"), new JCheckBox("Near East"), new JCheckBox("Pacific Islands")};
			    for (int i = 0; i < checkBoxes2.length; i++) {
			    	checkBoxes2[i].addItemListener(itemListener);
			    	panel.add(checkBoxes2[i]);
			        checkBoxes2[i].setBounds(i*200+40, 100, 150, 50);    
		}
	
	}
		public static void main(String[] args) {
			
			AppGui gui = new AppGui();
			JFrame frame = new JFrame("EU4 CNRG");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(800, 800);
			
			JPanel panel = new JPanel();
			frame.add(panel);
			
			gui.placeComponents(panel);
			gui.boxArray(panel);
			frame.setVisible(true);
			
			}
}


