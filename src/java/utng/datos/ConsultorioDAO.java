/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Consultorio;

/**
 *
 * @author Daniel Aguilar
 */
public class ConsultorioDAO extends DAO<Consultorio> {

    public ConsultorioDAO() {
        super(new Consultorio());
    }

    public Consultorio getOneById(Consultorio consultorio)
            throws HibernateException {
        return super.getOneById(consultorio.getIdConsultorio());
    }

}// Fin clase 
