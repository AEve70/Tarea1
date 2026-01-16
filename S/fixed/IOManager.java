package S.fixed;

import java.util.Scanner;

public class IOManager {
    static Scanner in = new Scanner(System.in);

    public static void print(String message){
        System.out.println(message);
    }

    public static String readString(String prompt){
        return in.nextLine();
    }

    public static int readInt(){
        return in.nextInt();
    }

    public static double readDouble(){
        return in.nextDouble();
    }

    
}
