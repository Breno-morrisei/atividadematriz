package br.edu.fatecpg.matriz;

public class Main {
    public static void main(String[] args) {
        
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        
        int[][] matriz2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90},
        };
        
        int[][] matrizResultado = new int[3][3];
        
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                matrizResultado[l][c] = matriz1[l][c] + matriz2[l][c];
            }
        }
        
        System.out.println("A soma das Matrizes é:");
        
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(matrizResultado[l][c] + "\t"); 
            }
            System.out.println();
        }
    }
}
