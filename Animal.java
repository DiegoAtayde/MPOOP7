public class Animal {

  private String nombre;
  private String lugarOrigen;
  private String color;

  public Animal(String nombre, String lugarOrigen, String color){
    this.nombre=nombre;
    this.lugarOrigen=lugarOrigen;
    this.color=color;
  }

  

  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre=nombre;
  }

  public String getLugarOrigen(){
    return lugarOrigen;
  }

  public void setLugarOrigen(String lugarOrigen){
    this.lugarOrigen=lugarOrigen;
  }

  public String getColor(){
    return color;
  }

  public void setColor(String color){
    this.color=color;
  }

  public void hacerSonido(String sonido){
    System.out.println("Estoy haciendo un sonido "+sonido);
  }

  public void comer(){
    System.out.println("Estoy comiendo");
  }

  @Override
  public String toString(){
    return "Animal {nombre="+nombre+" origen="+lugarOrigen+" color="+color+"}";
}
}