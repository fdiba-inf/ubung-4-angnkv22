package exercise4;

import java.util.Arrays;
import java.util.Scanner;

  public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
       int[] array = new int[count];
       for (int i = 0; i < array.lenght; i++){
         array [i] = input.nextInt();
        int space = 0;
        for (int i = 0; i < array.lenght; i++){
          for (int a = 0; a < space; a++){
            System.out.print(" ");
          }
          space++;
          System.out.println (array[i]);
        }
       }
    }
    }