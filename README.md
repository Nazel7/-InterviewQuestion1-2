## Algorithm Test for 3Line 
 This programme contains two test which are question 2 & 3.

#Question 2:
This is an algorithm that is able to rotate the position of a given array circularly 
depending on the nth rotation value provided.

#Question 3:
This is an algorithm that is able to change the state of a position of a given element of an array 
depending on the start of the neighbouring element of the array.

#How to Run 
You will need to open  the file in an IDEA preferable Intellij.
No additional code needed; The code will run from the "main method provided" 

#For Example
The below code will output [5,6,2,3,4]

public static void main(String[] args) throws Exception{
int[] array = new int[]{2, 3, 4, 5, 6};
CircularRotationQ2.rotateCircularly(array, 3);

}
