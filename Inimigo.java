import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Inimigo {
    private String nome;
    private int vida;
    private int dano;

    public Inimigo(String nome, int vida, int dano) {
        this.nome = nome;
        if (vida >= 1 && vida <= 20) {
            this.vida = vida;
        } else {
            this.vida = 10;
        }

        if (dano >= 1 && dano <= 2) {
            this.dano = dano;
        } else {
            this.dano = 1;
        }
    }

    public Inimigo(String nome) {
        this(nome, 10, 1);
    }

    public void receberGolpe() {
        this.vida = Math.max(this.vida - 1, 0);
        System.out.println(this.nome + " recebeu 1 de dano.");
    }

    public boolean estaDerrotado() {
        return this.vida == 0;
    }
}