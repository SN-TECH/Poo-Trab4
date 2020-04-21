package app;

public class Ave extends Animal{

  protected String corPena;

  public Ave(float peso, int idade, int membros, String corPena){
    this.peso = peso;
    this.idade = idade;
    this.membros = membros;
    this.corPena = corPena;
  }

  //Locomover
  @Override
  public void Locomover(){
    System.out.println("Voando");
  }

  //Alimentar
  @Override
  public void Alimentar(){
    System.out.println("Comendo frutas");
  }

  //Emitir-som
  @Override
  public void Emitirsom(){
    System.out.println("Som de ave");
  }

  //Fazer-ninho
  public void Fazerninho(){
    System.out.println("Construiu um ninho");
  }
 
}