
package mx.com.gm.servicio;

import java.util.*;
import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class ServicioPersonas {
   
   private PersonaDAO personaDAO;

   public ServicioPersonas() {
      this.personaDAO = new PersonaDAO();
   }
   
   
   
   public List<Persona> Listarpersonas(){
   return this.personaDAO.listar();
   }
   
}
