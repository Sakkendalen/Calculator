/**
 * @author
 * @version
 * @since
 */

public class ScreenToResult {

    Functions functions;
    static String result;

    /**
     * Constructor
     */

    public ScreenToResult() {

        functions = new Functions();

    }


    /**
     * Method that calculates data from screen to final result
     */

    public static String calculate(String [] input) {

        String [] calculation = input;

        for(int i = 0; i<calculation.length; i++){
            try{
                Integer.parseInt(calculation[i]);
            }catch(Exception notInt){
                System.out.println("Not an int");
            }
        }

        return result;
    }

}