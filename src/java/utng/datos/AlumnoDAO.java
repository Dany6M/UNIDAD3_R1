/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Alumno;

/**
 *
 * @author Daniel Aguilar
 */
public class AlumnoDAO extends DAO<Alumno>{
    
    public AlumnoDAO() {
        super(new Alumno());
    }
    
    public Alumno getOneById(Alumno alumno)throws HibernateException{
        return super.getOneById(alumno.getIdAlumno());
    }
}
