package app;

public class Canguru extends Mamifero{
    public Canguru(float peso, int idade, int membros, String corPelo){
      super(peso,idade,membros,corPelo);
    }
  
    //Locomover
    @Override
    public void Locomover(){
      System.out.println("Pulando");
    }
  
    //Alimentar
    @Override
    public void Alimentar(){
      System.out.println("Comendo vegetais");
    }
  
    //Emitir-som
    @Override
    public void Emitirsom(){
      System.out.println("Som de Canguru");
    }     
}