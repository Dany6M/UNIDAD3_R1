/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.AlumnoDAO;
import utng.datos.MateriaDAO;
import utng.modelo.Alumno;
import utng.modelo.Materia;

/**
 *
 * @author Daniel Aguilar
 */
@ManagedBean(name="alumnoBean")
@SessionScoped
public class AlumnoBean implements Serializable{
    
    private List<Alumno> alumnos;
    private Alumno alumno;
    private List<Materia> materias;
    
    public AlumnoBean(){
        alumno=new Alumno();
        alumno.setMateria(new Materia());
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
    
     public String listar() {
        AlumnoDAO dao = new AlumnoDAO();
        try {
            alumnos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Alumnos";
    }

    public String eliminar() {
        AlumnoDAO dao = new AlumnoDAO();
        try {
            dao.delete(alumno);
            alumnos = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";

    }

    public String iniciar() {
        alumno = new Alumno();
        alumno.setMateria(new Materia());
        
        try {
            materias = new MateriaDAO().getAll();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Iniciar";
    }

    public String guardar() {
        AlumnoDAO dao = new AlumnoDAO();
        try {
            if (alumno.getIdAlumno()!= 0) {
                dao.update(alumno);
            } else {
                dao.insert(alumno);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        alumnos = dao.getAll();

        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }
    
     public String editar(Alumno alumno){
            this.alumno = alumno;
        try{
            materias = new MateriaDAO().getAll();
            
        }catch (Exception e){e.printStackTrace();}
        return "Editar";
    }
    
}
