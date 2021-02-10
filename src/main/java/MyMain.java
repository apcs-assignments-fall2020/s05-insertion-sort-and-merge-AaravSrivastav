import java.util.ArrayList;
import java.util.Arrays;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list)
    {
        for (int i = 1; i < list.size(); i++) 
        {
            int a = list.get(i);
            int j = i - 1;
            while ((j > -1) && (list.get(j).compareTo(a) == 1)) 
            {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, a);
        }
        return list;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] newArr = new int[arr1.length*2];
        for(int i = 0; i<arr1.length; i++)
        {
            newArr[2*i]=arr1[i];
            newArr[2*i+1]=arr2[i];
        }
        Arrays.sort(newArr);
        return newArr;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
