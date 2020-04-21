package app;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    
    //Locomover
    public abstract void Locomover();
    
    //Alimentar
    public abstract void Alimentar();
  
    //Emitir-som
    public abstract void Emitirsom();
  
  }