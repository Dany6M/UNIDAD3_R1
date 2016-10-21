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
import javax.persistence.Table;

/**
 *
 * @author Daniel Aguilar
 */
@Entity @Table(name="materia")
public class Materia implements Serializable{
    @Id
    @GeneratedValue(
            strategy =GenerationType.IDENTITY)
    
    @Column(name = "id_materia")
    private Long idMateria;
    @Column(length = 30)
    private String nombreMateria;
    @Column(length = 30)
    private String importancia;
     @Column(length = 30)
    private String duracion;
    
    
    public Materia(){
        this.idMateria=0L;
    }

    public Long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    
    
    
}
