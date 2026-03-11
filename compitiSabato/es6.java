public class Persona{
    String nome;
    int eta;
    public persona(String nome, int eta){
        this.nome=nome;
        this.eta=eta;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public int getEta(){
        return eta;
    }

    public void setEta(int eta){
        if (eta>=0) {
            this.eta=eta;
        } else{
            System.out.println("Errore: età non valida");
        }
    }
    void presentati(){
        System.out.print("Ciao, mi chiamo "+nome+" e ho "+eta+" anni")
    }
}
public class Main{
    public static void main(String[] args){
        Persona p1=new Persona("Luca",17);
        p1.presentati();
    }
}
