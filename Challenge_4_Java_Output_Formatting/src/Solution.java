import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                // % 	Significa un argumento que vamos a cambiar el formato
                // - 	Significa que se encontrará en la parte izquierda
                // 15 	Significa que tendra una longitud de 15
                // s 	Significa que vamos a imprimir un dato de tipo string
                
                // 0 	Significa que se añaden de 0 y por defecto a la derecha
                // d 	Significa que vamos a imprimir un dato de tipo int
                System.out.printf("%-15s%03d\n", s1, x);
            }
            System.out.println("================================");

    }
}