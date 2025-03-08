import java.util.Scanner;

public class NumerosAmigos {


        int suma = 0;
        for (int i = 1; i = numero / 2; i++) {
            if (numero % i == 0) { 
                suma += i;
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("coloque el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("coloque el segundo numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 <= 0 || numero2 <= 0) {
            System.out.println("Ambos números deben ser enteros positivos.");
        } else {
            int sumaDivisores1 = sumaDivisoresPropios(numero1);
            int sumaDivisores2 = sumaDivisoresPropios(numero2);

            if (sumaDivisores1 == numero2 && sumaDivisores2 == numero1) {
                System.out.println("Los números " + numero1 + " y " + numero2 + " son amigos.");
            } else {
                System.out.println("Los números " + numero1 + " y " + numero2 + " NO son amigos.");
            }
        }



