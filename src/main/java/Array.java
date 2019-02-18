import java.util.Arrays;

/**
 * Created by dbabu on 2/18/19.
 */
public class Array {

    public static void main(String args[])
    {
        PushanElementtoArray();
    }
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
        System.out.print("Original : "+ Arrays.toString(inputArray));
        System.out.print("Inserted : "+Arrays.toString(outputArray));
    }
}
