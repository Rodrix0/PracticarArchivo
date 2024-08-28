package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArchivoTests {
    @Test
	void CrearArchivo(){//creo archivo
		Archivo archivo= new Archivo("Rodrix1",68);
		assertEquals("Rodrix1",archivo.getNombre());
		assertEquals(68,archivo.getTamanio());
	}
    @Test
	void CrearCarpeta(){//creo carpeta
		Carpeta carpeta= new Carpeta("Rodrix1",68);
		assertEquals("Rodrix1",carpeta.getNombre());
		assertEquals(68,carpeta.getTamanio());
	}
    @Test
	void Guardar_en_distintas_carpetas(){
		Carpeta carpeta= new Carpeta("UCP",68);
        Archivo archivo = new Archivo("Calendario",60);
        Carpeta carpeta2=new Carpeta("Materias",68);
        Carpeta carpeta3=new Carpeta("Paradigma2",68);
        Archivo archivo2 = new Archivo("Tp",60);
          //verifico que se crearon
		assertEquals("UCP",carpeta.getNombre());
		assertEquals(68,carpeta.getTamanio());
        assertEquals("Materias",carpeta2.getNombre());
		assertEquals(68,carpeta2.getTamanio());
        assertEquals("Paradigma2",carpeta3.getNombre());
		assertEquals(68,carpeta3.getTamanio());
        assertEquals("Calendario",archivo.getNombre());
		assertEquals(60,archivo.getTamanio());
        assertEquals("Tp",archivo2.getNombre());
		assertEquals(60,archivo2.getTamanio());
        //agrego carpetas y archivos
        carpeta.setAgregarCarpeta(carpeta2);
        carpeta2.setAgregarCarpeta(carpeta3);
        carpeta2.setAgregarArchivos(archivo);
        carpeta3.setAgregarArchivos(archivo2);
        //sumador peso total de la carpeta
        int tamanioTotal=carpeta.getTamanio();
        assertEquals(324, tamanioTotal);//68+68+68+60+60

	}
    
}
