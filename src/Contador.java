package src;
import java.util.*;
public class Contador{

	private int a = 0;
	public Contador(){
	System.out.println(" Constructor por defecto ");
	}

	public Contador(int Numero){
	System.out.println(" Constructor por defecto 2");
	}

	public Contador(int incremento, int decremento, int cont){
	}
	public void getAumentar(){
	a++;
	}
	public void getDecremento(){
	a--;
	}
	public void mostrar(){
	System.out.println(" " + a);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
	Contador jer = new Contador();
	Contador jer1 = new Contador(1);
	Contador jer2 = new Contador(1,2,3);	
	boolean a = true;
	
	while(a){
	System.out.println("ingrese a , b , m , s");
	String ssss = sc.nextLine();
		if (ssss.equals("a")){
		System.out.println("!!!!!!!!!!!!!!!!!!");
		jer2.getAumentar();
		jer2.mostrar();
		}
		if (ssss.equals("b")){
		jer2.getDecremento();
		jer2.mostrar();
		}
			if (ssss.equals("m")){
		jer2.mostrar();
		}
		if (ssss.equals("s")){
		a = false;
		}
	}
	}

}

