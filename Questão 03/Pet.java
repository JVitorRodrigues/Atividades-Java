public class Pet {

    String nome;
    int fome;

    void alimentar() {
        fome -= 10;

        if (fome < 0) {
            fome = 0;
        }
    }

    void dadosPet() {

        System.out.println("==== Status Pet ====");
        System.out.println("Nome: " + nome);
        System.out.println("Fome Atual: " + fome);
        System.out.println("====================");
    }
}