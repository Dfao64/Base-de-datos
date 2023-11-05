/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class Persona {
    int id;
    String usu;
    String contra;

    public Persona() {
    }

    public Persona(int id,String usu, String contra) {
        this.id=id;
        this.usu = usu;
        this.contra = contra;
    }

    public int getId() {
        return id; 
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getUsu() {
        return usu;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
}
