import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AppGui extends JFrame   {

	
	public static void main(String[] args) {
		

		JFrame frame = new JFrame("EU4 CNRG");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		placeComponents(panel);
		boxArray(panel);
		frame.setVisible(true);
		
		}
		
		public static void placeComponents(JPanel panel){
			panel.setLayout(null);
			
			JLabel userLabel = new JLabel("User");
			userLabel.setBounds(10,20,80,25);
			panel.add(userLabel);

		}
		
		public static void boxArray(JPanel panel){
			JCheckBox[] checkBoxes = {new JCheckBox("Europe"), new JCheckBox("Africa"), new JCheckBox("North America"), new JCheckBox("Central America"), new JCheckBox("South America"), new JCheckBox("India")};
			    for (int i = 0; i < checkBoxes.length; i++) {
			        panel.add(checkBoxes[i]);
			        checkBoxes[i].setBounds(i*200+40, 50, 150, 50);
			    }
			JCheckBox[] checkBoxes2 = {new JCheckBox("Persia"), new JCheckBox("East Indies"), new JCheckBox("China"), new JCheckBox("Asia General"), new JCheckBox("Near East"), new JCheckBox("Pacific Islands")};
			    for (int i = 0; i < checkBoxes2.length; i++) {
			        panel.add(checkBoxes2[i]);
			        checkBoxes2[i].setBounds(i*200+40, 100, 150, 50);    
		}
	
	}
}


