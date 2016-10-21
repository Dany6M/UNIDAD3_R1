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
import utng.datos.MateriaDAO;
import utng.modelo.Materia;

/**
 *
 * @author Daniel Aguilar
 */
@ManagedBean
@SessionScoped
public class MateriaBean implements Serializable{
    private List<Materia> materias;
    private Materia materia;

    public MateriaBean() {
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    public String listar() {
        MateriaDAO dao = new MateriaDAO();
        try {
            materias = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Materias";
    }

    public String eliminar() {
        MateriaDAO dao = new MateriaDAO();
        try {
            dao.delete(materia);
            materias = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String iniciar() {

        materia = new Materia();

        return "Iniciar";
    }

    public String guardar() {
        MateriaDAO dao = new MateriaDAO();
        try {
            if (materia.getIdMateria()!= 0) {
                dao.update(materia);
            } else {
                dao.insert(materia);
            }
            materias = dao.getAll();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Materia materia) {
        this.materia = materia;
        return "Editar";
    }
}
