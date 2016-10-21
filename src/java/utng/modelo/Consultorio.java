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
import javax.persistence.Table;

/**
 *
 * @author Daniel Aguilar
 */
@Entity @Table(name = "consultorio")
public class Consultorio implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_consultorio")
    private Long idConsultorio;
    @Column(name = "nombre_consultorio",length = 30)
    private String nombreConsultorio;
    @Column(length = 40)
    private String direccion;
    @Column(length = 15)
    private String telefono;
    
    public Consultorio(){
        this.idConsultorio= 0L;
    }

    public Long getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(Long idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public String getNombreConsultorio() {
        return nombreConsultorio;
    }

    public void setNombreConsultorio(String nombreConsultorio) {
        this.nombreConsultorio = nombreConsultorio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}//Fin clase
