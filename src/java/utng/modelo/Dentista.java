/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Daniel Aguilar
 */
@Entity @Table (name="dentista")
public class Dentista implements Serializable{
     @Id
    @GeneratedValue(
    strategy =GenerationType.IDENTITY)
    @Column(name = "id_dentista")
    private Long idDentista;
    @Column(name="nombre_dentista",length = 30)
    private String nombreDentista;
    @Column(length = 30)
    private String apellido;
    @Column(length = 30)
    private String direccion;
    
    @ManyToOne
    @JoinColumn(name="id_paciente")
    private Paciente paciente;
     @ManyToOne
    @JoinColumn(name="id_consultorio")
    private Consultorio consultorio;

    public Dentista(Long idDentista, String nombreDentista, String apellido, String direccion, Paciente paciente, Consultorio consultorio) {
        this.idDentista = idDentista;
        this.nombreDentista = nombreDentista;
        this.apellido = apellido;
        this.direccion = direccion;
        this.paciente = paciente;
        this.consultorio = consultorio;
    }
    
    public Dentista(){
        this.idDentista= 0L;
    }

    public Long getIdDentista() {
        return idDentista;
    }

    public void setIdDentista(Long idDentista) {
        this.idDentista = idDentista;
    }

    public String getNombreDentista() {
        return nombreDentista;
    }

    public void setNombreDentista(String nombreDentista) {
        this.nombreDentista = nombreDentista;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    
}//Fin clase
