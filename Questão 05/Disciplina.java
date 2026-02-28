
class Disciplina {
    double notaFinal;  
    double presenca;   

    
    Disciplina(double notaFinal, double presenca) {
        this.notaFinal = notaFinal;
        this.presenca = presenca;
    }

    
    boolean isAprovado() {
        
        return notaFinal >= 7.0 && presenca >= 75.0;
    }

    
    String resultado() {

        if (isAprovado()) {

            return "Aprovado";

        } else {

            return "Reprovado";
        }
    }
}
