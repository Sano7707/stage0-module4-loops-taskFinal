package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {

        int k = 1;
        for (int i = cathetusLength; i > 0 ; i--) {
            printSpace(i - 1);
            printAst(k);
            k++;
            System.out.println();
        }
    }

    public void printAst(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public void printSpace(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
