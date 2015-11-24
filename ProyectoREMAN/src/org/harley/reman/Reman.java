package org.harley.reman;

import org.harley.reman.clases.*;

/**
 *
 * @author Gonzalo
 */
public class Reman {

    public static Educcion eduEjemplo() {
        Educcion edu = new Educcion("Nombre del requisito");
        edu.setVersion("0.01");
        edu.setFuenteNombre("Christiano López");
        edu.setFuenteCargo("Usuario");
        edu.setFuenteTipo("Interno");
        edu.setEspecialNombre("Gonzalo Luna");
        edu.setEspecialEspecial("Ing Requisitos");
        edu.setEspecialTipo("Programador");
        edu.setEspecialExp("Alta");
        edu.setEduccionTipo("Primario");
        edu.setEduccionObj("Objeto del Requisito");
        edu.setEduccionFecha("01/01/2016");
        edu.setDescripcion("Descripcion de requerimiento a educcionar");
        edu.setObservaciones("Observaciones del requisito");
        return edu;
    }
    
    public static Especificacion nuevoEsp(){
        Especificacion esp = new Especificacion();
        Nombre nom = new Nombre();
        Elemento excep = new Elemento(); 
        nom.setCodigo("001");
        nom.setNombre("especificacion ads");

        excep.setEleNumero(1);
        excep.setEleDescripcion("el sistema");
        esp.addExcepcion(excep);

        esp.setEspecificacionNombre(nom);
        esp.setEliNombre("ELI001");
        esp.setAutor("Gonzalo");
        esp.setFuente("Jose");
        esp.setDependencias("dependencia");
        esp.setDescripcion("Descripcion");
        esp.addPrecondicion("precondicion1");
        esp.addPostcondicion("postcondicion1");
        esp.setComentarios("comentarios dasdsada");
        
        return esp;
    }    

    private Proyecto abrirProyecto(String nom) {
        Proyecto pro = new Proyecto(nom);
        pro.loadProject();
        return pro;
    }
    
    public static void main(String[] args) {
        Reman rem = new Reman();
        
        String nombreProyecto = "NombreProyecto";
        String empDes = "HARLEY";
        String empCli = "UNSA";
        String lidPro = "Incalla Nina Christian";
        String estPro = "Terminado";
        String fecIni = "01/01/0001";
        String fecFin = "30/12/2015";
        //Proyecto project = rem.crearProyecto(nombreProyecto, empDes, empCli, lidPro, estPro, fecIni, fecFin);
        
        Proyecto project = rem.abrirProyecto(nombreProyecto);
        /*project.addEdu(eduEjemplo());
        project.addEdu(eduEjemplo());*/
        
        /*Educcion z = project.getActEdu("edu0001");
        z.setFuenteTipo("externo");
        project.modEdu(z);*/
        
       /* Educcion z = project.getActEdu("edu0001");
        String razon = "se cambio la fuente";
        String ver = "0.02";
        project.verEdu(z, ver, fecFin);*/
        
        project.exportarLibroEdu("D:\\Informe", "LibroEduccion");
    }

    private Proyecto crearProyecto(String nombreProyecto, String empDes, String empCli, String lidPro, String estPro, String fecIni, String fecFin) {
        Proyecto pro = new Proyecto(nombreProyecto);
        pro.createProject(empDes, empCli, lidPro, estPro, fecIni, fecFin);
        return pro;    
    }
}