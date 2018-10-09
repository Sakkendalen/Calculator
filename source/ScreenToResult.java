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
        String result = "";

        String [] calculation = input;
        double [] numbers = new double[calculation.length];

        for(int i = 0; i<calculation.length; i++){
            if(calculation[i].matches(".*\\d+.*")){
                try{
                    numbers[i] = Double.parseDouble(calculation[i]);
                }catch(Exception notInt){
                    System.out.println("Not an int");
                }
            }
            else{
                // numbers[i] = -1;
            }
        }
        for(int i = 0; i<calculation.length; i++){
            if(calculation[i].equals("+")){
                
                result = String.valueOf(Functions.add(numbers));

            } else if(calculation[i].equals("-")){
                double first = numbers[0];
                numbers[0] = 0;
                result = String.valueOf(Functions.substract(first, numbers));

            } else if(calculation[i].equals("+")){

            } else if(calculation[i].equals("+")){

            }
        }

        return result;

    }

}