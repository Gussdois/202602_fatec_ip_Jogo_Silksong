import javax.swing.JOptionPane;
public class jogo {
    public static void main(String... args){
        System.out.println("=================================");
        System.out.println("    HOLLOW KNIGHT: SILKSONG");
        System.out.println("      edicao POO em Java");
        System.out.println("=================================");
        String nome = JOptionPane.showInputDialog("Qual o nome do Jogador? ");
        System.out.println("Carregando save de "+ nome + "...");
    }
}
