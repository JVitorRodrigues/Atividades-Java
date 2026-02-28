
public class Controle {

    public static void main(String[] args) {

        ArCondicionado ar = new ArCondicionado();
        
        System.out.println("Temperatura inicial: " + ar.getTemperatura() + "°C");

        System.out.println("\nTentativa de ajustar para 2°C...");
        ar.setTemperatura(2);  

        System.out.println("Temperatura após tentativa inválida: " + ar.getTemperatura() + "°C");

        System.out.println("\nTentativa de ajustar para 25°C...");
        ar.setTemperatura(25);  

        System.out.println("Temperatura final: " + ar.getTemperatura() + "°C");
    }
}