package com.example.demo;
import java.util.ArrayList;
import java.util.List;
public class Carpeta 
                    extends ArchivoBase {
    String nombre;
	int tamanio;
    private List<Carpeta>subCarpetas;
    private List<Archivo>archivos;
	public Carpeta(String nombre, int tamanio){//constructor con herencia y nuevas ArrayList
		super(nombre, tamanio);
        this.subCarpetas=new ArrayList<>();
        this.archivos=new ArrayList<>();
	}
    //doble encapsulamiento del arrayList subCarpeta
    public List<Carpeta>getSubCarpetas(){
        return subCarpetas;
    }
    public void setAgregarCarpeta(Carpeta carpeta){
        this.subCarpetas.add(carpeta);
    }
    //doble encapsulamiento de archivos
    public List<Archivo>getArchivos(){
        return archivos;
    }
    public void setAgregarArchivos(Archivo archivo){
        this.archivos.add(archivo);
    }

    public int getTamanio(){
        int total=super.getTamanio();
        for(Carpeta carpeta:subCarpetas){//contar el tamanio de laas carpetas
            total+=carpeta.getTamanio();//guardar el tamanio
        }
        for(Archivo archivo:archivos){
            total+=archivo.getTamanio();//lo mismo pero con archivo
        }
        return total;//sale de los for y tengo la suma total
    }
    
}
