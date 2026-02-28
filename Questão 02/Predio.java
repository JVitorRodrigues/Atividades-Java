
public class Predio{


    public static void main (String [] args ){

       Elevador elevador = new Elevador();
       

       elevador.Subir();
       elevador.Subir();
       elevador.Subir();
       elevador.Descer();

        for(int i = 0 ; i <4; i ++){
           elevador.Descer(); 
        }
    }
}