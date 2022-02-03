package Question1;

import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Map<Integer,BigInteger>> resultMap = new HashMap<Integer, Map<Integer,BigInteger>>();

        for(int number = 10; number<100; number++){
            resultMap.put(number,reachPalindrome(BigInteger.valueOf(number),0,new HashMap<Integer,BigInteger>()));
        }
        for(Integer key : resultMap.keySet()){
            System.out.println(key + " sayısı " + resultMap.get(key).size() + ". denemede palindrome olmuştur." );
            System.out.println("Chain:");
            for(Integer key2 : resultMap.get(key).keySet())
            System.out.println( "Iteration: "+ key2 + " Result: "+resultMap.get(key).get(key2));
        }


    }

    public static Map<Integer,BigInteger> reachPalindrome(BigInteger number, int counter, Map<Integer,BigInteger> chainMap){

        boolean flag = false;
        number = number.add(getNumberOfReverse(number));
        counter ++;
        chainMap.put(counter,number);
        flag = isPalindrome(number);

        if(flag){
            return chainMap;
        }
        else{
            return reachPalindrome(number,counter,chainMap);
        }
    }

    public static boolean isPalindrome(BigInteger number){
        if(number.equals(getNumberOfReverse(number))){
            return true;
        }
        else
            return false;
    }

    public static BigInteger getNumberOfReverse(BigInteger number){
        BigInteger reverseNumber = BigInteger.valueOf(0);
        while(!number.equals(BigInteger.valueOf(0)))
        {
            BigInteger remainder = number.mod(BigInteger.valueOf(10));
            reverseNumber = remainder.add(reverseNumber.multiply(BigInteger.valueOf(10)));
            number = number.divide(BigInteger.valueOf(10));
        }
        return reverseNumber;
    }
}
