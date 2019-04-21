package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int range;
	    boolean isPrime=false;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a range, to find the prime numbers: ");
        range = input.nextInt();

        for(int i =1; i<=range; i++){//iterates thru range
            if(i==1){
                System.out.println("1 is not a prime number.");
            }else if(i==2 || i==3){
                System.out.printf("%d is a prime number.\n",i);
            }else{
                for(int j=2; i>j; j++){
                    /*This is statement will iterate through all the numbers from 2 to i-1
                    to find if there is a number by which i mod j will not have a remainder.
                    if there is one that the for loop will print the appropriate message.
                    Otherwise the for loop will iterate through all the values finding a remainder
                    and will change isPrime to true. This will allow for the second if statement within
                    the first loop to test to true and print the appropriate message.
                      */
                    if(i%j==0){
                        System.out.printf("%d is not a prime number.\n", i);
                        isPrime = false;
                        break;
                    }else{
                        isPrime = true;
                    }
                }
            }//end if-else
            if(isPrime){
                System.out.printf("%d is a prime number.\n",i);
            }
        }//end for
    }
}
