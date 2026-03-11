public class Persona{
    String nome;
    int eta;
    public persona(String nome, int eta){
        this.nome=nome;
        this.eta=eta;
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