package part1;

public class mainClass {
    
    public static void main(String[] args) {

            int[] myArray1 = {1,5,-5,2,12,30};
            int[] myArray2 = {-10,50,15,2};

            int common = 0;

            for(int i = 0; i< myArray1.length; i++)
            {
                for(int j = 0; j< myArray2.length; j++)
                {
                    if(myArray1[i] == myArray2[j])
                    {
                        common ++;
                    }
                }
                
            }

            System.out.println("common_elements: [" + common + "]");
    }

}
