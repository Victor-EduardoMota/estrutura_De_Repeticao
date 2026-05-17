import java.util.Scanner;
public class caixa_eletronico1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
int senha = 0;
    System.out.println("---Caixa eletronico---");
for (int i = 0; i < 3; i++){
    System.out.println("Digite a senha");
    senha = sc.nextInt();
    if (senha == 4123){
        System.out.println("Acesso liberado");
        break;
    }
    else{
        System.out.println("Senha incorreta");
    }
}
if (senha != 4123){
    System.out.println("Acesso negado");

}

        sc.close();
    }
}