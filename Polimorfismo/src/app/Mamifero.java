package app;

public class Mamifero extends Animal{

    protected String corPelo;
  
    public Mamifero(float peso, int idade, int membros, String corPelo){
      this.peso = peso;
      this.idade = idade;
      this.membros = membros;
      this.corPelo = corPelo;
    }
  
    //Locomover
    @Override
    public void Locomover(){
      System.out.println("Andando");
    }
  
    //Alimentar
    @Override
    public void Alimentar(){
      System.out.println("Mamando");
    }
  
    //Emitir-som
    @Override
    public void Emitirsom(){
      System.out.println("Som de mamimero");
    }
}