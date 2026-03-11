public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nome=input.nextLine();
        System.out.print("Inserisci la tua età: ");
        int eta=input.nextInt();
        System.out.println("Ciao "+nome+", hai " +eta+ " anni");
        input.close();
    }
}