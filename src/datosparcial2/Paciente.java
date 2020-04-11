/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosparcial2;

/**
 *
 * @author luisf
 */
public class Paciente {
    private String nombre;
    private String clinica;
    private String infoMedica;
    private String sexo;
    private int codigo;

    public Paciente(String nombre, String clinica, String infoMedica, String sexo, int codigo) {
        this.nombre = nombre;
        this.clinica = clinica;
        this.infoMedica = infoMedica;
        this.sexo = sexo;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClinica() {
        return clinica;
    }

    public void setClinica(String clinica) {
        this.clinica = clinica;
    }

    public String getInfoMedica() {
        return infoMedica;
    }

    public void setInfoMedica(String infoMedica) {
        this.infoMedica = infoMedica;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
