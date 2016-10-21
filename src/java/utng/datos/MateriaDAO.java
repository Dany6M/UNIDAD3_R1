/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Materia;

/**
 *
 * @author Daniel Aguilar
 */
public class MateriaDAO extends DAO<Materia>{
    
    public MateriaDAO() {
        super(new Materia());
    }
    
    public Materia getOneById(Materia materia)throws HibernateException{
        return super.getOneById(materia.getIdMateria());
    }
    
}
