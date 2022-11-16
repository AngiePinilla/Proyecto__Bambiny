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
public class EpsVO {
    
    private String id_eps, nom_eps;

    public EpsVO(String id_eps, String nom_eps) {
        this.id_eps = id_eps;
        this.nom_eps = nom_eps;
    }

    public String getId_eps() {
        return id_eps;
    }

    public void setId_eps(String id_eps) {
        this.id_eps = id_eps;
    }

    public String getNom_eps() {
        return nom_eps;
    }

    public void setNom_eps(String nom_eps) {
        this.nom_eps = nom_eps;
    }







}