
package part2;

import java.util.Arrays;

public class mainClass {
    
    public static void main(String[] args) {
        
        int[] myArray0 = {1,77,-5,2,65,30};
        int[] myArray1 = {-10,50,15,2,77};

         boolean result1 = true;
         boolean result2 = true;
        
        int firstValue1Counter = 0;
        int secondValue1Counter = 0;
        
        for( int i=0; i<myArray0.length; i++)
        {
                if(myArray0[i] == 65 )
                {
                    firstValue1Counter++;
                }
                else if (myArray0[i] == 77){
                    secondValue1Counter++;
                }
        }

        if(firstValue1Counter == 1 && secondValue1Counter == 1)
        {
            result1 = true;
        } else{
            result1 = false;
        }

        int firstValue2Counter = 0;
        int secondValue2Counter = 0;
        for( int j=0; j<myArray1.length; j++)
        {
                if(myArray1[j] == 65 )
                {
                    firstValue2Counter++;
                }
                else if(myArray1[j] == 77){
                    secondValue2Counter++;
                }
        }

        if(firstValue2Counter == 1 && secondValue2Counter == 1)
        {
            result2 = true;
        } else{
            result2 = false;
        }
        System.out.print(Arrays.toString(myArray0));
        System.out.print(" => " + result1 +"\n");

        System.out.print(Arrays.toString(myArray1));
        System.out.print(" => " + result2);


    }
}
