package aulas.aula07;

public class aula7 {
    public static void main(String[] args) {


    }
    
    public enum Semaforo{

        VERMELHO, AMARELO, VERDE;

        public String getAcao(){
            switch(this){
                case VERMELHO:
                    return "Pare";
                case AMARELO:
                    return "Aguarde";
                case VERDE:
                    return "Avance";
            }
            return null;
        }
    }

    public enum FaseDaLua{
        
    }
    
}
