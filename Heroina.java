import lombok.Getter;
@Getter
public class Heroina {
    private String nome;
    private int mascaras;
    private int seda;

public Heroina(String nome){
    this.nome = nome;
    this.mascaras = 5;
    this.seda = 0;
}
public void atacar(){
    System.out.println(this.nome + " ataca com a agulha!");
    this.seda = Math.min(this.seda + 1, 9);
}
public void atacar(int vezes){
    for (int i = 0; i < vezes; i++) {
        atacar();
    }
}
public void receberDano(int dano) {
    this.mascaras = Math.max(this.mascaras - dano, 0);
    System.out.println(this.nome + " recebeu " + dano + " de dano.");
}
public void curar(){
    if (this.seda == 9){
        this.mascaras = Math.min(this.mascaras + 3, 5);
        this.seda = 0;
        System.out.println(this.nome + " se amarrou com seda e recuperou mascaras.");
    } 
    else{
        System.out.println(this.nome + " nao tem seda suficiente para se curar.");
    }
}
public boolean estaDerrotada(){
        return this.mascaras == 0;
    }
public String toString(){
    return String.format("%s | Mascaras: %d/5 | Seda: %d/9", this.nome,this.mascaras,this.seda);
    }
}