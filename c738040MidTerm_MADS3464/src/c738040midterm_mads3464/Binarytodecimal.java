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
public class Binarytodecimal {
  public static int convert(String input) {
        Long binary =  Long.valueOf(input).longValue();
        int decimalNumber = 0, i = 0;
        long remainder;
        while (binary != 0)
        {
            remainder = binary % 10;
            binary /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }
}
 




