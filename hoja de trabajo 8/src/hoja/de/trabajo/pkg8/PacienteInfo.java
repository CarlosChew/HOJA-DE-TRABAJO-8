/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo.pkg8;

/**
 *
 * @author Fernando Figueroa
 */
public class PacienteInfo implements Comparable<PacienteInfo> {
    
   public String nombre;
   public String sintoma;
   public String codigo;
    
    public PacienteInfo(String nombre, String sintoma, String codigo ){
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigo = codigo;   
    }

    @Override
    public int compareTo(PacienteInfo o) 
    {
       return codigo.compareTo(o.codigo);
    }
    
    

}
