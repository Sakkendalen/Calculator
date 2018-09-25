import javax.swing.*;
/**
 * @author      Anu Malm     <anu.malm@cs.tamk.fi>
 * @version     2018.0924
 * @since       2018.0924
 */
public class CalcWindow extends JFrame {
    private JButton one;
    /**
     * Constructor for class CalculatorWindow.
     */
    public CalcWindow() {

        one = new JButton("1");

        add(one);

        setTitle("Calculator 2018");
        setSize(350,500);
        setVisible(true);

        // Ends the program when user closes the window
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}