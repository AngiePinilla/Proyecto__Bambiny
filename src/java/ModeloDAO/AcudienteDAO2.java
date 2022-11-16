/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;
import ModeloVO.AcudienteVO2;
import util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConexionBd;
/**
 *
 * @author chris
 */
public class AcudienteDAO2 extends ConexionBd implements Crud{
     private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    //variables para las opereaciones
    private boolean operacion = false;
    private String sql;
    private String ID_ACUD="", ID_ALUM="", NOM_ACUD1="", NOM_ACUD2="", APEL_ACUD1="", APEL_ACUD2="",
            NUMDOCU_ACUD="", TELE_ACUD="", DIREC_ACUD="", ESTADOAUTO_ACUD="",
            FECHNACI_ACUD="", PARENT_ACUD="", ESTA_ACUD="";

    public AcudienteDAO2() {
    }
    public AcudienteDAO2(AcudienteVO2 AcuVO2){
    super ();
    try{
        conexion = this.obtenerConexion();
        ID_ACUD = AcuVO2.getID_ACUD();
        ID_ALUM = AcuVO2.getID_ALUM();
        NOM_ACUD1 = AcuVO2.getNOM_ACUD1();
        NOM_ACUD2 = AcuVO2.getNOM_ACUD2();
        APEL_ACUD1 = AcuVO2.getAPEL_ACUD1();
        APEL_ACUD2 = AcuVO2.getAPEL_ACUD2();
        NUMDOCU_ACUD = AcuVO2.getNUMDOCU_ACID();
        TELE_ACUD = AcuVO2.getTELE_ACUD();
        DIREC_ACUD = AcuVO2.getDIREC_ACUD();
        ESTADOAUTO_ACUD = AcuVO2.getESTADOAUTO_ACUD();
        FECHNACI_ACUD = AcuVO2.getFECHNACI_ACUD();
        PARENT_ACUD = AcuVO2.getPARENT_ACUD();
        ESTA_ACUD = AcuVO2.getESTA_ACUD();
        
    } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
        public AcudienteVO2 consultarAcudientes(String alum_id) {  
            ArrayList<AcudienteVO2> consultarAcudientes = new ArrayList<>();
           AcudienteVO2 AcuVO2 = null;
           try {
               conexion = this.obtenerConexion();
               sql = "SELECT acu.ID_ACUD, concat(alu.1NOM_ALUM, ' ',alu.1APEL_ALUM)"
                       + "AS niño, acu.1NOM_ACUD, acu.2NOM_ACUD, acu.1APEL_ACUD, "
                       + "acu.2APEL_ACUD, acu.NUMDOCU_ACUD, acu.TELE_ACUD, acu.DIREC_ACUD, "
                       + "acu.ESTADOAUTO_ACUD, acu.FECHNACI_ACUD, acu.ESTA_ACUD FROM acudientes "
                       + "AS acu INNER JOIN alumno AS alu ON acu.ID_ALUM = alu.ID_ALUM WHERE alu.ID_ALUM=?;";
               puente = conexion.prepareStatement(sql);
               puente.setString(1, alum_id);
               mensajero = puente.executeQuery();
               while (mensajero.next()) {

                   AcuVO2 = new AcudienteVO2(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), 
                           mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), 
                           mensajero.getString(8), mensajero.getString(9), mensajero.getString(10), 
                           mensajero.getString(11),mensajero.getString(12),mensajero.getString(13));
                   consultarAcudientes.add(AcuVO2);
                   
               }

           } catch (SQLException e) {
               Logger.getLogger(AcudienteDAO2.class.getName()).log(Level.SEVERE, null, e);
           } finally {
               try {
                   this.deneterConexion();
               } catch (SQLException e) {
                   Logger.getLogger(AcudienteDAO2.class.getName()).log(Level.SEVERE, null, e);
               }
           }
           return AcuVO2;
       }
    

    @Override
    public boolean agregarRegistro() {
        try {

   sql = "INSERT INTO `acudientes`( `1NOM_ACUD`, `2NOM_ACUD`, `1APEL_ACUD`, `2APEL_ACUD`, `NUMDOCU_ACUD`, `TELE_ACUD`,"
           + " `DIREC_ACUD`, `PARENT_ACUD`, `FECHNACI_ACUD`,`ID_ALUM`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);

                puente.setString(1, NOM_ACUD1);
                puente.setString(2, NOM_ACUD2);
                puente.setString(3, APEL_ACUD1);
                puente.setString(4, APEL_ACUD2);
                puente.setString(5, NUMDOCU_ACUD);
                puente.setString(6, TELE_ACUD);
                puente.setString(7, DIREC_ACUD);
                puente.setString(8, PARENT_ACUD);
                puente.setString(9, FECHNACI_ACUD);
                puente.setString(10, ID_ALUM);
  
               puente.executeUpdate();
                operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(AcudienteDAO2
                    .class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.deneterConexion();
            } catch (SQLException e) {
                Logger.getLogger(AcudienteDAO2.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }
    
    public ArrayList<AcudienteVO2> listarAcu(String ID_ALUM) {
        ArrayList<AcudienteVO2> listacud = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "SELECT * FROM `acudientes` WHERE ID_ALUM = ?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, ID_ALUM);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {

              AcudienteVO2  AcuVO = new AcudienteVO2(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), 
                           mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), 
                           mensajero.getString(8), mensajero.getString(9), mensajero.getString(10), 
                           mensajero.getString(11),mensajero.getString(12),mensajero.getString(13));
              listacud.add(AcuVO);
              
            }

        } catch (SQLException e) {
            Logger.getLogger(AcudienteDAO2.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.deneterConexion();
            } catch (SQLException e) {
                Logger.getLogger(AcudienteDAO2.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listacud;
    }
    
    public AcudienteVO2 consultarDatos(String ID_ACUD) {

        AcudienteVO2 acuVO = null;

        try {

            conexion = this.obtenerConexion();
            sql = "SELECT * FROM acudientes WHERE ID_ACUD=?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, ID_ACUD);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                acuVO = new AcudienteVO2(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7),
                mensajero.getString(8), mensajero.getString(9), mensajero.getString(10), mensajero.getString(11), mensajero.getString(12), mensajero.getString(13));
            }

        } catch (SQLException e) {
            Logger.getLogger(AcudienteDAO2.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.deneterConexion();
            } catch (SQLException e) {
                Logger.getLogger(AcudienteDAO2.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return acuVO;
    }
    

    @Override
    public boolean actualizarRegistro() {
       //To change body of generated methods, choose Tools | Templates.
       try {

   sql = "UPDATE `acudientes` SET `1NOM_ACUD`=? ,`2NOM_ACUD`=?,`1APEL_ACUD`=?,`2APEL_ACUD`=?,"
           + "`NUMDOCU_ACUD`=?,`TELE_ACUD`=?,`DIREC_ACUD`=?,`ESTADOAUTO_ACUD`=?,`FECHNACI_ACUD`=?,"
           + "`PARENT_ACUD`=? WHERE ID_ACUD=?";
   
            puente = conexion.prepareStatement(sql);
                
                
                puente.setString(1, NOM_ACUD1);
                puente.setString(2, NOM_ACUD2);
                puente.setString(3, APEL_ACUD1);
                puente.setString(4, APEL_ACUD2);
                puente.setString(5, NUMDOCU_ACUD);
                puente.setString(6, TELE_ACUD);
                puente.setString(7, DIREC_ACUD);
                puente.setString(8, ESTADOAUTO_ACUD);
                puente.setString(9, FECHNACI_ACUD);
                puente.setString(10, PARENT_ACUD);
                puente.setString(11, ID_ACUD);
               
               
               puente.executeUpdate();
                operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(AcudienteDAO2.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                 this.deneterConexion();
            } catch (SQLException e) {
                Logger.getLogger(AcudienteDAO2.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
