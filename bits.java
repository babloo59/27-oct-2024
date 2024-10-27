import java.util.*;

public class bits {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2; 
        int bitMask = 1<<pos;


        // Get Bit
        // if((bitMask & n) == 0) {
        //     System.out.println("Bit was zero");
        // } else {
        //     System.out.println("Bit was one");
        // }

        // Set Bit
        // pos=1;
        // bitMask = 1<<pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        // Clear Bit
        // pos = 2;
        // bitMask = 1<<pos;
        // int notBitMask = ~(bitMask);

        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);

        // Update Bit
        pos = 1;
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // int oper = 0; //Update bit to 1 else update bit to 0

        bitMask = 1<<pos;
        if(oper == 1) {
            //set oper
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
