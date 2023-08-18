package Array;

public class BinarySearchArray {

	public static void main(String[] args) {
       int low=0,high=arr.length-1,position=-1;
       boolean isElememtFound=false;
       int mid=0;
       while(low<=high) {
    	   mid=(low+high/2);
    	   if(element==arr[mid]) {
    		   i sElementFound=true;
    		   position=mid+1;
    		   break;
    	   }else if(element>arr[mid]) {
    		   low=mid+1;
    		   high=high;
    	   }else {
    		   high=mid-1;
    		   low=low;
    	   }
       }
       if(isElemmentFound) {
    	   System.out.println("");
       }
	}

}
