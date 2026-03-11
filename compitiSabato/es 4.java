public class Persona{
    String nome;
    int eta;
    void presentati(){
        System.out.print("Ciao, mi chiamo "+nome+" e ho "+eta+" anni");
    }
}
public class Main{
    public static void main(String[] args){
        Persona p1=new Persona();
        p1.nome="Luca";
        p1.eta=17;
        p1.presentati();
    }
}