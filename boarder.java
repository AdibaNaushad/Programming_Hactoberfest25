import java.util.Scanner;

public class boarder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
    for(int r = 1; r <= 3 ; r++){
        for(int c = 1; c <= 6; c++){
            if (r == 1 || r == 3 || c == 1 || c == 6) 
               System.out.print("*");
            else
               System.out.print(" ");

                
            }
            System.out.println();
        }
    }
}

