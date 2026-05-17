import java.util.Scanner;
public class caixa_eletronico3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float saldo = 500;
        int acao = 1;
        float saque_saldo = 0;
        float deposito = 0;
        while(acao != 0){
            System.out.println("o que voce deseja fazer");
            System.out.println("1 Saque\n" + "2 Depósito\n" + "3 Saldo\n" + "0 Sair");

            acao = sc.nextInt();

            if(acao == 1){
                System.out.println("qual o valor que deseja sacar");
                saque_saldo = sc.nextFloat();

                if(saque_saldo > 0 && saque_saldo <= saldo){
                    saldo -= saque_saldo;
                }
                 else{
                    System.out.println("o valor inserido é invalido");
                 }
            }
            else if(acao == 2){
                System.out.println("quanto deseja depositar");
                deposito = sc.nextFloat();
                if (deposito > 0){
                    saldo += deposito;
                }
                else{
                    System.out.println("o valor inserido é invalido");
                }

            }

            else if(acao == 3){
                System.out.println("o saldo atual é de " + saldo);
            }
            else if(acao != 0){
                System.out.println("acao invalida");
            }
        }

        if(acao == 0){
            System.out.println("Programa encerrado com sucesso");
        }
sc.close();
    }
}

//Desenvolver um aplicativo para um caixa eletrônico com saldo inicial de R$ 500,00 com as seguintes opções:

//1 Saque
//2 Depósito
//3 Saldo
//0 Sair

//Repetir até sair.