
/**
 * main
 */
import java.util.*;

import classes.MetaCommand;
import classes.SqlCommand;
import classes.Statement;

public class Main {

    public static Object getLineType(String str) {
        if (str.charAt(0) == ('.')) {
            return new MetaCommand((str.substring(1)).split(" ", 2)[0]);
        }
        return new Statement();
    }

    public static String readLine(Scanner scanner) {
        System.out.print("db > ");
        String str = scanner.nextLine();
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = readLine(scanner);
            Object obj = getLineType(str);
            System.out.println(((SqlCommand) obj).getCommandType());
        }
    }
}