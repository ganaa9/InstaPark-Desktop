/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;
import java.util.Objects;

/**
 *
 * @author malek
 */
public class Parking {
    private int id;
    private String nomp;
    private String nbplace;
    private String plongitude;
    private String platitude;

    public Parking(int id, String nomp, String nbplace, String plongitude, String platitude) {
        this.id = id;
        this.nomp = nomp;
        this.nbplace = nbplace;
        this.plongitude = plongitude;
        this.platitude = platitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomp() {
        return nomp;
    }

    public void setNomp(String nomp) {
        this.nomp = nomp;
    }

    public String getNbplace() {
        return nbplace;
    }

    public void setNbplace(String nbplace) {
        this.nbplace = nbplace;
    }

    public String getPlongitude() {
        return plongitude;
    }

    public void setPlongitude(String plongitude) {
        this.plongitude = plongitude;
    }

    public String getPlatitude() {
        return platitude;
    }

    public void setPlatitude(String platitude) {
        this.platitude = platitude;
    }
   
}
