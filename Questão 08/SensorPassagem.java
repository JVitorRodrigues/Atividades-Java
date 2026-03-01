class SensorPassagem {

    private int id;
    private boolean estaAtivado;

    public SensorPassagem(int id) {
        this.id = id;
        this.estaAtivado = false;
    }

    public void detectar() {
        estaAtivado = true;
    }

    public boolean isEstaAtivado() {
        return estaAtivado;
    }
}