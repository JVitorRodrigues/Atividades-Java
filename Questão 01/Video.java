public class Video{

 public String titulo;
 public int duracao;
 public boolean estarDandoPlay;

 
 public Video () {
    this.estarDandoPlay = true ;

 }

 public void alternarPlay(){ 
       
    this.estarDandoPlay = !this.estarDandoPlay;

 }
}

 

