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
    /**
     * Constructor for class CalculatorWindow.
     */
    public CalcWindow() {

        setLayout(new GridLayout(0, 1, 1, 1));

        one = new JButton("1");
        two = new JButton("2");

        add(one);
        add(two);

        setTitle("Calculator 2018");
        setSize(350,500);
        setVisible(true);

        // Ends the program when user closes the window
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}