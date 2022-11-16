/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.lunacVO;
import util.ConexionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author solan
 */
public class lunacDAO extends ConexionBd{
      
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    private String sql;
    
    public ArrayList<lunacVO> listarn() {
        ArrayList<lunacVO> listalugar = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from  luganaci";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {

           lunacVO naciVo = new lunacVO(mensajero.getString(1), mensajero.getString(2));
           listalugar.add(naciVo);
            }

        } catch (SQLException e) {
            Logger.getLogger(lunacDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.deneterConexion();
            } catch (SQLException e) {
                Logger.getLogger(lunacDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listalugar;
    }
    
}
