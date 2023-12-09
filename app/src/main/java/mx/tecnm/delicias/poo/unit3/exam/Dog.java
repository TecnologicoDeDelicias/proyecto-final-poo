package mx.tecnm.delicias.poo.unit3.exam;

public class Dog extends Animal {

  private String comidaFavorita;

  public Dog(String nombre, String comidaFavorita) {
    super(nombre);
    this.comidaFavorita = comidaFavorita;
    // TODO Auto-generated constructor stub
  }

  public String getSpecie() {
    return "Canine";
  }

  public String greeting() {
    return "Hello, my name is "
        + this.nombre
        + " and I am of "
        + this.getSpecie()
        + " specie. My favorite food is "
        + this.comidaFavorita;
  }
}
