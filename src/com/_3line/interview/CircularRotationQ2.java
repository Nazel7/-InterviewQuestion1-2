package com._3line.interview;

import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;

public class CircularRotationQ2 {
    public static void main(String[] args) throws Exception{
        int[] array = new int[]{2, 3, 4, 5, 6};
        CircularRotationQ2.rotateCircularly(array, 2);

        System.out.println("+++++++++++++++");

    }

    public static void rotateCircularly(int[] array, int nthTimes) throws InvalidParameterSpecException {
      if (nthTimes < array.length && nthTimes >= 0){
          for (int i = 0; i < nthTimes; i++) {

              int lastIndex= array.length-1;
              int firstValue= array[0];

              for (int j= 1; j <= lastIndex; j++){

                  array[j-1]= array[j];
              }
              array[lastIndex]= firstValue;

          }

          System.out.println(Arrays.toString(array));
      }else {
          // for invalid input tracker..
          throw new InvalidParameterSpecException("Invalid 'nthTimes' value input; " +
                  "Pls enter a value greater than 0 and less than Array.length value");
      }

      }




}
