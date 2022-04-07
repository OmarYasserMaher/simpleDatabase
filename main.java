/**
 * main
 */
import java.util.*;
public class Main {
    

    
    public static String read_line(Scanner scanner){
        System.out.print("db > ");
        String str= scanner.nextLine();
        return str; 
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        while(true){
        read_line(scanner);
        }
    }
}