package ti2;
import java.util.*;

public class ti2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, soma;
        
        // Leituras
        System.out.println("Digite um número");
        num1 = sc.nextInt();
        System.out.println("Digite outro número");
        num2 = sc.nextInt();
        
        // Somar
        soma = num1 + num2;
        
        // Mostrar na tela
        System.out.println("Soma:" + soma);
        
        // Fechar o Scanner para liberar recursos
        sc.close();
    }
}
