import java.util.Scanner;

public class votacao {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int nulo = 0;
        int joao = 0;
        int maria = 0;
        String voto = "";

        for(int i =0; i < 10; i++){
            System.out.println("digite em quem voce deseja votar (joão = 1, maria = 2, nulo = outro");
            voto = sc.nextLine();

            if(voto.equals("1")){
                joao += 1;
            }
            else if(voto.equals("2")){
                maria += 1;
            }
            else{
                nulo += 1;
            }
        }

        System.out.println("os resultados da votação foi \n maria = " + maria + " votos \n joão = " + joao + " votos \n nulo = " + nulo + " votos");

        if(joao > maria && joao > nulo){
            System.out.println("o vencedor foi joao");
        }
        else if (maria > joao && maria > nulo){
            System.out.println("o vencedor foi maria");
        }
        else{
            System.out.println("ninguem venceu, a maioria foi nulo");
        }

        sc.close();
    }
}
