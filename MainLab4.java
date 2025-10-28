import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainLab4 {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      Lab4.outputList(bubbleSortedList);

      System.out.println("\n\nInsertion sort results -------------------------------------------");
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);  
      Lab4.outputList(insertionSortedList);
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here
    /* 
    for (int i = 1; i < integerList.length; i++) {
      int currentValue1 = integerList[i];
      int j = i - 1;
      while (j >= 0 && integerList[j] > currentValue1) {
        integerList[j + 1] = integerList[j];
        j--:
      }
      integerList[j + 1] = currentValue1
    } */
    return integerList;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    boolean swappedInts = true;
    while (swappedInts) {
      swappedInts = false;
      for (int i = integersList.length - 1; i++) {
        if (integerList[i] > integerList[i + 1]) {
          swappedInts = true;
          int temp = integerList[i]; 
          integerList[i] = integerList[i + 1];
          integerList[i + 1] = temp;
        }
      }
    }
    return integerList;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}