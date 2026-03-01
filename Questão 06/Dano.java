public static void main(String[] args) {

        Guerreiro guerreiro = new Guerreiro(100, 50);{

        guerreiro.receberDano(100);

        System.out.println("Vida restante: " + guerreiro.getVida());
        System.out.println("Escudo restante: " + guerreiro.getEscudo());
    }
}