import java.util.Scanner;
public class notas {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float[][] notas = new float[4][4];
        float media1 = 0;
        float media2 = 0;
        float media3 = 0;
        float media4 = 0;

        String situacao1 = "";
        String situacao2 = "";
        String situacao3 = "";
        String situacao4 = "";

        float soma1 = 0;
        float soma2 = 0;
        float soma3 = 0;
        float soma4 = 0;
        for(int alunos = 0; alunos < 4; alunos++){
            for(int nota = 0; nota < 4; nota ++){
                System.out.println("digite a nota " + (nota + 1) + " do aluno " + (alunos + 1));
                notas[alunos][nota] = sc.nextFloat();
                if (alunos == 0){
                    soma1 += notas[alunos][nota];
                }
                 else if(alunos == 1){
                       soma2 += notas[alunos][nota];
                 }
                else if(alunos == 2){
                       soma3 += notas[alunos][nota];
                 }
                 else if(alunos == 3){
                       soma4 += notas[alunos][nota];
                 }
            }
        }
        media1 = soma1 / 4;
        media2 = soma2 / 4;
        media3 = soma3 / 4;
        media4 = soma4 / 4;
           //aluno 1
        if(media1 >= 7 && media1 <= 10){
            situacao1 = " o aluno foi aprovado";
        }
        else if(media1 >= 5 && media1 < 7){
            situacao1 = " o aluno ficou de recuperação";
        }
        else if(media1 >= 0 && media1 < 5){
            situacao1 = " o aluno foi reprovado";
        }
        // aluno 2
        if(media2 >= 7 && media2 <= 10){
            situacao2 = "o aluno foi aprovado";
        }
        else if(media2 >= 5 && media2 < 7){
            situacao2 = " o aluno ficou de recuperação";
        }
        else if(media2 >= 0 && media2 < 5){
            situacao2 = " o aluno foi reprovado";
        }

         //aluno 3
        if(media3 >= 7 && media3 <= 10){
            situacao3 = " o aluno foi aprovado";
        }
        else if(media3 >= 5 && media3 < 7){
            situacao3 = " o aluno ficou de recuperação";
        }
        else if(media3 >= 0 && media3 < 5){
            situacao3 = " o aluno foi reprovado";
        }

        //aluno 4
        if(media4 >= 7 && media4 <= 10){
            situacao4 = " o aluno foi aprovado";
        }
        else if(media4 >= 5 && media4 < 7){
            situacao4 = " o aluno ficou de recuperação";
        }
        else if(media4 >= 0 && media4 < 5){
            situacao4 = " o aluno foi reprovado";
        }
        
        System.out.println("a media do aluno 1 foi " + media1 +  situacao1);
        System.out.println("a media do aluno 2 foi " + media2 + situacao2);
        System.out.println("a media do aluno 3 foi " + media3 + situacao3);
        System.out.println("a media do aluno 4 foi " + media4 + situacao4);

        sc.close();
    }
}
