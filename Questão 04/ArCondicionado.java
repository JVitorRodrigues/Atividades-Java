public class ArCondicionado {
    
    private int temperaturaAtual;
    private static final int TEMP_MIN = 16;
    private static final int TEMP_MAX = 28;
    
    public ArCondicionado() {
        this.temperaturaAtual = 22; // valor inicial seguro
    }
   
    public void setTemperatura(int novaTemperatura) {

        if (novaTemperatura < TEMP_MIN) {
            System.out.println("Erro! Temperatura mínima permitida é " + TEMP_MIN + "°C.");
        } 
        else if (novaTemperatura > TEMP_MAX) {
            System.out.println("Erro! Temperatura máxima permitida é " + TEMP_MAX + "°C.");
        } 
        else {
            this.temperaturaAtual = novaTemperatura;
            System.out.println("Temperatura ajustada para " + this.temperaturaAtual + "°C.");
        }
    }

    public int getTemperatura() {
        return this.temperaturaAtual;
    }
} 
