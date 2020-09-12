/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 13-09-2020
 *   Time: 01:00
 *   File: BubbleSort.java
 */

package algorithms;

import java.util.Scanner;


public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("enter the length of the array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements");
        for (int index = 0; index < n; index++) {
            arr[index] = scanner.nextInt();
        }

        System.out.println("array is :");

        for (int index = 0; index < n; index++) {
            System.out.print(arr[index] + " ");

        }
        System.out.println();
        int temp;
        //int flag =1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //flag = 0;
                }
           // if(flag==1){
                //break;

            }
        }

        System.out.println("sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print( arr[i] + " ");

            }

        }
    }
