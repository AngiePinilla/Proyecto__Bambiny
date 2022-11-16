/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author yoang
 */
public class AlumFamiVO {
    
    private String ID_ALUM, ID_FAMI;
    
    public AlumFamiVO(String ID_ALUM, String ID_FAMI) {
        this.ID_ALUM = ID_ALUM;
        this.ID_FAMI = ID_FAMI;
    }

    public String getID_ALUM() {
        return ID_ALUM;
    }

    public void setID_ALUM(String ID_ALUM) {
        this.ID_ALUM = ID_ALUM;
    }

    public String getID_FAMI() {
        return ID_FAMI;
    }

    public void setID_FAMI(String ID_FAMI) {
        this.ID_FAMI = ID_FAMI;
    }
    
    
    
}
