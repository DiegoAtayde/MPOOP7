public class Terrestre extends Animal{

  private int numPatas;

  public Terrestre(String nombre, String lugarOrigen, String color, int numPatas){
    super(nombre, lugarOrigen, color);
    this.numPatas=numPatas;
  }



  public int getNumPatas(){
    return numPatas;
  }

  public void setNumPatas(int numPatas){
    this.numPatas=numPatas;
  }

  public void correr(){
    System.out.println("Estoy corriendo");
  }

  @Override
  public String toString(){
    return super.toString()+"Terrestre{numPatas="+numPatas+"}";
}
}