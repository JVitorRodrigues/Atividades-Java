public class Guerreiro {

    private int vida;
    private int escudo;

    public Guerreiro(int vida, int escudo) {
        this.vida = vida;
        this.escudo = escudo;
    }
    public void receberDano(int pontos) {

        if (escudo > 0) {

            if (pontos <= escudo) {
                escudo -= pontos; 
            } else {
                int restante = pontos - escudo;
                escudo = 0;
                vida -= restante; 
            }

        } else {
            vida -= pontos; 
        }
        if (vida < 0) {
            vida = 0;
        }
    }
    public int getVida() {
        return vida;
    }

    public int getEscudo() {
        return escudo;
    }
}
   
