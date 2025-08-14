public class MyArrays
{
    public static void main(String[] args)
    {
        /****** MAKE AN INT ARRAY WITH 10 ITEMS ******/
        
        // 1. Declare an int array with 10 default values
        int[] array = new int[10];

        // 2. Insert values (any) into the array at indices 0 to 8
        // Think: how can you insert the values without writting 9 lines of code
        for (int i = 0; i < 8; i++) {
            array[i] = i;
        }
        
        // 3. Set the value 1000 at index 2. Set the value -20 at index 3
        array[2] = 1000;
        array[3] = -20;
        
        // 4. Get the value at index 2 and print it out
        System.out.print(array[2]);
        
        // 5. Get the value at index 9 and print it out.
        // What is that value? Why?
        System.out.print(array[9]);
        //0, bc it is a default value and we didn't assign anything to it yet.
        
        // 6. What does it happen when you execute the next line?
        // System.out.println(intArr[10]);
        //it will give a out of bounds error as an array of 10 items will only go up to 9.
        
        /****** MAKE A DOUBLE ARRAY WITH 10 ITEMS ******/
        // 1. Declare a double array with 10 default values
        double[] arrayd = new double[10];
        // 2.Set any values at indices 0 and 9
        for (int i = 0; i < 8; i++) {
            arrayd[i] = i;
        }
        // 3. Get the value at index 0 and print it out. What is the value? Why?
        //it will print out 0.0 as that is the value i set it to in my for loop.
        /******* MAKE A STRING ARRAY WITH 10 SLOTS  ******/
        // 1. Make an array with 10 initial value
        String[] arrays = new String[10];
        // 2. Get and pring all the elements in your string array without writting 10 lines of code
        for (int i = 0; i < 8; i++) {
            System.out.print(arrays[i]);
        }
        /******* MAKE A BOOLEAN ARRAY WITH 10 SLOTS  ******/
        // 1. Make a default boolean array with 10 values 
        boolean[] arrayb = new boolean[10];
        // 2. Set the any values at indices 5 and 0
        arrayb[5] = true;
        arrayb[0] = false;
        // 3. Get the values at indices 2, 9, 5 and 0 and print them out
        System.out.print(array[2]);
        System.out.print(array[9]);
        System.out.print(array[5]);
        System.out.print(array[0]);
    
    }
}
