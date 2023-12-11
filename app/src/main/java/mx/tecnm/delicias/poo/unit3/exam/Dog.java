package mx.tecnm.delicias.poo.unit3.exam;

public class Dog extends Animal {

  private String fav;

  public Dog(String name, String fav) {
    super(name);
    this.fav = fav;
  }

  public String getSpecie() {
    return "Canine";
  }

  public String greeting() {
    return super.greeting() + " My favorite food is " + fav;
  }
}
