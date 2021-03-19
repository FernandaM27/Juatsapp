/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Enums.Sexo;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import objetosNegocio.Usuario;
import Control.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dany
 */
public class Juatsapp_205857_205056 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Pruebas usuario*/
        GregorianCalendar fechaNacimiento= new GregorianCalendar(2000, 6, 21);
        Usuario usuario = new Usuario("Dan", fechaNacimiento , Sexo.ROBOT, "Dan123", "123dan");
          ControlUsuarios controlUsuarios= new ControlUsuarios();
        //Usuario usuario=controlUsuarios.buscarporID(1);
          //System.out.println(usuario);
          //usuario.setCorreoElectronico("dan@gmail.com");
          //controlUsuarios.actualizar(usuario);
        Usuario usuario2= new Usuario("JoseJoel@potros.com",new GregorianCalendar(1970, 2, 25), Sexo.MASCULINO, "Locochon", "alterado");
        controlUsuarios.guardar(usuario);
//        List<Usuario> usuariolike=controlUsuarios.buscarTodas();
//        List<Usuario> usuariolike=controlUsuarios.buscarComo("loco");
//        for (Object usua : usuariolike) {
//            System.out.println(usua);
//        }
    }
    
}
