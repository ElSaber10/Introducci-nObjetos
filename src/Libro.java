package src;
import java.util.*;
public class Libro{

	private int cantidadLibros = 10;
	private int prestamo;
	private int devolucion;
	
	Libro(){
	System.out.println("Contructor por defecto");
	}
	Libro(int prestamo, int devolucion){
	System.out.println("Contructor # 2");
	this.prestamo = prestamo;
	this.devolucion = devolucion;
	}
	public int getprestamo(){
		return (cantidadLibros-= prestamo);
	}
	public int getdevolucion(){
		return  (cantidadLibros+=devolucion);
	}
	public void setdevolucion(int devolucion){
	this.devolucion = devolucion;
	}
	public void setprestamo(int prestamo){
	this.prestamo = prestamo;
	}
	public void setcantidadLibros(int cantidadLibros){
	this.cantidadLibros = cantidadLibros;
	}
	public int getcantidadLibros(){
		return  (cantidadLibros);
	}
	
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
			//Libro lib = new Libro();
	System.out.println("Ingrese cuantos prestara ");
	int s = sc.nextInt();
	System.out.println("Ingrese cuantos devolvera ");
	int ss = sc.nextInt();
		Libro lib = new Libro(s,ss);
		System.out.println("Cantidad de libros " + lib.getcantidadLibros());
		lib.getprestamo();
		lib.getdevolucion();
		System.out.println("Cantidad de libros " + lib.getcantidadLibros());
	}
	
	

}
