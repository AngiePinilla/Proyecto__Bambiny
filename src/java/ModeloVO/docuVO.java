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
public class docuVO {

    public docuVO() {
    }
    
    
    private String id_docu, id_alum, tipo_docu, fechcreac_docu, archivo_docu;

    public String getId_docu() {
        return id_docu;
    }

    public void setId_docu(String id_docu) {
        this.id_docu = id_docu;
    }

    public String getId_alum() {
        return id_alum;
    }

    public void setId_alum(String id_alum) {
        this.id_alum = id_alum;
    }

    public String getTipo_docu() {
        return tipo_docu;
    }

    public void setTipo_docu(String tipo_docu) {
        this.tipo_docu = tipo_docu;
    }

    public String getFechcreac_docu() {
        return fechcreac_docu;
    }

    public void setFechcreac_docu(String fechcreac_docu) {
        this.fechcreac_docu = fechcreac_docu;
    }

    public String getArchivo_docu() {
        return archivo_docu;
    }

    public void setArchivo_docu(String archivo_docu) {
        this.archivo_docu = archivo_docu;
    }

    public docuVO(String id_docu, String id_alum, String tipo_docu, String fechcreac_docu, String archivo_docu) {
        this.id_docu = id_docu;
        this.id_alum = id_alum;
        this.tipo_docu = tipo_docu;
        this.fechcreac_docu = fechcreac_docu;
        this.archivo_docu = archivo_docu;
    }

   
    
    
    
    
    
}
