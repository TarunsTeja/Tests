import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Isprime {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	BigInteger a,b;
        String n = scanner.nextLine();
        a = new BigInteger(n);
        if(a.isProbablePrime(1) == true){
        	System.out.println("prime");
        }else{
        	System.out.println("not prime");
        }
        scanner.close();
    }
}