package src;
import java.util.*;
public class Cuadrado{

	private int lado=0;
	
	Cuadrado(int lado){
	this.lado = lado;
	}
	public int getArea(){
		return lado*lado;
	}
	public int getPerimetro(){
		return lado*2;
	}
	public void getAreayPerimetro(){
	System.out.println("Area " + getArea());
	System.out.println("Perimetro " + getPerimetro());
	}
	
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese el lado");
	int s = sc.nextInt();
	Cuadrado cuadra = new Cuadrado(s);
	cuadra.getAreayPerimetro();
	}
	

}
