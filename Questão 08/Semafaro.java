class Semaforo {

    private String cor;

    public Semaforo(String corInicial) {
        this.cor = corInicial;
    }

    public String getCor() {
        return cor;
    }

    public void trocar() {
        if (cor.equals("Vermelho")) {
            cor = "Verde";
        } else {
            cor = "Vermelho";
        }
    }
}