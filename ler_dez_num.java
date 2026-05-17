import java.util.Scanner;
public class ler_dez_num {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float num = 0;
        float soma = 0;
        float media = 0;
        float maior = Float.MIN_VALUE;
        float menor = Float.MAX_VALUE;
        float soma_par = 0;
        float soma_impar = 0;
        float quantidade_par = 0;
        float quantidade_impar = 0;
        for(int i = 0; i < 10; i ++){
            System.out.println("digite o " + (i + 1) + "º numero");
            num = sc.nextFloat();
            soma += num;

            if (num >  maior){
                maior = num;
            }
            if(num < menor){
                menor = num;
            }


            if(num % 2 == 0){
                soma_par += num;
            }
            else{
                soma_impar += num;
            }


            if(num % 2 == 0){
                quantidade_par += 1;
            }
            else{
                quantidade_impar += 1;
            }
        }
        media = soma / 10;

System.out.println("a soma é " + soma);
System.out.println("a media é " + media);
System.out.println("o maior numero é " + maior);
System.out.println("o menor numero é " + menor);
System.out.println("a soma dos numeros pares é " + soma_par);
System.out.println("a soma dos numeros impares é " + soma_impar);
System.out.println("a quantidade de numeros pares é de " + quantidade_par);
System.out.println("a quantidade de numeros impares é de " + quantidade_impar);

    sc.close();
    }
}
