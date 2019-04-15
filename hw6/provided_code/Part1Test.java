import java.util.ArrayList;

public class Part1Test{
    public static void main(String[] args) {
        
        ArrayList<Integer> al = Part1.createArrayList();
        int [] arr = Part1.createArray(10);

        for(int i = 0; i < arr.length; i++){
            arr[i] = i * i;
            al.add(i * i);
        }



        validate("Testing findInArray", Part1.findInArray(arr, 53), -1);
        validate("Testing findInArray", Part1.findInArray(arr, 16), 4);
        validate("Testing findInArrayList", Part1.findInArrayList(al, 53), -1);
        validate("Testing findInArrayList", Part1.findInArrayList(al, 81), 9);
        validate("Testing getSizeOfArrayList", Part1.getSizeOfArrayList(al), 10);
        validate("Testing getSizeOfArray", Part1.getSizeOfArray(arr), 10);

        Part1.printAL(al);
        Part1.printArray(arr);

    }

    public static void validate(String txt, int given, int expected){
        System.out.println(txt);
        System.out.println("Given: " + given + "\tExpected: " + expected);
        if(given == expected){
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }
        System.out.println();
    }
}