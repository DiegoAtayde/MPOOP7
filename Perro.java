public class Perro extends Terrestre{
  
  private String colorCollar;

  public Perro(String nombre, String lugarOrigen, String color, int numPatas, String colorCollar){
    super(nombre, lugarOrigen, color, numPatas);
    this.colorCollar=colorCollar;
    }
  


  public String getColorCollar(){
    return colorCollar;
  }

  public void setColorCollar(String colorCollar){
    this.colorCollar=colorCollar;
  }

  public void hacerTrucos(String truco){
    System.out.println("Estoy "+truco);
  }

  @Override
  public String toString(){
    return super.toString()+"Perro{color Collar="+colorCollar+"}";
  }
}