package calculator;

public class StringCalculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else{
			String delimiter = ",";
			String numList[] = splitNumbers(text, delimiter+ "|\n"); 
			return sum(numList);
			}
			
			
		}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers, String divider){
	    return numbers.split(divider);
	}

	private static int sum(String[] numbers){
 	    int total = 0;

        for(String number : numbers){
        	if(toInt(number) < 1000)
		    	total += toInt(number);
		}


		return total;
    }
}