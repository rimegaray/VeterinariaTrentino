
import java.util.ArrayList;
import java.util.List;
import modelo.Mascota;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Carlos
 */
public class TestListar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Mascota> lista = new ArrayList<>();
        lista = listarMascotas();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("nombre: "+lista.get(i).getNombre());
        }
    }
    
    
    public static List<Mascota> listarMascotas(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Mascota";
        Query query = session.createQuery(hql);
        List<Mascota> miLista = query.list();
        return miLista;
    }
    
  
}
