
import java.util.Arrays;
/*
 * IT-2660 - Lab 1
 * Student Name: Adam Kalo
 */

public class Main {
  public static void main(String[] args) {
// The Array
    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};
// Sort the array
    Arrays.sort(nums);
// Output with while loop
    int x = 0;
    while (x < nums.length) {
      System.out.println(nums[x]);
      x++;
    }
    System.out.println("done");
// Reverse with while loop
    int y = nums.length - 1;
    while (y >= 0) {
      System.out.println(nums[y]);
      y--;
    }
    System.out.println("done");
// Calling methods from Lab1
    Lab1.max(97, 32);
    Lab1.min(88, 19);
    Lab1.sum(nums);
    Lab1.average(nums);
    Lab1.max2(nums);
    Lab1.min2(nums);

  }
}     

// Add all of the methods here
class Lab1 {
// Max using if-else statement
  public static void max(int a, int b) {

    if (a > b) {
      System.out.println(a);
    } else {
      System.out.println(b);
    }
  }
// Min using if-else statement
  public static void min(int a, int b) {
    if (a < b) {
      System.out.println(a);
    } else {
      System.out.println(b);
    }
  }
// Sum of values in array
  public static void sum(int[] nums) {
    int sum = 0;
    int i;
   for (i = 0; i < nums.length; i++) {
    sum += nums[i];
   }
   System.out.println(sum);
  }
// Average of values in array
  public static void average(int[] nums) {
    float avg, sums = 0;
    int length = nums.length;
    for (int num : nums) {
      sums += num;
    }
    avg = sums / length;
    System.out.println(avg);
  }
// Largest value in array
  public static void max2(int[] nums) {
    int largest = nums[0];
    for (int n : nums) {
      if (n > largest) {
        largest = n;
      }
    }
    System.out.println(largest);
  }
// Smallest value in array
  public static void min2(int[] nums) {
    int smallest = nums[0];
    for ( int smol : nums) {
      if (smallest > smol) {
        smallest = smol;
      }
    }
    System.out.println(smallest);
  } 

}