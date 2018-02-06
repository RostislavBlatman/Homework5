package main;

import logic.Logic;
import test.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        Test.razmer( n );
        Logic.logic( n );
    }
}
