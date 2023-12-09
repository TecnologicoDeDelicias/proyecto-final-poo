package mx.tecnm.delicias.poo.unit3.exam;

public class Animal {

  protected String nombre = "";

  public Animal(String nombre) {
    this.nombre = nombre;
  }

  public String getSpecie() {
    return "Unknown";
  }

  public String greeting() {
    return "Hello, my name is " + this.nombre + " and I am of " + this.getSpecie() + " specie.";
  }
}
