/*
Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display them on console whenever the countries are selected on the list.
*/

package swing5a;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.List;
public class CountryListApp extends JFrame {

	    // List of countries
	    String[] countries = {
	        "USA", "India", "Vietnam", "Canada", "Denmark",
	        "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
	    };

	    public CountryListApp() {
	        setTitle("Country List Example");
	        setSize(300, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        // Create JList and enable multiple selection
	        JList<String> countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Add ListSelectionListener to handle selection events
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                // To avoid processing twice
	                if (!e.getValueIsAdjusting()) {
	                    List<String> selected = countryList.getSelectedValuesList();
	                    System.out.println("Selected countries:");
	                    for (String country : selected) {
	                        System.out.println(country);
	                    }
	                    System.out.println("------");
	                }
	            }
	        });

	        // Add components
	        add(new JLabel("Select countries:"), BorderLayout.NORTH);
	        add(scrollPane, BorderLayout.CENTER);

	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new CountryListApp();
	    }
	}
