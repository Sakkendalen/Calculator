import javax.swing.*;
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
                        //(rows, cols, hgap, vgap)
        setLayout(new GridLayout(4, 4, 1, 1));

        createButtons();
        addButtons();

        setTitle("Calculator 2018");
        setSize(350,500);
        setVisible(true);

        // Ends the program when user closes the window
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

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

    private void addButtons() {
        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(nine);
        add(zero);
        add(plus);
        add(minus);
        add(result);
    }
}