package com.example.demo;

public class ArchivoBase {
    public String nombre;
    public int tamanio;
    public ArchivoBase(String nombre, int tamanio){
        this.nombre=nombre;
        this.tamanio=tamanio;
    }
    public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public int getTamanio(){
		return tamanio;
	}
	public void setTamanio(int tamanio){
		this.tamanio=tamanio;

	}
    
}
