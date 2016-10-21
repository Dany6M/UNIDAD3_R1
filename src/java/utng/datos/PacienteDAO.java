/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Paciente;

/**
 *
 * @author Daniel Aguilar
 */
public class PacienteDAO extends DAO<Paciente>{
    
    public PacienteDAO() {
        super(new Paciente());
    }
    
     public Paciente getOneById(Paciente paciente)throws HibernateException{
        return super.getOneById(paciente.getIdPaciente());
    }
    
}//Fin clase
