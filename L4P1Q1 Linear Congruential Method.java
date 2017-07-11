package l4p1q1;

import java.math.BigInteger;
import java.util.Random;

public class L4P1Q1 {  
    public static void main(String[] args) {
        
        BigInteger x = new BigInteger(16, new Random(){});
        BigInteger y = new BigInteger("65535");//2^16

        for(int i=0; i<5; i++)
        {
            System.out.print(x+", ");
            
            BigInteger a = new BigInteger(16, new Random(){});
            BigInteger b = new BigInteger(16, new Random(){});
            
            x = ((x.multiply(a)).add(b)).mod(y);
        }
        
        System.out.println("..");
    }   
}
