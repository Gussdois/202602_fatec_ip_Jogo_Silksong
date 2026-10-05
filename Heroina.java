public class Heroina {
    private String nome;
    private int mascaras;
    private int seda;

public Heroina(String nome){
    this.nome = nome;
    this.mascaras = 5;
    this.seda = 0;
}
public String getNome(){
    return nome;
}
public int getMascaras(){
    return mascaras;
}
public int getSeda(){
    return seda;
}
public String toString(){
    return String.format("%s | Mascaras: %d/5 | Seda: %d/9", this.nome,this.mascaras,this.seda);
}
}
