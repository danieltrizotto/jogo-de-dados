package m.dadosjogo;

import java.util.Scanner;
import java.util.Random;

public class Dadosjogo {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random rolar1 = new Random();
        int dado = 0;// dado maquina
        int n = 0;//dado do jogador
        int menu = 0;
        int pontJ = 0;//ponto jogador
        int pontM = 0;//ponto maquina
        int i = 0;
        do {
            System.out.println("escolha uma dificuldade");
            System.out.println("1-facil");
            System.out.println("2-medio");
            System.out.println("3-dificil");
            System.out.println("0-sair");
            menu = leia.nextInt();
            switch (menu) {
                case 1:
                    pontJ = 0;
                    pontM = 0;
                  jogoLoop: 
                    for (i = 0; i < 3; i++) {
                        System.out.println("Escolha um número de 1-6");
                        n = leia.nextInt();
                        dado = rolar1.nextInt(6) + 1;  // Add 1 to ensure the range is 1-6
                        System.out.println("Dado da máquina: " + dado);

                        if (n > dado) {
                            pontJ++;
                        } else {
                            pontM++;
                        }

                        // ve se tem  um vencedor
                        if (pontJ > 1|| pontM > 1) {
                            break jogoLoop;
                        }
                    }        
///logica de vitoria
                    if (pontJ > pontM) {
                        System.out.println("JOGADOR VITORIOSO");
                    } else if (pontM > pontJ) {
                        System.out.println("MAQUINA VITORIOSA");
                    } else{
                        System.out.println("EMPATE");
                    }
                  
                    break;
            }
        } while (menu != 0);
    }
}
