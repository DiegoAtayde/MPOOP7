public class Pajaro extends Aereo{
  
  private String tipoPico;

  public Pajaro(String nombre, String lugarOrigen, String color, int numAlas, String tipoPico){
    super(nombre, lugarOrigen, color, numAlas);
    this.tipoPico=tipoPico;
    }
  


  public String getTipoPico(){
    return tipoPico;
  }

  public void setTipoPico(String tipoPico){
    this.tipoPico=tipoPico;
  }

  public void recolectarRamas(){
    System.out.println("Voy a recolectar ramas");
  }

  @Override
  public String toString(){
    return super.toString()+"Pajaro{tipo Pico="+tipoPico+"}";
  }
}