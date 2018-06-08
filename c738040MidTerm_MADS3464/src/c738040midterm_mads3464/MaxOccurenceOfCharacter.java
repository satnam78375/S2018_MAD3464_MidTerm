/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c738040midterm_mads3464;

/**
 *
 * @author satnam
 */
public class MaxOccurenceOfCharacter {
    
    
    public static String mostFrequent(String input) {
        char[] array = input.toCharArray();
        int maxCount = 1;
        char maxChar = array[0];
 
          for(int i = 0, j = 0; i < input.length() - 1; i = j){
               int count = 1;
           while (++j < input.length() && array[i] == array[j]) {
                  count++;
                }
         
          if (count >= maxCount) {
             maxCount = count;
             maxChar = array[i];
         }
         
        }
 
    return (maxChar + " = " + maxCount);
    }
}
