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
import utng.datos.ConsultorioDAO;
import utng.modelo.Consultorio;

/**
 *
 * @author Daniel Aguilar
 */
@ManagedBean
@SessionScoped
public class ConsultorioBean implements Serializable {

    private List<Consultorio> consultorios;
    private Consultorio consultorio;

    public ConsultorioBean() {
    }

    public List<Consultorio> getConsultorios() {
        return consultorios;
    }

    public void setConsultorios(List<Consultorio> consultorios) {
        this.consultorios = consultorios;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public String listar() {
        ConsultorioDAO dao = new ConsultorioDAO();
        try {
            consultorios = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Consultorios";
    }

    public String eliminar() {
        ConsultorioDAO dao = new ConsultorioDAO();
        try {
            dao.delete(consultorio);
            consultorios = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";

    }

    public String iniciar() {
        consultorio = new Consultorio();
        return "Iniciar";

    }
   public String guardar(){
        ConsultorioDAO dao = new ConsultorioDAO();
        try{
            if(consultorio.getIdConsultorio()!=0){
                dao.update(consultorio);
            }else{
                dao.insert(consultorio);
            }
            consultorios = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
        return "Cancelar";
    }
    public String editar(Consultorio consultorio){
        this.consultorio = consultorio;
        return "Editar";
            }
}// Fin clase 
