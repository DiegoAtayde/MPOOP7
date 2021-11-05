public class Acuatico extends Animal{

  private int numAletas;

  public Acuatico(String nombre, String lugarOrigen, String color, int numAletas){
    super(nombre, lugarOrigen, color);
    this.numAletas=numAletas;
  }



  public int getNumAletas(){
    return numAletas;
  }

  public void setNumAletas(int numAletas){
    this.numAletas=numAletas;
  }

  public void nadar(){
    System.out.println("Estoy nadando");
  }

  @Override
  public String toString(){
    return super.toString()+"Acuatico{numAletas="+numAletas+"}";
}
}