package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author :  Ugochukwu Vigo Obia
 * @project : algo-expert
 * @date :  01/01/2024
 * @email : obiaugochukwu@gmail.com, obiaugochukwu@icloud.com
 */
public class TwoSums {
  
  public static void main(String[] args) {
    int [] input = {3,5,-4,8,11,1,-1,6};
    int target = 10;
   // System.out.println(Arrays.toString(twoSums(input, target)));
    System.out.println(Arrays.toString(hashMapTwoSums(input,target)));
  }
  
  private static int [] twoSums(int [] input, int target){
    int [] response = new int[2];
    int sum;
    for(int i = 0 ; i < input.length; i ++){
      for(int j = i + 1; j < input.length  ; j++){
        sum = input[i] + input[j];
    //    System.out.println(input[i] +"+" + input[j] +"=" + sum );
        if(sum == target){
          response[0] = input[i];
          response[1] = input[j];
          return response;
        }
      }
    }
    return new int []{0,0};
  }
  
  private static int[] hashMapTwoSums(int [] array, int targetSum){
    Map<Integer, Integer > numbers = new HashMap<>();
     for(int i = 0; i < array.length; i++){
       numbers.put(i,array[i]);
     }
     int sum;
    int [] response = new int[2];
    for(int i = 0; i < array.length; i++){
       sum = targetSum - numbers.get(i);
       System.out.println(targetSum +"-" + numbers.get(i) +"=" + sum );
      numbers.remove(i);
      if(numbers.containsValue(sum)){
          response[0] = array[i];
          response[1] = sum;
          return response;
       }
     }
    return new int []{0,0};
  }

  
}
