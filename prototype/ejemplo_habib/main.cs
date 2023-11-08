using System;

public interface ISpartanPrototype{
  ISpartanPrototype Clone();
  void showDetails();
}

public class Spartan : ISpartanPrototype{
  private string name;
  private string armorColor;
  private int generation;
  private int id;

  public Spartan(string name, string armorColor, int generation, int id){
    this.name = name;
    this.armorColor = armorColor;
    this.generation = generation;
    this.id = id;
  }

  public ISpartanPrototype Clone(){
    return new Spartan(this.name, this.armorColor, this.generation, this.id);
  }

  public void showDetails(){
    Console.WriteLine($"Spartan: {name}, Armor Color: {armorColor}, Generation: {generation}, ID: {id}");
  }
  
}

class Program{
  static void Main(string[] args){
    ISpartanPrototype spartanPrototype = new Spartan("Master Chief", "Verde Bosque", 2, 117);
    
    ISpartanPrototype spartanUno = spartanPrototype.Clone();
    spartanUno.showDetails();
    spartanUno = new Spartan("Jerome", "Verde", 2, 92);
    spartanUno.showDetails();

    ISpartanPrototype spartanDos = spartanPrototype.Clone();
    spartanDos = new Spartan("Iskander Emilio Mercader Olivares", "Rojo", 501, 21017824);
    spartanDos.showDetails();
  }
}