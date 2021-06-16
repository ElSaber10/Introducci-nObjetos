package src;
import java.util.*;
public class Fraccion{

	private int total = 0;
	private int suma = 0;
	private int resta = 0;
	private int multiplicacion = 0;
	private int num1;
	private int num2;
	
	Fraccion(int num1, int num2){
	System.out.println("Contructor # 2");
	this.num1 = num2;
	this.num1 = num1;
	}
	public int getsuma(){
		return (total = num1 + num2);
	}
	public int getresta(){
		return (total = num1 - num2);
	}
	public int getmultiplicacion(){
		return (total = num1 * num2);
	}
	public int getnum1(){
		return (num1);
	}
	public int getnum2(){
		return  (num2);
	}
	public void setnum1(int num1){
	this.num1 = num1;
	}
	public void setnum2(int num2){
	this.num2 = num2;
	}
	public void settotal(int total){
	this.total = total;
	}
	public int gettotal(){
		return  (total);
	}
	
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
			//Libro lib = new Libro();
	System.out.println("Ingrese numero 1 ");
	int s = sc.nextInt();
	System.out.println("Ingrese numero 2 ");
	int ss = sc.nextInt();
		Fraccion lib = new Fraccion(s,ss);
		System.out.println("suma es " + lib.getsuma() + lib.gettotal());
		System.out.println("La resta es " + lib.getresta() + lib.gettotal());
		System.out.println("La multiplicacion es " + lib.getmultiplicacion()+ lib.gettotal());
	}
	
}
