public class Ballena extends Acuatico{
  
  private int largo;

  public Ballena(String nombre, String lugarOrigen, String color, int numAletas, int largo){
    super(nombre, lugarOrigen, color, numAletas);
    this.largo=largo;
    }
  


  public int getLargo(){
    return largo;
  }

  public void setLargo(int largo){
    this.largo=largo;
  }

  public void pelearConPinocho(){
    System.out.println("Te voy a comer Pinocho");
  }

  @Override
  public String toString(){
    return super.toString()+"Ballena{largo="+largo+"}";
  }
}