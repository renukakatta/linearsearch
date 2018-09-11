import java.util.*;
public class linearsearch {

	public static void main(String[] arg){
		Scanner ob=new Scanner(System.in);
		int s,search;
		System.out.println("enter the array size");
		s=ob.nextInt();
		int []a=new int[s];
		int n=a.length-1;
		System.out.println("enter the elements in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=ob.nextInt();
		}
		System.out.println("enter the element to searched");
		search=ob.nextInt();
		linearsearch1(a,search);

	}

 public static void  linearsearch1(int c[],int d)
    {
	 int count=0;
    	for(int k=0;k<=c.length-1;k++)
    	{
    		 if(c[k]==d)
    		 {
    			 System.out.println("element found at indix:" +k);
    			 count++;
    		 }
    	}
    		 if(count==0){
    			 System.out.println("element not found");
 
    		 }
    	
    }
}