class ControladorCentral {

    public void processarEvento(SensorPassagem sensor, Veiculo veiculo, Via via, Semaforo semaforo) {

        if (sensor.isEstaAtivado() && veiculo.getTipo().equals("Ambulância")) {

            if (semaforo.getCor().equals("Vermelho")) {
                semaforo.trocar();

                System.out.println("Prioridade detectada para " 
                        + veiculo.getPlaca() 
                        + " na " 
                        + via.getNome() 
                        + ". Sinal alterado para Verde.");
            }
        }
    }
}