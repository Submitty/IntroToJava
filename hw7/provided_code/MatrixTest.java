import java.util.*;

public class MatrixTest{
    public static void main(String [] args){

        int m1_2_3[][]={ {1,2,3}, {4,5,6} };
        int m2_2_4[][]={ {5,7,3,9}, {1,6,4,2} };
        int m3_4_3[][]={ {0,9,7}, {4,7,2}, {4,6,7}, {7,5,3} };
        int m4_3_4[][]={ {7, 4, 6, 2}, {9, 8, 4, 2}, {5, 2, 7, 0} };
        int m5_3_4[][]={ {8, 5, 34, 7}, {5, 75, 2, 0}, {9, 6, 4, 3} };
        int identity3_3[][] ={ {1, 0, 0}, {0, 1, 0}, {0, 0, 1} };
        int m6_3_3[][] = { {4, 7, 2}, {4, 8, 6}, {1, 9, 4} };

        Matrix m1 = new Matrix(m1_2_3);
        Matrix m2 = new Matrix(m2_2_4);
        Matrix m3 = new Matrix(m3_4_3);
        Matrix m4 = new Matrix(m4_3_4);
        Matrix m5 = new Matrix(m5_3_4);
        Matrix I3_3 = new Matrix(identity3_3);
        Matrix m6 = new Matrix(m6_3_3);

        System.out.println("Testing get method");
        if(m3.get(2, 1) == 6) System.out.println("Passed");
        else System.out.println("Failed");
        
        int solData1[][]={ {1, 2, 3}, {4, 5, 6} };
        runTest("Running init test (if this fails you probably edited a do not modify method)", m1, solData1);

        int solData2[][]={ {2, 4, 6}, {8, 10, 12} };
        runTest("Running addition test 1", m1.add(m1), solData2);

        int solData3[][]={ {15, 9, 40, 9}, {14, 83, 6, 2}, {14, 8, 11, 3} };
        runTest("Running addition test 2", m4.add(m5), solData3);
        
        int solData4[][]={ {0, 0, 0}, {0, 0, 0} };
        runTest("Running subtraction test 1", m1.sub(m1), solData4);

        int solData5[][]={ {-1, -1, -28, -5}, {4, -67, 2, 2}, {-4, -4, 3, -3} };
        runTest("Running subtraction test 2", m4.sub(m5), solData5);

        int solData6[][] = { {103, 157, 97}, {54, 85, 53} };
        runTest("Running multiplication test 1", m2.mult(m3), solData6);

        runTest("Running multiplication test 2", m6.mult(I3_3), m6_3_3);

        runTestBool("Running symmetic test 1", I3_3.isSymmetric(), true);

        runTestBool("Running symmetic test 2", m1.isSymmetric(), false);

        int solData7[][] = { {1, 4}, {2, 5}, {3, 6} };
        runTest("Running transpose test 1", m1.transpose(), solData7);

        runTest("Running transpose test 2", I3_3.transpose(), identity3_3);

        runTestInt("Running colmeans test 1", m6.colMeans(2), 4);

        m1.set(0, 1, 5);
        runTestInt("Running colmeans and set test 1", 5, 5);
        m1.set(0, 1, 2);

        int solData8[][]={ {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(7); al.add(8); al.add(9);
        m1.addRow(al);
        runTest("Running addRow test", m1, solData8);

        int solData9[][]={ {1, 2, 3, 7}, {4, 5, 6, 8}, {7, 8, 9, 9} };
        m1.addCol(al);
        runTest("Running addCol test", m1, solData9);
    }

    public static void runTest(String txt, Matrix m, int[][] solData){
        System.out.println(txt);
        String out = "Failed";
        Matrix sol = new Matrix(solData);
        if(validate(m, sol)){
            out = "Passed";
        }
        System.out.println(String.format("Your matrix\n%s\nCorrect matrix\n%s\ntest result: %s\n", m , sol, out));
    }

    public static void runTestBool(String txt, boolean actual, boolean sol){
        System.out.println(txt);
        String out = "Failed";
        if(actual == sol){
            out = "Passed";
        }
        System.out.println(String.format("Test: %s\n", out));
    }

    public static void runTestInt(String txt, int actual, int sol){
        System.out.println(txt);
        String out = "Failed";
        if(actual == sol){
            out = "Passed";
        }
        System.out.println(String.format("Test: %s\n", out));
    }

    public static boolean validate(Matrix given, Matrix expected){
        if(given == null && expected == null) return true;
        if(given == null && expected != null) return false;
        if(given.getRowCount() != expected.getRowCount()) return false;

        for(int i = 0; i < given.getRowCount(); i++){
            for(int j = 0; j < given.getColCount(); j++){
                if(given.get(i, j) != expected.get(i, j)){
                    return false;
                }
            }
        }

        return true;
    }
}