import java.io.*;
import java.util.Scanner;

public class PromptFour {
    private static void writeFile(String filename, String data) throws Exception {
        File file = new File(filename);
        file.createNewFile();
        FileOutputStream stream = new FileOutputStream(file);
        
        byte[] dataBytes = data.getBytes();
        
        stream.write(dataBytes);
        stream.flush();
        stream.close();
    }
    
    private static StringBuffer readFile(String filename) throws Exception {
        File file = new File(filename);
        file.createNewFile();
        FileInputStream stream = new FileInputStream(file);
        StringBuffer buffer = new StringBuffer();
        int character = 0;
        
        while ((character = stream.read()) != -1) {
            buffer.append((char) character);
        }
        stream.close();
        return(buffer);
    }
    
    private static String loginData(String username, String password) {
        String separator = "\0";
        String newline = "\n";
        String newLogin = null;
        
        newLogin = username + separator 
                 + password + newline;
        return(newLogin);
    }
    
    public static void printOut(String prompt) {
        if (prompt != null) {
            System.out.print(prompt);
        }
        else {
            System.out.print("\n");
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
    
    public static int findUsername(StringBuffer data, String username) {
        //search for username in data
        return(0);
    }
    
    public static void main(String[] args) throws Exception {
        String filename = "database.txt";
        String username = null;
        String password = null;
        String response = null;
        String newLogin = null;
        StringBuffer database = new StringBuffer();
        int matchName = 0;
        
        database = readFile(filename);
        username = getInput("Username: ");
        matchName = findUsername(database, username);
        if (matchName > 0) {
        }
        else {
            printOut("Couldn't find user in system. Create a new one?\n");
            response = getInput("Y/N: ");
            printOut("--- Creating new account ---\n");
            username = getInput("Username: ");
            password = getInput("Password: ");
            newLogin = loginData(username, password);
            writeFile(filename, newLogin);
        }
    }
}
