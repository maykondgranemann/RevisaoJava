package R08;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[2];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = -1;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite numero impar(%d):", i);
            int n = Integer.parseInt(sc.nextLine());
            if(n % 2 != 0){
                numeros[i] = n;
            }else{
                System.out.println("O numero nao é impar! Digite novamente");
                i--;
            }
        }

        for (int n : numeros) {
            System.out.println(n);
        }
    }
}