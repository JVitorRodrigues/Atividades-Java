public class SistemaTransito {

    public static void main(String[] args) {

        Semaforo semaforo = new Semaforo("Vermelho");
        Veiculo ambulancia = new Veiculo("PPT-0107", "Ambulância");
        Via via = new Via("Avenida Rua Maranhão", 50);
        SensorPassagem sensor = new SensorPassagem(1);
        ControladorCentral controlador = new ControladorCentral();

        sensor.detectar();

       
        controlador.processarEvento(sensor, ambulancia, via, semaforo);
    }
}