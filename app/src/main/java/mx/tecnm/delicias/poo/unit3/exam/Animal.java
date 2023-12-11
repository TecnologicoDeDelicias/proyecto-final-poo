package mx.tecnm.delicias.poo.unit3.exam;

public class Animal {

  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public String getSpecie() {
    return "Unknown";
  }

  public String greeting() {
    return "Hello, my name is " + name + " and I am of " + getSpecie() + " specie.";
  }
}
