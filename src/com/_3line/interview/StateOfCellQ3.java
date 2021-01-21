package com._3line.interview;

import javax.print.DocFlavor;
import java.util.Arrays;

public class StateOfCellQ3 {
    public static void main(String[] args) {
        int[] arr= {1,0,0,0,0,1,0,0};
        StateOfCellQ3.cellStates(arr, 1);
    }
    public static void cellStates(int[] arrayCell, int noOfDay) {
        int lenArray = arrayCell.length;
        int[] newArray = new int[lenArray];
        while (noOfDay > 0) {
            for (int i = 0; i < lenArray; i++) {
                if (i == 0) {
                    if (arrayCell[i + 1] == 1) newArray[i] = 1;
                    else newArray[i] = 0;
                } else if (i == lenArray - 1) {
                    if (arrayCell[i - 1] == 1) newArray[i] = 1;
                    else newArray[i] = 0;
                } else {
                    if ((arrayCell[i - 1] == 0 && arrayCell[i + 1] == 1) || (arrayCell[i - 1] == 1 && arrayCell[i + 1] == 0))
                        newArray[i] = 1;
                    else newArray[i] = 0;
                }

            }
            arrayCell = Arrays.copyOf(newArray, newArray.length);
            noOfDay--;
        }
        System.out.println(Arrays.toString(newArray));
    }

}
