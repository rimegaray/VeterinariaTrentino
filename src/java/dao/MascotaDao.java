/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Mascota;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

/**
 *
 * @author Juan Carlos
 * Es el componente DAO
 */
public class MascotaDao {
    
    public List<Mascota> listarMascotas(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Mascota";
        Query query = session.createQuery(hql);
        List<Mascota> miLista = query.list();
        return miLista;
    }
    
    public String insertarMascota(Mascota mascota){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(mascota);
        transaction.commit();
        session.close();
        return "Se insertó una nueva mascota";
    }
}
