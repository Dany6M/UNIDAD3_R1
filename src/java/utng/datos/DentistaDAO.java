/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Dentista;

/**
 *
 * @author Daniel Aguilar
 */
public class DentistaDAO extends DAO<Dentista>{
    
    public DentistaDAO(){
        super(new Dentista());
    }
    
    public Dentista getOneById(Dentista dentista)throws HibernateException{
        return super.getOneById(dentista.getIdDentista());
    }
}//Fin clase
