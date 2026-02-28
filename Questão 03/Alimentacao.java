public class Alimentacao{

    public static void main ( String[] args ){

        Pet pet = new Pet();

        pet.nome = "Noe"; 
        pet.fome = 5;

         if (pet.fome > 100) {
            pet.fome = 100;
         }

        System.out.println("Antes de alimentar:");
        pet.dadosPet();

        pet.alimentar();

        System.out.println("Depois de alimentar:");
        pet.dadosPet();
       
    }
}
