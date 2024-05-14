package Steir.ejemplo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class App 
{
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ejemplo");
	
    public static void main( String[] args )
    {
    	// Create a new Registro instance
        registro newRegistro = new registro("Ruben Morales", "DNI", "2356897L", "moralesr@gmail.com", "911256398", "moru789");
        createRegistro(newRegistro);

        // Read the newly created Registro
        registro foundRegistro = readRegistro(newRegistro.getIdusuario());
        System.out.println("Found: " + (foundRegistro != null ? foundRegistro.getNombres_apellidos() : "No record found"));

        // Update the Registro's email
        if (foundRegistro != null) {
            foundRegistro.setEmail("newemail@gmail.com");
            updateRegistro(foundRegistro);
        }

        // Delete the Registro
        if (foundRegistro != null) {
            deleteRegistro(foundRegistro.getIdusuario());
        }

        // List all Registros
        List<registro> registros = listAllRegistros();
        for (registro registro : registros) {
            System.out.println(registro.getNombres_apellidos());
        }

        emf.close();
    }

    public static void createRegistro(registro registro) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(registro);
        em.getTransaction().commit();
        em.close();
    }

    public static registro readRegistro(Integer id) {
        EntityManager em = emf.createEntityManager();
        registro registro = em.find(registro.class, id);
        em.close();
        return registro;
    }

    public static void updateRegistro(registro registro) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(registro);
        em.getTransaction().commit();
        em.close();
    }

    public static void deleteRegistro(Integer id) {
        EntityManager em = emf.createEntityManager();
        registro registro = em.find(registro.class, id);
        if (registro != null) {
            em.getTransaction().begin();
            em.remove(registro);
            em.getTransaction().commit();
        }
        em.close();
    }

    public static List<registro> listAllRegistros() {
        EntityManager em = emf.createEntityManager();
        List<registro> registros = em.createQuery("SELECT r FROM Registro r", registro.class).getResultList();
        em.close();
        return registros;
    }
}