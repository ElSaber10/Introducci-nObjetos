package src;
import java.util.*;
public class Rectangulo{

	private double ancho=0, largo = 0;
	
	Rectangulo(int largo , int ancho){
	this.largo = largo;
	this.ancho = ancho;	
	}
	public double getArea(){
		return (ancho*largo);
	}
	public double getPerimetro(){
		return  (2*largo + 2*ancho);
	}
	public void getAreayPerimetro(){
	System.out.println("Area " + getArea());
	System.out.println("Perimetro " + getPerimetro());
	}
	public static void pedirDatos(){
	Scanner sc = new Scanner(System.in);
	boolean aa = true;
		while(aa){
		System.out.println("Ingrese el Ancho");
		int a = sc.nextInt();
		System.out.println("Ingrese el Ancho");
		int b = sc.nextInt();
			if (a != b){
			Rectangulo rec = new Rectangulo(a,b);
				rec.getAreayPerimetro();
			break;
			}else{
					System.out.println("Son iguales. intente de nuevo");
			}
		}
	}
	
	public static void main (String[] args){
	pedirDatos();
	}
	

}
