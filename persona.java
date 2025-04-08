package EjerciciosClase;

public class persona {
private String nombre;
private String colorFav;
private int edad;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getColorFav() {
	return colorFav;
}
public void setColorFav(String colorFav) {
	this.colorFav = colorFav;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
	
}
public persona(String nombre, String colorFav, int edad) {
	super();
	this.nombre = nombre;
	this.colorFav = colorFav;
	this.edad = edad;
} 


}
