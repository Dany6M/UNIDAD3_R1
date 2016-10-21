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

import utng.datos.DentistaDAO;
import utng.datos.PacienteDAO;
import utng.modelo.Consultorio;
import utng.modelo.Dentista;
import utng.modelo.Paciente;

/**
 *
 * @author Daniel Aguilar
 */
@ManagedBean(name = "dentistaBean")
@SessionScoped
public class DentistaBean implements Serializable {

    private List<Dentista> dentistas;
    private Dentista dentista;
    private List<Paciente> pacientes;
    private List<Consultorio> consultorios;

    public DentistaBean() {
        dentista = new Dentista();
        dentista.setPaciente(new Paciente());
        dentista.setConsultorio(new Consultorio());
    }

    public List<Dentista> getDentistas() {
        return dentistas;
    }

    public void setDentistas(List<Dentista> dentistas) {
        this.dentistas = dentistas;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Consultorio> getConsultorios() {
        return consultorios;
    }

    public void setConsultorios(List<Consultorio> consultorios) {
        this.consultorios = consultorios;
    }

    public String listar() {
        DentistaDAO dao = new DentistaDAO();
        try {
            dentistas = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Dentistas";
    }

    public String eliminar() {
        DentistaDAO dao = new DentistaDAO();
        try {
            dao.delete(dentista);
            dentistas = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";

    }

    public String iniciar() {
        dentista = new Dentista();
        dentista.setPaciente(new Paciente());
        dentista.setConsultorio(new Consultorio());
        try {
            pacientes = new PacienteDAO().getAll();
            consultorios = new ConsultorioDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Iniciar";
    }

    public String guardar() {
        DentistaDAO dao = new DentistaDAO();
        try {
            if (dentista.getIdDentista() != 0) {
                dao.update(dentista);
            } else {
                dao.insert(dentista);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        dentistas = dao.getAll();

        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }
    
     public String editar(Dentista dentista){
            this.dentista = dentista;
        try{
            pacientes = new PacienteDAO().getAll();
            consultorios= new ConsultorioDAO().getAll();
        }catch (Exception e){e.printStackTrace();}
        return "Editar";
    }

}//Fin clase
