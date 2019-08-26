package com.senati.ddw04;

public class ImplementarCelular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un objeto celular1 de la clase Celular
		//Clase - Objeto = new Clase(1,"Huawei", 900);
		//Clase Objeto = new Clase();
		//Objeto.id = 1;
		//Objeto.modelo = "Samsumg";
		//Objeto.precio = 900f;
	
		Celular Cel1 = new Celular();
		Cel1.id = 1;
		Cel1.modelo = "Samsumg";
		Cel1.precio = 900f;
		
		System.out.println("Datos registrados");
		System.out.println(Cel1.toString());
		
		
		//Crea un objeto Cel2 y agregas sus caracteristicas
		
		Celular Cel2 = new Celular();
		Cel2.id = 2;
		Cel2.modelo = "Xiaomi";
		Cel2.precio = 600f;
		
		System.out.println("Datos Registrados");
		System.out.println(Cel2.toString());
	}

}
