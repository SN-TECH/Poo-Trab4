package app;

public class Peixe extends Animal{

    private String corEscama;
  
    public Peixe(float peso, int idade, int membros, String corEscama){
      this.peso = peso;
      this.idade = idade;
      this.membros = membros;
      this.corEscama = corEscama;
    }
  
    //Locomover
    @Override
    public void Locomover(){
      System.out.println("Nadando");
    }
  
    //Alimentar
    @Override
    public void Alimentar(){
      System.out.println("Comendo substancias");
    }
  
    //Emitir-som
    @Override
    public void Emitirsom(){
      System.out.println("Peixe não faz som");
    }
  
    //Soltar-bolha
    public void Soltarbolha(){
      System.out.println("Soltou uma bolha");
    } 
}