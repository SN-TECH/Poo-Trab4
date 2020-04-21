package app;

public class Reptil extends Animal{

    private String corEscama;
  
    public Reptil(float peso, int idade, int membros, String corEscama){
      this.peso = peso;
      this.idade = idade;
      this.membros = membros;
      this.corEscama = corEscama;
    }
  
    //Locomover
    @Override
    public void Locomover(){
      System.out.println("Rastejando");
    }
  
    //Alimentar
    @Override
    public void Alimentar(){
      System.out.println("Comendo Vegetais");
    }
  
    //Emitir-som
    @Override
    public void Emitirsom(){
      System.out.println("Som de Reptil");
    }
}