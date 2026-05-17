import java.util.Scanner;
public class caixa_eletronico2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float preco = 1;
        float soma = 0;

        while(preco != 0){
            System.out.println("digite o valor do produto(digite 0 para finalizar)");
            preco = sc.nextFloat();
            soma += preco;
        }
            System.out.println("o preço total dos produtos foram: " + soma);
        sc.close();
    }
}
