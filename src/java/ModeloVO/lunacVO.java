/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author solan
 */
public class lunacVO {
    
    private String id_luganaci, nom_luganaci;

    public lunacVO(String id_luganaci, String nom_luganaci) {
        this.id_luganaci = id_luganaci;
        this.nom_luganaci = nom_luganaci;
    }


    public String getId_luganaci() {
        return id_luganaci;
    }

    public void setId_luganaci(String id_luganaci) {
        this.id_luganaci = id_luganaci;
    }

    public String getNom_luganaci() {
        return nom_luganaci;
    }

    public void setNom_luganaci(String nom_luganaci) {
        this.nom_luganaci = nom_luganaci;
    }

    
    
    
}
