/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;
import ModeloVO.ProfesorVO;
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
 * @author 57314
 */
public class ProfesorDAO extends ConexionBd implements Crud {

    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    //variables para las opereaciones
    private boolean operacion = false;
    private String sql;
    //declarar las variables para la infromacion
    private String ID_ALUM = "", ID_USUA = "", NOM_ALUM1 = "", NOM_ALUM2 = "", APEL_ALUM1 = "", APEL_ALUM2 = "",
            NUIP_ALUM = "", FECHANACI_ALUM = "", LUGARNACI_ALUM = "", GRUPOSANGUI_ALUM = "", NUMHERMA_ALUM = "",
            DIREC_ALUM = "", TELECELULAR_ALUM = "", TELEFIJO_ALUM = "", EPS_ALUM = "", ALERGIAS_ALUM = "", MEDICA_ALUM = "", PESO_ALUM = "",
            ALTURA_ALUM = "", ENFERM_ALUM = "", DESCENFER_ALUM = "";

    public ProfesorDAO() {
    }

    public ProfesorDAO(ProfesorVO proVO) {
        super();
        try {
            conexion = this.obtenerConexion();
            ID_ALUM = proVO.getID_ALUM();
            ID_USUA = proVO.getID_USUA();
            NOM_ALUM1 = proVO.getNOM_ALUM1();
            NOM_ALUM2 = proVO.getNOM_ALUM2();
            APEL_ALUM1 = proVO.getAPEL_ALUM1();
            APEL_ALUM2 = proVO.getAPEL_ALUM2();
            NUIP_ALUM = proVO.getNUIP_ALUM();
            FECHANACI_ALUM = proVO.getLUGARNACI_ALUM();
            LUGARNACI_ALUM = proVO.getLUGARNACI_ALUM();
            GRUPOSANGUI_ALUM = proVO.getGRUPOSANGUI_ALUM();
            NUMHERMA_ALUM = proVO.getNUMHERMA_ALUM();
            DIREC_ALUM = proVO.getDIREC_ALUM();
            TELECELULAR_ALUM = proVO.getTELECELURAR_ALUM();
            TELEFIJO_ALUM = proVO.getTELEFIJO_ALUM();
            EPS_ALUM = proVO.getEPS_ALUM();
            ALERGIAS_ALUM = proVO.getALERGIAS_ALUM();
            MEDICA_ALUM = proVO.getMEDICA_ALUM();
            PESO_ALUM = proVO.getPESO_ALUM();
            ALTURA_ALUM = proVO.getALTURA_ALUM();
            ENFERM_ALUM = proVO.getENFERM_ALUM();
            DESCENFER_ALUM = proVO.getDESCENFER_ALUM();

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }


    public ProfesorVO consultarEstudiante(String id_alum) {
        ProfesorVO proVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "SELECT alu.ID_ALUM, alu.ID_USUA, eps.NOM_EPS, naci.NOM_LUGANACI, "
                    + "alu.1NOM_ALUM, alu.2NOM_ALUM, alu.1APEL_ALUM, alu.2APEL_ALUM, "
                    + "alu.NUIP_ALUM, alu.FECHNACI_ALUM, alu.GRUPSANGUI_ALUM, "
                    + "alu.NUMHERMA_ALUM, alu.DIREC_ALUM, alu.TELEFIJO_ALUM, "
                    + "alu.TELECELU_ALUM, alu.ALERG_ALUM, alu.MEDICA_ALUM, "
                    + "alu.PESO_ALUM, alu.ALTURA_ALUM, alu.ENFERM_ALUM, "
                    + "alu.DESCENFER_ALUM, alu.ESTA_ALUMN FROM alumno AS "
                    + "alu INNER JOIN eps AS eps ON alu.ID_EPS = eps.ID_EPS "
                    + "JOIN luganaci AS naci ON alu.ID_LUGANACI = naci.ID_LUGANACI;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id_alum);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {

                proVO = new ProfesorVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5),
                        mensajero.getString(6), mensajero.getString(7), mensajero.getString(8),
                        mensajero.getString(9), mensajero.getString(10), mensajero.getString(11),
                        mensajero.getString(12), mensajero.getString(13), mensajero.getString(14),
                        mensajero.getString(15), mensajero.getString(16), mensajero.getString(17),
                        mensajero.getString(18), mensajero.getString(19), mensajero.getString(20),
                        mensajero.getString(21));
            }

        } catch (SQLException e) {
            Logger.getLogger(ProfesorDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.deneterConexion();
            } catch (SQLException e) {
                Logger.getLogger(ProfesorDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return proVO;
    }

    public ArrayList<ProfesorVO> listar() {
        ArrayList<ProfesorVO> listaAlumno = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "SELECT alu.ID_ALUM, alu.ID_USUA, eps.NOM_EPS, naci.NOM_LUGANACI, alu.1NOM_ALUM, alu.2NOM_ALUM, alu.1APEL_ALUM, alu.2APEL_ALUM, alu.NUIP_ALUM, alu.FECHNACI_ALUM, alu.GRUPSANGUI_ALUM, alu.NUMHERMA_ALUM, alu.DIREC_ALUM, alu.TELEFIJO_ALUM, alu.TELECELU_ALUM, alu.ALERG_ALUM, alu.MEDICA_ALUM, alu.PESO_ALUM, alu.ALTURA_ALUM, alu.ENFERM_ALUM, alu.DESCENFER_ALUM, alu.ESTA_ALUMN FROM alumno AS alu INNER JOIN eps AS eps ON alu.ID_EPS = eps.ID_EPS JOIN luganaci AS naci ON alu.ID_LUGANACI = naci.ID_LUGANACI;";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {

                ProfesorVO proVO = new ProfesorVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5),
                        mensajero.getString(6), mensajero.getString(7), mensajero.getString(8),
                        mensajero.getString(9), mensajero.getString(10), mensajero.getString(11),
                        mensajero.getString(12), mensajero.getString(13), mensajero.getString(14),
                        mensajero.getString(15), mensajero.getString(16), mensajero.getString(17),
                        mensajero.getString(18), mensajero.getString(19), mensajero.getString(20),
                        mensajero.getString(21));
                listaAlumno.add(proVO);

            }

        } catch (SQLException e) {
            Logger.getLogger(ProfesorDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.deneterConexion();
            } catch (SQLException e) {
                Logger.getLogger(ProfesorDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaAlumno;
    }

    @Override
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
