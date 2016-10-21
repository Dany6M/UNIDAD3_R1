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
import utng.datos.PacienteDAO;
import utng.modelo.Paciente;

/**
 *
 * @author Daniel Aguilar
 */
@ManagedBean
@SessionScoped
public class PacienteBean implements Serializable {

    private List<Paciente> pacientes;
    private Paciente paciente;

    public PacienteBean() {

    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String listar() {
        PacienteDAO dao = new PacienteDAO();
        try {
            pacientes = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Pacientes";
    }

    public String eliminar() {
        PacienteDAO dao = new PacienteDAO();
        try {
            dao.delete(paciente);
            pacientes = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String iniciar() {

        paciente = new Paciente();

        return "Iniciar";
    }

    public String guardar() {
        PacienteDAO dao = new PacienteDAO();
        try {
            if (paciente.getIdPaciente() != 0) {
                dao.update(paciente);
            } else {
                dao.insert(paciente);
            }
            pacientes = dao.getAll();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Paciente paciente) {
        this.paciente = paciente;
        return "Editar";
    }

}// Fin clase
