public class Mtx {
    private final int row, column;
    public int[][] arr;
    public Mtx(int[][] arrMatrix) {
        arr = arrMatrix;
        row = arr.length;
        column = arr[0].length;
    }

    public boolean equalSize(Mtx OtherMatrix){
        return this.row == OtherMatrix.row && this.column == OtherMatrix.column;
    }

    public boolean compatible(Mtx OtherMatrix) {
        return this.column == OtherMatrix.row;
    }

    public Mtx add(Mtx Othermatrix) {
        int[][] results = new int[row][column];
        if (equalSize(Othermatrix)) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    results[i][j] = this.arr[i][j] + Othermatrix.arr[i][j];
                }
            }
        }
        return new Mtx(results);
    }
    public Mtx mul(Mtx OtherMatrix) {
        int[][] results = new int[this.row][OtherMatrix.column];
        if (compatible(OtherMatrix)) {
            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < OtherMatrix.column; j++) {
                    for (int k = 0; k < this.column; k++) {
                        results[i][j] += this.arr[i][k] * OtherMatrix.arr[k][j];
                    }
                }
            }
        }
        return new Mtx(results);
    }
    public Mtx mul(int n){
        int[][] results = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                results[i][j] = n *arr[i][j];
            }
        }
        return new Mtx(results);
    }
    public void show() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}