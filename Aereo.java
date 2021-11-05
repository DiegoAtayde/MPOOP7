public class Aereo extends Animal{

  private int numAlas;

  public Aereo(String nombre, String lugarOrigen, String color, int numAlas){
    super(nombre, lugarOrigen, color);
    this.numAlas=numAlas;
  }



  public int getNumAlas(){
    return numAlas;
  }

  public void setNumAlas(int numAlas){
    this.numAlas=numAlas;
  }

  public void volar(){
    System.out.println("Estoy volando");
  }

  @Override
  public String toString(){
    return super.toString()+"Aereo{numAlas="+numAlas+"}";
}
}