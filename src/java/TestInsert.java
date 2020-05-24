
import modelo.Mascota;
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
public class TestInsert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota mimascota = new Mascota();
        mimascota.setIdMascota(6);
        mimascota.setNombre("sam");
        mimascota.setEdad(5);
        mimascota.setNombreDueño("Carlos");
        mimascota.setRaza("pitbull");
        String mensaje = insertarMascota(mimascota);
        System.out.println(mensaje);
    }
    
      public static String insertarMascota(Mascota mascota){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(mascota);
        transaction.commit();
        session.close();
        return "Se insertó una nueva mascota";
    }
    
}
