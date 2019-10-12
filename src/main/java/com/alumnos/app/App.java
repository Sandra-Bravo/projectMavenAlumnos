package com.alumnos.app;


public class App
{
    public static void main( String[] args )
    {
        Alumno abi = new Alumno();
        abi.setNombre("Abigail");
        abi.setApellidoPaterno("Montes");
        abi.setApellidoMaterno("Oca");
        
        Mascota perro = new Mascota();
        perro.setNombre("Konnan");
        perro.setTipoMascota("Perro");
        perro.setColor("Negro");
        
        
        
        System.out.println("A "+abi.getNombre()+". Se le asigno la mascota: "+perro.getTipoMascota());
        
        
        
        
    }
}
