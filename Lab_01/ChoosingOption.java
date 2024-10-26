import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, 
				"DO you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null, "You've chosen: "
				+ (option == JOptionPane.YES_OPTION? "Yes" : "No"));
		
//		String[] options = {"I do", "I don't"};
//		int choice = JOptionPane.showOptionDialog(null,  "Do you want to change to first class ticker?",
//                "Select an Option",
//                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
//		JOptionPane.showMessageDialog(null, "You've chosen: "
//				+ (choice == 0 ? "Yes" : "No"));
//		
		System.exit(0);
	}
}
