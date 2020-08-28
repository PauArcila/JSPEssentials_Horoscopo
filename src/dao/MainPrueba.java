package dao;

import facade.Facade;

public class MainPrueba {

	public static void main(String[] args) {
		Facade facade = new Facade();
		System.out.println(facade.obtenerUsuarios());

	}

}
