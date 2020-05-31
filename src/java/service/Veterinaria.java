/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.MascotaDao;
import java.util.List;
import modelo.Mascota;

/**
 *
 * @author Juan Carlos
 * En el patron DAO, esta clase es considerada Bussines Object
 */
public class Veterinaria {
    
    public void curarMascota(){
        MascotaDao mascotadao = new MascotaDao();
        List<Mascota> lista = mascotadao.listarMascotas();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Mascota "+lista.get(i).getNombre()+ " curada");
        }
    }
    
    
    
}
