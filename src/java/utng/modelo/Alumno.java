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

@Entity @Table(name="alumno")
public class Alumno implements Serializable{
    @Id
    @GeneratedValue(
    strategy =GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private Long idAlumno;
    @Column(name="nombre_alumno",length = 30)
    private String nombreAlumno;
    @Column(length = 30)
    private String apellidoAlumno;
    @Column(length = 30)
    private String direccion;
    
    @ManyToOne
    @JoinColumn (name="id_materia")
    private Materia materia;

    public Alumno(Long idAlumno, String nombreAlumno, String apellidoAlumno, String direccion, Materia materia) {
        super();
        this.idAlumno = idAlumno;
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.direccion = direccion;
        this.materia = materia;
    }

    public Alumno() {
        this.idAlumno=0L;
    }

    
    
    public Long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    
    
}
