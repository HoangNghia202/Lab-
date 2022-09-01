package Caculator_program;

public class Matrix {
    public int [][] matrix;
    public int row; 
    public int column;

    
    public Matrix() {
    }
    public Matrix(int[][] matrix, int row, int column) {
        this.matrix = matrix;
        this.row = row;
        this.column = column;
    }
    public int[][] getMatrix() {
        return matrix;
    }
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }

    

   
}
