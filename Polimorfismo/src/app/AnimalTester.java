package app;

public class AnimalTester {
    public static void main(String[] args) throws Exception {

        System.out.println("***********PEIXE**********\n");
        Peixe p = new Peixe(1, 3, 2, "Azul");
        p.Alimentar();
        p.Emitirsom();
        p.Locomover();
        p.Soltarbolha();

        System.out.println("\n***********AVE**********\n");
        Ave a = new Ave(4, 1, 2, "Preto e Branco");
        a.Alimentar();
        a.Emitirsom();
        a.Locomover();
        a.Fazerninho();

        System.out.println("\n***********MAMIFERO**********\n");
        Mamifero m = new Mamifero(15, 7, 4, "Amarelo");
        m.Locomover();
        m.Alimentar();
        m.Emitirsom();        

        System.out.println("\n***********REPTIL**********\n");
        Reptil r = new Reptil(100, 50, 4, "Verde musgo");
        r.Alimentar();
        r.Emitirsom();
        r.Locomover();

        System.out.println("\n***********CANGURU**********\n");
        Canguru c = new Canguru(75, 12, 4, "Caramelo");
        c.Alimentar();
        c.Emitirsom();
        c.Locomover();         
    }
}