package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int range;
	    int remainder;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a range, to find the prime numbers: ");
        range = input.nextInt();

        for(int i =1; i<=range; i++){//iterates thru range
            if(i==1){
                System.out.println("1 is not a prime number.");
            }else if(i==2 || i==3){
                System.out.printf("%d is a prime number.\n",i);
            }
            else{
                for(int j=2; i>=j; j++){
                    if(i%2==0 || i%3==0){
                        System.out.printf("%d is not a prime number.\n", i);
                        break;
                    }else{
                        System.out.printf("%d is a prime number.\n",i);
                        break;
                    }
                }
            }//end if-else
        }//end for
    }
}
