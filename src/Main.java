import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        Integer[][] matrix = new Integer[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == i || j == n-1-i) {
                    matrix[i][j] = 1;

                }
                else matrix[i][j] = 0;
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
