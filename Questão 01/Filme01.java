public class Filme01{
    public static void main ( String[] args ) throws Exception {

        Video filme01 = new Video();
        filme01.titulo = "Eu Sou A Lenda";
        filme01.duracao = 60;

        Video filme02 = new Video ();
        filme02.titulo = "O Ultimo Sobrivivente";
        filme02.duracao = 58;
       
        System.out.println("--------------------------------------------------------------");

        System.out.println("Filme 01: "+filme01.titulo);
        System.out.println("Duração de "+filme01.duracao+" minutos");
        System.out.println("Estar dando play?: "+ filme01.estarDandoPlay);

        System.out.println("--------------------------------------------------------------");
        
        System.out.println("Filme 02: "+ filme02.titulo);
        System.out.println("Duração do filme: " + filme02.duracao+" minutos");
        System.out.println("Estar dando play?: "+filme02.estarDandoPlay);}

 

    }

