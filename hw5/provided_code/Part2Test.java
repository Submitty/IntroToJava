public class Part2Test{
    public static void main(String[] args) {
        
        System.out.println(Part2.add(4,7));
        System.out.println(Part2.add(2,6));
        System.out.println(Part2.sub(4,7));
        System.out.println(Part2.sub(2,6));
        System.out.println(Part2.mult(4,7));
        System.out.println(Part2.mult(2,6));
        System.out.println(Part2.intDiv(10,2));
        System.out.println(Part2.quadratic(1, -2, -15, true));
        System.out.println(Part2.quadratic(1, -2, -15, false));
        System.out.println(Part2.quadratic(2, 17, 21, true));
        System.out.println(Part2.quadratic(2, 17, 21, false));
        System.out.println(Part2.quadratic(1, -9, 20, true));
        System.out.println(Part2.quadratic(1, -9, 20, false));

    }
}