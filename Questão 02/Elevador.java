public class Elevador {

    int andarAtual;
    int totalAndares;
    
    public Elevador (){
        this.andarAtual = 0;
        this.totalAndares = 5;  

    }
    public void Subir(){
        if(andarAtual < totalAndares){
            andarAtual++;
            System.out.println("Subir para o Andar: "+ andarAtual);
        }
        else {
            System.out.println("Já está no último Andar!");
        }
        

        }
    public void Descer(){

        if (andarAtual > 0){
            andarAtual--;
            System.out.println("Descer par o Andar: "+andarAtual);
    
        }
        else{
            System.out.print("Já está no Térrio!");

        }
    }   
    
}

