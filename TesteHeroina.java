public class TesteHeroina {
    public static void main(String... args){
        Heroina hornet = new Heroina("Hornet");
        System.out.println(hornet.toString());
        hornet.curar();
        hornet.atacar(9);
        System.out.println(hornet.toString());
        hornet.receberDano(4);
        System.out.println(hornet.toString());
        hornet.curar();
        System.out.println(hornet.toString());
        hornet.receberDano(10);
        System.out.println(hornet.toString());
        System.out.println("Derrotada? " + hornet.estaDerrotada());


    }
}
