package Array;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
//       Array Declaration
       int[][][] arr;
//       Array Creation
       arr =new int[4][][];
       arr[0]=new int[3][];
       arr[0][0]=new int[1];
       arr[0][1]=new int[2];
       arr[0][2]=new int[3];
       arr[1]=new int[1][];
       arr[1][0]=new int[2];
       arr[2]=new int[2][];
       arr[2][0]=new int[1];
       arr[2][1]=new int[1];
       arr[3]=new int[3][];
       arr[3][0]=new int[1];
       arr[3][1]=new int[2];
       arr[3][2]=new int[2];
      System.out.println("Enter data for array elememts = ");
       
//       Array Initialization
       for(int i=0;i<arr.length;i++) {
    	   for(int j=0;j<arr[i].length;j++) {
    		   for(int k=0;k<arr[i][j].length;k++) {

    			   arr[i][j][k]=scan.nextInt();
    		   }
    	   }
       }

     System.out.println("************");
//Array Traversing
       for(int i=0;i<arr.length;i++) {
    	   for(int j=0;j<arr[i].length;j++) {
    		   for(int k=0;k<arr[i][j].length;k++) {
    			   System.out.println(arr[i][j][k]);
    		   }
    	   }
       }
        scan.close();
	}

}
