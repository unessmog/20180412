import java.util.ArrayList;
import java.util.Scanner;

public class PromptEight {
    private static int rSum(int b, int d) {
        int a = 0;
        if (b > 0) {
            a = rSum(b-d, d);
        }
        return(a+b);
    }
    
    //changes parameter order
    private static int sumSteps(int step, int stop) {
        int sum = 0;
        sum = rSum(stop, step);
        return(sum);
    }
    
    //io tools
    public static void printText(String text) {
        if (text != null) {
            System.out.print(text);
        }
        else {
            System.out.print(".");
        }
    }
    
    public static String getInput(String prompt) {
        Scanner keyboard = new Scanner(System.in);
        if (prompt != null) {
            System.out.print(prompt);
        }
        else {
            System.out.print("Enter here: ");
        }
        String userInput = keyboard.nextLine();
        return(userInput);
    }
    
    public static void main(String[] args) throws Exception {
        int sum = 0;
        int step = 0;
        int stop = 0;
        String base = null;
        String diff = null;
        
        printText("Enter each value\n");
        diff = getInput("step: ");
        base = getInput("stop: ");
        step = (Integer.valueOf(diff)).intValue();
        stop = (Integer.valueOf(base)).intValue();
        
        sum = sumSteps(step, stop);
        base = Integer.toString(sum);
        printText(base);
        
        System.exit(0);
    }
}
