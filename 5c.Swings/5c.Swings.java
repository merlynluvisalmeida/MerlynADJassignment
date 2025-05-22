/*
Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.
  */
package swing5c;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class CountryCapitalListApp {
  public static void main(String[] args) {
      // Frame setup
      JFrame frame = new JFrame("Country and Capitals");
      frame.setSize(400, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new FlowLayout());

      // Array of countries
      String[] countries = {
          "USA", "India", "Vietnam", "Canada", "Denmark",
          "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
      };

      // Mapping countries to capitals
      HashMap<String, String> capitals = new HashMap<>();
      capitals.put("USA", "Washington, D.C.");
      capitals.put("India", "New Delhi");
      capitals.put("Vietnam", "Hanoi");
      capitals.put("Canada", "Ottawa");
      capitals.put("Denmark", "Copenhagen");
      capitals.put("France", "Paris");
      capitals.put("Great Britain", "London");
      capitals.put("Japan", "Tokyo");
      capitals.put("Africa", "Varies by country"); // Africa is a continent
      capitals.put("Greenland", "Nuuk");
      capitals.put("Singapore", "Singapore");

      // Create JList
      JList<String> countryList = new JList<>(countries);
      countryList.setVisibleRowCount(8);
      JScrollPane scrollPane = new JScrollPane(countryList);

      // Add selection listener
      countryList.addListSelectionListener(new ListSelectionListener() {
          public void valueChanged(ListSelectionEvent e) {
              if (!e.getValueIsAdjusting()) {
                  String selectedCountry = countryList.getSelectedValue();
                  String capital = capitals.get(selectedCountry);
                  System.out.println("Capital of " + selectedCountry + " is " + capital);
              }
          }
      });

      // Add to frame
      frame.add(scrollPane);
      frame.setVisible(true);
  }
}
