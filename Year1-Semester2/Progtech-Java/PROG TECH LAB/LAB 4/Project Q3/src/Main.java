import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] arrAB = new int[10][5];
        int[][] arrC = new int[5][3];

        Mtx matrixA = new Mtx(arrAB);
        Mtx matrixB = new Mtx(arrAB);
        Mtx matrixC = new Mtx(arrC);

        for (int i = 0; i < arrAB.length; i++) {
            for (int j = 0; j < arrAB[0].length; j++) {
                Random random = new Random();
                int randomNum = random.nextInt(201) - 100;
                arrAB[i][j] = randomNum;
            }
        }

        for (int i = 0; i < arrC.length; i++) {
            for (int j = 0; j < arrC[0].length; j++) {
                Random random = new Random();
                int randomNum = random.nextInt(201) - 100;
                arrC[i][j] = randomNum;
            }
        }

        System.out.println("A = ");
        matrixA.show();
        System.out.println("\nB = ");
        matrixB.show();
        System.out.println("\nC = ");
        matrixC.show();

        Mtx add = matrixA.add(matrixB);
        System.out.println("\nA+B = ");
        add.show();

        Mtx mulNum = matrixB.mul(2);
        System.out.println("\n2*B = ");
        mulNum.show();

        if (matrixA.compatible(matrixB)) {
            System.out.println("\n A and B are compatible");
        } else {
            System.out.println("\nA and B are not compatible");
        }
        Mtx mulMatrix = matrixA.mul(matrixC);
        System.out.println("\nA*C = ");
        mulMatrix.show();
    }
}
