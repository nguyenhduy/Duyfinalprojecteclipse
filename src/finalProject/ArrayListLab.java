package finalProject;

/**
 * Write a description of class ArrayListLab here.
 *
 * This is the 90% version for the ArrayList Mini Lab.
 *
 * @author (Business Logic III)
 * @version (1.0)
 */

import java.util.ArrayList;

public class ArrayListLab
{

    public static String findPrime(int n)
    {
        return labSolution(n);
    }

    public static ArrayList<Integer> findThePrime(int input)
    {
        //instantiate an integer ArrayList
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        int test = 2;
        do{
            if(primeChecker(test)){
                primeList.add(test);
            }
            test++;
        }
        while(!isStarter(test, input));

        //Use a do-while loop to add primes into this ArrayList until we reach the prime that starts with the digits "input"
        return primeList;

    }

    public static ArrayList<Integer> listOfPrimes(int input)
    {
        //copy-paste code from findThePrime, but instead of returning "test," return the ArrayList
        ArrayList<Integer>primeList = new ArrayList<Integer>();
        int test = 2;
        do{
            if(primeChecker(test)){
                primeList.add(test);
            }
            test++;
        }
        while(!(isStarter(test, input)&&primeChecker(test)));
        return primeList;
    }

    public static boolean isStarter (int candidate, int starter)
    {
        boolean decision = false;
        String digitString = Integer.toString(candidate);
        if(candidate>9){
            String firstTwoDigits = digitString.substring(0,2);
            if(firstTwoDigits.equals(Integer.toString(starter))){
                decision = true;}
        }

        if (candidate == starter)
            decision = true;

        return decision;
    }

    public static boolean primeChecker(int candidate)
    {

        int primeScore = 0;
        boolean isPrime = false;

        for(int d = 1; d <= Math.floor(Math.sqrt(candidate)); d++){
            if(candidate%d == 0){
                primeScore = primeScore + 1;
            } 
        }  
        if(primeScore == 1){
            isPrime = true;
        }

        return isPrime;
    }

    public static String labSolution(int candidate)
    {
        //System.out.println("the prime number is " + findThePrime(candidate));
        
        String result = "the prime number are:  " + findThePrime(candidate);
        
        return result;

        //print out that prime number that starts with "input."
        //print out the entire ArrayList. Should only be one line.

    }
}
