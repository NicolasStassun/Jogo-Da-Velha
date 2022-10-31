import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        Random ppt = new Random();
        int jogadorOpcao, pcOpcao;

        System.out.println("Escreva se você deseja: \n" +
                "0 - Pedra.\n" +
                "1 - Papel.\n" +
                "2 - Tesoura.\n");
        jogadorOpcao = sc.nextInt();
        pcOpcao = ppt.nextInt(2);

        if(jogadorOpcao==pcOpcao){
            System.out.println("O Jogo empatou.");
            main(args);
        }
        else if((jogadorOpcao==1 & pcOpcao==2) || (jogadorOpcao==2 & pcOpcao==0)||(jogadorOpcao==0 & pcOpcao==1)){
            System.out.println("O Jogador Perdeu!");
            main(args);
        }
        else{
            System.out.println("O Jogador Ganhou!");
            main(args);
        }
    }


}
