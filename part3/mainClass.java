package part3;

import java.util.Arrays;

public class mainClass {

    public static void main(String[] args) {
        char[] originalArray = {'s', 'a', 'b', 'a'};

        System.out.println("array: " + Arrays.toString(originalArray));
        
        char[] reverseArray = reverse(originalArray);
        System.out.println("result: " + Arrays.toString(reverseArray));
        
    }
    
    static char[] reverse(char[] originalArray)
    {
        char[] reverseArray = new char[originalArray.length];

        for(int i = 0; i < originalArray.length; i++)
        {
            reverseArray[originalArray.length - 1 - i] = originalArray[i];
        }
        return reverseArray;
    }
}
