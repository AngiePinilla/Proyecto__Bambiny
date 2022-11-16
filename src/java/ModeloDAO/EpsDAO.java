/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.EpsVO;
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
 * @author solan
 */
public class EpsDAO extends ConexionBd {
    
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    private String sql;
    
    public ArrayList<EpsVO> listar() {
        ArrayList<EpsVO> listaEps = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from eps";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {

           EpsVO epsVO = new EpsVO(mensajero.getString(1), mensajero.getString(2));
           listaEps.add(epsVO);
            }

        } catch (SQLException e) {
            Logger.getLogger(EpsDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.deneterConexion();
            } catch (SQLException e) {
                Logger.getLogger(EpsDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaEps;
    }
    
}
