//Question 52 of Practice Problems 03 Arrays and Class.doc
// from \\tsr\Fall\CSE\CSE110_MSA\Practice Problems\
public class MatrixMultiplication{ 
  public static void main(String[] args){
    //    Create matrices
    double[][] matrixA = new double[2][3];
    double[][] matrixB = new double[3][2];
    double[][] matrixC = new double[2][2];
    
    //    Fill Matrices
    matrixA[0][0] = 3.0;
    matrixA[0][1] = 2.0;
    matrixA[0][2] = -1.0;
    matrixA[1][0] = 0.0;
    matrixA[1][1] = 4.0;
    matrixA[1][2] = 6.0;    
    matrixB[0][0] = 1.0;
    matrixB[0][1] = 0.0;
    matrixB[1][0] = 5.0;
    matrixB[1][1] = 3.0;
    matrixB[2][0] = 6.0;
    matrixB[2][1] = 4.0;
    
    //   Multiplication  C =A.B
    for(int i=0; i<2; i++){
      for(int j=0; j<2; j++){
        for(int k=0; k<3; k++){
          matrixC[i][j] += matrixA[i][k]*matrixB[k][j];
          System.out.println(matrixC[i][j]);
        }
      }
    }
  }
}
