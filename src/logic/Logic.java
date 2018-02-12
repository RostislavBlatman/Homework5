package logic;

public class Logic {
    public static void logic( int n ){
        Integer[][] matrix = new Integer[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                matrix[i][j] = j == i || j == n-1-i ? 1 : 0;

            }
        }
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
