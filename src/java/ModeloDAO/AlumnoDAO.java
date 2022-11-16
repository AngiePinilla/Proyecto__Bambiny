/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.AlumnoVO;
import ModeloVO.MatriculaVO;
import util.ConexionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Crud;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author solan
 */
public class AlumnoDAO extends ConexionBd implements Crud{
    
     //1. Declarar 
    
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    
    
    private String id_alum ="", id_usua ="", id_eps ="", id_luganaci ="", nom1_alum ="", 
            nom2_alum ="", apel1_alum ="", apel2_alum ="", nuip_alumn  ="",fechnaci_alum ="",
            grupsangui_alum ="", numherma_alum ="", direc_alum ="", telefijo_alum ="",
            telecelu_alum ="", alerg_alum ="", medica_alum ="", peso_alum ="", altura_alum ="", 
            enferm_alum ="", descenferm_alum ="", esta_alum ="";

    
    
    //2. Método principal para recibir datos de VO
    
     public AlumnoDAO(AlumnoVO aluVO) {
        super();
        //conectar a la base de datos
        
        try {
            conexion = this.obtenerConexion();
            //datos del Vo   
             id_alum = aluVO.getId_alum();
             id_usua = aluVO.getId_usua();
             id_eps= aluVO.getId_eps();
             id_luganaci= aluVO.getId_luganaci();
             nom1_alum= aluVO.getNom1_alum();
             nom2_alum= aluVO.getNom2_alum();
             apel1_alum= aluVO.getApel1_alum();
             apel2_alum= aluVO.getApel2_alum();
             nuip_alumn= aluVO.getNuip_alumn();
             fechnaci_alum= aluVO.getFechnaci_alum();
             grupsangui_alum= aluVO.getGrupsangui_alum();
             numherma_alum= aluVO.getNumherma_alum();
             direc_alum= aluVO.getDirec_alum();
             telefijo_alum= aluVO.getTelefijo_alum();
             telecelu_alum= aluVO.getTelecelu_alum();
             alerg_alum= aluVO.getAlerg_alum();
             medica_alum= aluVO.getMedica_alum();
             peso_alum= aluVO.getPeso_alum();
             altura_alum= aluVO.getAltura_alum();
             enferm_alum= aluVO.getEnferm_alum();
             descenferm_alum= aluVO.getDescenferm_alum();
             esta_alum= aluVO.getEsta_alum();

            
            
        } catch (Exception e) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() {
      try {

   sql = "INSERT into alumno (ID_USUA,ID_EPS,ID_LUGANACI, 1NOM_ALUM,2NOM_ALUM,1APEL_ALUM,2APEL_ALUM,NUIP_ALUM, "
           + "FECHNACI_ALUM,GRUPSANGUI_ALUM, NUMHERMA_ALUM, DIREC_ALUM, TELEFIJO_ALUM, TELECELU_ALUM, ALERG_ALUM, "
           + "MEDICA_ALUM, PESO_ALUM, ALTURA_ALUM, ENFERM_ALUM, DESCENFER_ALUM) "
           + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,? );";//nombre a cada
            puente = conexion.prepareStatement(sql);
                
                puente.setString(1, id_usua);
                puente.setString(2, id_eps);
                puente.setString(3, id_luganaci);
                puente.setString(4, nom1_alum);
                puente.setString(5, nom2_alum);
                puente.setString(6, apel1_alum);
                puente.setString(7, apel2_alum);
                puente.setString(8, nuip_alumn);
                puente.setString(9, fechnaci_alum);
                puente.setString(10, grupsangui_alum);
                puente.setString(11, numherma_alum);
                puente.setString(12, direc_alum);
                puente.setString(13, telefijo_alum);
                puente.setString(14, telecelu_alum);
                puente.setString(15, alerg_alum);
                puente.setString(16, medica_alum);
                puente.setString(17, peso_alum);
                puente.setString(18, altura_alum);
                puente.setString(19, enferm_alum);
                puente.setString(20, descenferm_alum);
                
                
                
               puente.executeUpdate();
                operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.deneterConexion();
            } catch (SQLException e) {
                Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    
    
    }

    @Override
    public boolean actualizarRegistro() {
       
        try {

   sql = "UPDATE alumno SET ID_EPS= ?, ID_LUGANACI=?, "
           + "1NOM_ALUM=?, 2NOM_ALUM=?, 1APEL_ALUM=?, 2APEL_ALUM=?, NUIP_ALUM=?, FECHNACI_ALUM=?,"
           + " GRUPSANGUI_ALUM=?, NUMHERMA_ALUM=?, DIREC_ALUM=?, TELEFIJO_ALUM=?, TELECELU_ALUM=?, "
           + "ALERG_ALUM=?, MEDICA_ALUM=?, "
           + "PESO_ALUM=?, ALTURA_ALUM=?, ENFERM_ALUM=?, DESCENFER_ALUM=?, ESTA_ALUMN=? WHERE ID_ALUM=?";
   
            puente = conexion.prepareStatement(sql);
                
                
                puente.setString(1, id_eps);
                puente.setString(2, id_luganaci);
                puente.setString(3, nom1_alum);
                puente.setString(4, nom2_alum);
                puente.setString(5, apel1_alum);
                puente.setString(6, apel2_alum);
                puente.setString(7, nuip_alumn);
                puente.setString(8, fechnaci_alum);
                puente.setString(9, grupsangui_alum);
                puente.setString(10, numherma_alum);
                puente.setString(11, direc_alum);
                puente.setString(12, telefijo_alum);
                puente.setString(13, telecelu_alum);
                puente.setString(14, alerg_alum);
                puente.setString(15, medica_alum);
                puente.setString(16, peso_alum);
                puente.setString(17, altura_alum);
                puente.setString(18, enferm_alum);
                puente.setString(19, descenferm_alum);
                puente.setString(20, esta_alum);
                puente.setString(21, id_alum);
               
               puente.executeUpdate();
                operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                 this.deneterConexion();
            } catch (SQLException e) {
                Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    
    }
    
    public AlumnoVO consultarDatos(String id_alum) {

        AlumnoVO aluVO = null;

        try {

            conexion = this.obtenerConexion();
            sql = "SELECT * FROM alumno WHERE id_alum=?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id_alum);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                aluVO = new AlumnoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7),
                mensajero.getString(8), mensajero.getString(9), mensajero.getString(10), mensajero.getString(11), mensajero.getString(12), mensajero.getString(13), mensajero.getString(14),
                mensajero.getString(15), mensajero.getString(16), mensajero.getString(17), mensajero.getString(18), mensajero.getString(19), mensajero.getString(20), mensajero.getString(21), mensajero.getString(22));
            }

        } catch (SQLException e) {
            Logger.getLogger(docuDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.deneterConexion();
            } catch (SQLException e) {
                Logger.getLogger(docuDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return aluVO;
    }
    
    public  AlumnoVO consultarAlumno(String id_usua) {
        AlumnoVO aluVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from alumno where id_usua=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id_usua);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {

                aluVO = new AlumnoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7),
                mensajero.getString(8), mensajero.getString(9), mensajero.getString(10), mensajero.getString(11), mensajero.getString(12), mensajero.getString(13), mensajero.getString(14),
                mensajero.getString(15), mensajero.getString(16), mensajero.getString(17), mensajero.getString(18), mensajero.getString(19), mensajero.getString(20), mensajero.getString(21), mensajero.getString(22));
            }

        } catch (SQLException e) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.deneterConexion();
            } catch (SQLException e) {
                Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return aluVO;
    }
    
    
    
    
    public ArrayList<AlumnoVO> listar(String id_usua) {

        ArrayList<AlumnoVO> listaAlu = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "SELECT * FROM `alumno` WHERE ID_USUA=?";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {

                AlumnoVO aluVO = new AlumnoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7),
                mensajero.getString(8), mensajero.getString(9), mensajero.getString(10), mensajero.getString(11), mensajero.getString(12), mensajero.getString(13), mensajero.getString(14),
                mensajero.getString(15), mensajero.getString(16), mensajero.getString(17), mensajero.getString(18), mensajero.getString(19), mensajero.getString(20), mensajero.getString(21), mensajero.getString(22));
                listaAlu.add(aluVO);
            }
        } catch (SQLException e) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.deneterConexion();
            } catch (SQLException e) {
                Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, e);

            }
        }

        return listaAlu;
    }
    

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    //actualizar estado
    
    }

    
    
}
