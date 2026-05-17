public class soma_dos_mutiplosDe3{
    public static void main(String[] args){
        int soma = 0;
        for(int i = 0; i < 100; i ++){
            if(i % 3 == 0){
                soma += i;
            }
        }
        System.out.println("a soma de todos os mutiplos entre 0 e 100 é de: " + soma);
    }
}