package Question1;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        Map<Integer,Integer> resultMap = new HashMap<Integer,Integer>();

        for(int number = 10; number<100; number++){
            resultMap.put(number,reachPalindrome(number,0));
        }
        for(Integer key : resultMap.keySet()){
            System.out.println(key + " sayısı " + resultMap.get(key) + ". denemede palindrome olmuştur." );
        }
    }

    public static int reachPalindrome(int number, int counter){

        boolean flag = false;
        number += getNumberOfReverse(number);
        flag = isPalindrome(number);
        counter ++;
        if(flag){
            return counter;
        }
        else{
            return reachPalindrome(number,counter);
        }
    }

    public static boolean isPalindrome(int number){
        if(number == getNumberOfReverse(number)){
            return true;
        }
        else
            return false;
    }

    public static int getNumberOfReverse(int number){
        int reverseNumber = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number = number/10;
        }
        return reverseNumber;
    }
}
