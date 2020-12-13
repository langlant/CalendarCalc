/*
 * Anthony Langley
 * CIS 611
 * Fall 2020
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {
	
	private JLabel calendarTitle = new JLabel("Calendar Calculator");
	private JLabel formatTitle = new JLabel("Please format the date: dd/mm/yyy");
    private JLabel initDate = new JLabel("Initial Date: ");
    private JLabel prevDate = new JLabel("Previous Date: ");
    private JLabel nextDate = new JLabel("Next Date: ");
    private JLabel numShop = new JLabel("Number of Shopping Days Until Christmas: ");
    private JLabel zodiac = new JLabel("Zodiac: ");
    private JFrame frame = new JFrame();
    private JLabel error = new JLabel();
    private JTextField input = new JTextField(10);

    public GUI() {
    	
    	
        // the clickable button
        JButton button = new JButton("Calculate");
        button.addActionListener(this);
        
        JButton clear = new JButton("Clear");
        clear.addActionListener(this);;

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(calendarTitle);
        panel.add(formatTitle);
        panel.add(input);
        panel.add(button);
        panel.add(initDate);
        panel.add(prevDate);
        panel.add(nextDate);
        panel.add(numShop);
        panel.add(zodiac);
        panel.add(error);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }

    // process the button
    public void actionPerformed(ActionEvent e) {
        String var = input.getText();
        
        if(isFormat(var) == true){
            initDate.setText("Initial Date: " + CalendarCalc.finalDate(var));
            prevDate.setText("Previous Date: " + CalendarCalc.previousDate(var));
            nextDate.setText("Next Date: " + CalendarCalc.nextDate(var));
            numShop.setText("# of Shopping Days 'til Xmas: " + CalendarCalc.getNumShopping(var));
            zodiac.setText("Zodiac: " + CalendarCalc.getZodiac(var));
        	error.setText("Success!");
        } else if(isFormat(var) == false) {
            initDate.setText("Initial Date: " );
            prevDate.setText("Previous Date: ");
            nextDate.setText("Next Date: ");
            numShop.setText("# of Shopping Days 'til Xmas: ");
            zodiac.setText("Zodiac: ");
        	error.setText("Error: not a valid format! Must be dd/mm/yyy!");
        }


    }

    public boolean isFormat(String input) {
    	try {
    		if(input.length() == 10) {
	    		String check = input.substring(0, 2) + input.substring(3, 5) + input.substring(6,10);
	    		int date = Integer.parseInt(check);
	    		return true;
    		} else if(input.length() < 10) {
    			return false;
    		} else if(input.length() > 10) {
    			return false;
    		} else {
    			return false;
    		}
    	} catch(NumberFormatException e){
    		return false;
    	}
    }
    // create one Frame
    public static void main(String[] args) {
        new GUI();
    }
}