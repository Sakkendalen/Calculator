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
        int [] numbers = new int[calculation.length];

        System.out.println(calculation.length);
        System.out.println(numbers.length);

        for(int i = 0; i<calculation.length; i++){
            if(calculation[i].matches(".*\\d+.*")){
                try{
                    System.out.println("moi");
                    numbers[i] = Integer.parseInt(calculation[i]);
                }catch(Exception notInt){
                    System.out.println("Not an int");
                }
            }
        }

        return result;
    }

}