package br.edu.fatecpg.matriz;
import java.util.Scanner;

public class Matriztransposta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

              int[][] matriz = new int[3][2];

        System.out.println("Digite os elementos da matriz 3x2:");
        for (int l=0;l<3;l++) { 
            for (int c=0;c<2;c++) { 
                System.out.print("Elemento [" + l + "][" + c + "]: ");
                matriz[l][c] = scanner.nextInt();
            }
        }

        int[][] transposta = new int[2][3];

                for (int l=0;l<3;l++) { 
            for (int c=0;c<2;c++) {
                transposta[c][l] = matriz[l][c];
            }
        }

                System.out.println("\nMatriz Original (3x2):");
        for (int l=0;l<3;l++) {
            for (int c=0;c<2;c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz Transposta (2x3):");
        for (int l=0;l<2;l++) {
            for (int c=0;c<3;c++) {
                System.out.print(transposta[l][c] + " ");
            }
            System.out.println();
        }

        scanner.close();
	}

}
