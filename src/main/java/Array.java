import java.util.Arrays;

/**
 * Created by dbabu on 2/18/19.
 */
public class Array {

    public static void main(String args[])
    {
        //PushanElementtoArray();
        //FindSecondLargest();
        SeperateAlpabetandSpecialchar();
    }
    public static void SeperateAlpabetandSpecialchar()
    {
        String str="OS#CH&*B^4!3";
        String alphabet= "",specailchar="";
        for(int i=0;i< str.length();i++)
        {
            if(Character.isLetterOrDigit(str.charAt(i)))
            {
                alphabet+=str.charAt(i);
            }
            else
            {
                specailchar+=str.charAt(i);
            }
        }
        System.out.println("Alphabets are :"+alphabet);
        System.out.println("Special Char are :"+specailchar);
        System.out.println("Special Char length is :"+specailchar.length());
    }
    /*
         Insert an element in between the array
     */
    public static void PushanElementtoArray()
    {
        int[] inputArray= new int[]{1,2,3,5,8,9};
        int[] outputArray= new int[inputArray.length+1];
        int pos=3;
        int posValue=10;
        for(int i=0;i<pos;i++)
        {
            outputArray[i]=inputArray[i];
        }
        outputArray[pos]=posValue;
        for(int i=pos+1;i<outputArray.length;i++)
        {
            outputArray[i]=inputArray[i-1];
        }
        System.out.println("Original : "+ Arrays.toString(inputArray));
        System.out.print("Inserted : "+Arrays.toString(outputArray));
    }

    /*
    Find Second largest number  in an array
     */
    public static void FindSecondLargest()
    {
        int[] array= {1,12,15,3,4,19,10};
        int firstHighest= Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        for(int i=0;i< array.length;i++)
        {
                if( array[i] > firstHighest)
                {
                    secondHighest= firstHighest;
                    firstHighest=array[i];
                }
                else if(array[i]>secondHighest)
                {
                    secondHighest=array[i];
                }
        }
        System.out.println("Original : "+Arrays.toString(array));
        System.out.println("First Highest : "+firstHighest);
        System.out.println("Secong Highest : "+secondHighest);
    }
}
