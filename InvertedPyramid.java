public class InvertedPyramid {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++){
            //Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //print asterisks
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
