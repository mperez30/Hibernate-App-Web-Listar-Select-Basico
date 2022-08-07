package mx.com.gm.dao;

import javax.persistence.*;

import mx.com.gm.domain.*;

import java.util.*;

public class PersonaDAO {

   private EntityManagerFactory emf;

   private EntityManager em;

   public PersonaDAO() {
      emf = Persistence.createEntityManagerFactory("HibernatePU");
      em = emf.createEntityManager();

   }

   public List<Persona> listar() {

      //hql hibernate query languaje,  jpql = jpa query languaje
      //estamos recuperando objectos por completo, no campos
      String hql = "SELECT p FROM Persona p";

      Query query = em.createQuery(hql);

      //se obtiene lista de el query retorna un objeto tipo personas
      List<Persona> personas = query.getResultList();

      return personas;
   }

   public void Insertar(Persona persona) {
      try {
         em.getTransaction().begin();
         // persiste - insert
         em.persist(persona);
         em.getTransaction().commit();
      } catch (Exception ex) {
         ex.printStackTrace(System.out);
         em.getTransaction().rollback();
      }
      finally{
         if (em != null) {
            em.close();
         }
      }
   }
   
   public void Modificar(Persona persona) {
      try {
         em.getTransaction().begin();
         // merge - update
         em.merge(persona);
         em.getTransaction().commit();
      } catch (Exception ex) {
         ex.printStackTrace(System.out);
         em.getTransaction().rollback();
      }

   }
   
   public Persona buscarPersonaPorId(Persona p){
   
     
   return  em.find(Persona.class, p.getIdPersona());
   }
   
   
   public void Eliminar(Persona persona) {
      try {
         em.getTransaction().begin();
         // merge - sincronizar  -- delete
         em.remove(em.merge(persona));
         em.getTransaction().commit();
      } catch (Exception ex) {
         ex.printStackTrace(System.out);
         em.getTransaction().rollback();
      }

   }

}
