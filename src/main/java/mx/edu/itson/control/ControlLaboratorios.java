/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.itson.control;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.edu.itson.control.entidades.UnidadAcademica;
/**
 *
 * @author oscar
 */
public class ControlLaboratorios {

    public static void main(String[] args) {
        System.out.println("Iniciando conexion a la base de datos...");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ControlLaboratoriosPU");
        EntityManager em = emf.createEntityManager();
        
        try {
            em.getTransaction().begin();
            UnidadAcademica unidad = new UnidadAcademica("Campus Nainari");
            em.persist(unidad);
            em.getTransaction().commit();
            System.out.println("Se creo la base de datos y se guardo la unidad: " + unidad.getNombre());
            
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Hubo un error: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
        }
    }
}
