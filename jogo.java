import javax.swing.JOptionPane;
import java.util.Scanner;

public class Jogo {
    public static void main(String... args) throws InterruptedException {
        System.out.println("=================================");
        System.out.println("    HOLLOW KNIGHT: SILKSONG     ");
        System.out.println("       edicao POO em Java        ");
        System.out.println("=================================");
        String nome = JOptionPane.showInputDialog("Qual o nome do Jogador? ");
        System.out.println("Carregando save de " + nome + "...");
        Heroina hornet = new Heroina("Hornet");
        System.out.println(hornet);

        Inimigo chefe = new Inimigo("Moss Mother", 12, 1);
        Scanner sc = new Scanner(System.in);

        int turno = 1;
        boolean fugiu = false;

        do {
            System.out.println("\n========== Turno " + turno + " ==========");
            System.out.println(hornet);
            System.out.println(chefe);
            System.out.println("1 - Atacar | 2 - Curar | 0 - Fugir");
            System.out.print("Escolha sua acao: ");
            
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    hornet.atacar();
                    chefe.receberGolpe();
                    break;
                case 2:
                    hornet.curar();
                    break;
                case 0:
                    fugiu = true;
                    System.out.println(hornet.getNome() + " fugiu da batalha!");
                    break;
                default:
                    System.out.println("Opcao invalida. Perdeu a vez!");
                    break;
            }
            if (!chefe.estaDerrotado() && !fugiu && turno % 3 == 0) {
                System.out.println("\n--- " + chefe.getNome() + " contra-ataca! ---");
                hornet.receberDano(chefe.getDano());
            }
            turno++;
            Thread.sleep(1000);
            
        } while (!fugiu && !hornet.estaDerrotada() && !chefe.estaDerrotado());

        System.out.println("\n=================================");
        if (chefe.estaDerrotado()) {
            System.out.println("VITORIA! Voce derrotou " + chefe.getNome() + "!");
        } else if (hornet.estaDerrotada()) {
            System.out.println("GAME OVER! Hornet foi derrotada...");
        } else {
            System.out.println("Batalha encerrada por fuga.");
        }
        System.out.println("=================================");

        System.out.println("Status final da Heroina:");
        System.out.println(hornet);

        sc.close();
    }
}