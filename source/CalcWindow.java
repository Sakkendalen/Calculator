import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
/**
 * @author      Anu Malm     <anu.malm@cs.tamk.fi>
 * @version     2018.0924
 * @since       2018.0924
 */
public class CalcWindow extends JFrame {
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
    /**
     * Constructor for class CalculatorWindow.
     */
    public CalcWindow() {

        JPanel outerUI = new JPanel(new BorderLayout(5, 5));
        outerUI.setBorder(new EmptyBorder(4, 4, 4, 4));

        JTextArea screen = new JTextArea(2, 25);
        outerUI.add(screen, BorderLayout.NORTH);

        setContentPane(outerUI);

                        //(rows, cols, hgap, vgap)
        JPanel panelButtons = new JPanel(new GridLayout(4, 4, 4, 4));

        createButtons();
        addButtons(panelButtons);

        outerUI.add(panelButtons, BorderLayout.CENTER);

        setTitle("Calculator 2018");
        setSize(350,500);
        setVisible(true);

        // Ends the program when user closes the window
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
    }

    /**
     * Method for adding all the buttons for a calculator.
     * 
     * Helps to make constructor less cluttered.
     */
    private void addButtons(JPanel panelButtons) {
        panelButtons.add(one);
        panelButtons.add(two);
        panelButtons.add(three);
        panelButtons.add(four);
        panelButtons.add(five);
        panelButtons.add(six);
        panelButtons.add(seven);
        panelButtons.add(eight);
        panelButtons.add(nine);
        panelButtons.add(zero);
        panelButtons.add(plus);
        panelButtons.add(minus);
        panelButtons.add(result);
    }
}