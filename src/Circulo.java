package src;
import java.util.*;
public class Circulo{

	private double radio=0;
	
	Circulo(int radio){
	this.radio = radio;
	}
	public double getArea(){
		return (3.14159265*radio*radio);
	}
	public double getPerimetro(){
		return  (2*3.14159265*radio);
	}
	public void getAreayPerimetro(){
	System.out.println("Area " + getArea());
	System.out.println("Perimetro " + getPerimetro());
	}
	
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese el radio");
	int s = sc.nextInt();
	Circulo cuadra = new Circulo(s);
	cuadra.getAreayPerimetro();
	}
	

}
