import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author      Anu Malm     <anu.malm@cs.tamk.fi>
 * @version     2018.0924
 * @since       2018.0924
 */
public class CalcWindow extends JFrame implements ActionListener {
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton zero;
    private JButton plus;
    private JButton minus;
    private JButton result;
    private JButton clear;

    private String screenText;
    private TextArea screen;

    /**
     * Constructor for class CalculatorWindow.
     */
    public CalcWindow() {

        JPanel outerUI = new JPanel(new BorderLayout(5, 5));
        outerUI.setBorder(new EmptyBorder(4, 4, 4, 4));

        screen = new TextArea(2, 25);
        screen.setEditable(false);
        outerUI.add(screen, BorderLayout.NORTH);

        setContentPane(outerUI);

                                        //(rows, cols, hgap, vgap)
        JPanel panelButtons = new JPanel(new GridLayout(4, 4, 1, 1));

        createButtons();
        addButtons(panelButtons);

        outerUI.add(panelButtons, BorderLayout.CENTER);

        setTitle("Calculator 2018");
        setSize(300,400);

        buttonPressCheck();

        setVisible(true);

        // Ends the program when user closes the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    /**
     * Method for creating the buttons needed for a calculator.
     * 
     * Helps to make constructor method less cluttered.
     */
    private void createButtons() {
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");
        plus = new JButton("+");
        minus = new JButton("-");
        result = new JButton("=");
        clear = new JButton("C");
    }

    /**
     * Method for adding all the buttons for a calculator.
     * 
     * Helps to make constructor less cluttered.
     * 
     * @param panelButtons      JPanel that manages the buttons.
     */
    private void addButtons(JPanel panelButtons) {
        panelButtons.add(seven);
        panelButtons.add(eight);
        panelButtons.add(nine);

        panelButtons.add(minus);

        panelButtons.add(four);
        panelButtons.add(five);
        panelButtons.add(six);

        panelButtons.add(plus);

        panelButtons.add(one);
        panelButtons.add(two);
        panelButtons.add(three);

        panelButtons.add(result);

        panelButtons.add(zero);
        panelButtons.add(clear);

    }

    /**
     * Use to send some text to the screen-TextArea.
     * 
     * Keeps track of the buttons user presses.
     */
    private void buttonPressCheck() {
        screenText = "";
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        minus.addActionListener(this);
        plus.addActionListener(this);
        clear.addActionListener(this);
        result.addActionListener(this);
    }

    /**
     * Java's own listener interface's method for receiving action events.
     * 
     * Since this class implements ActionListener, this method is a must. Used to 
     * handle button presses.
     * 
     * @param e             Event that occurs, like mouse click.
     */
    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == one) {
            screenText += "1";
        } else if(e.getSource() == two) {
            screenText += "2";
        } else if(e.getSource() == three) {
            screenText += "3";
        } else if(e.getSource() == four) {
            screenText += "4";
        } else if(e.getSource() == five) {
            screenText += "5";
        } else if(e.getSource() == six) {
            screenText += "6";
        } else if(e.getSource() == seven) {
            screenText += "7";
        } else if(e.getSource() == eight) {
            screenText += "8";
        } else if(e.getSource() == nine) {
            screenText += "9";
        } else if(e.getSource() == zero) {
            screenText += "0";
        } else if(e.getSource() == plus) {
            screenText += "+";
        } else if(e.getSource() == minus) {
            screenText += "-";
        } else if(e.getSource() == clear) {
            screenText = "";
        } else if(e.getSource() == result) {
            //test functionality
            String [] calculation = screenText.split("");
            ScreenToResult.calculate(calculation);
            screenText += " = " + ScreenToResult.calculate(calculation);
        }
        screen.setText(screenText);
    }

}