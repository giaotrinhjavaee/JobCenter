/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cusc.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Le Thi Minh Loan
 */
@ManagedBean
@RequestScoped
public class DangkyNhaTuyenDung {
    private String email;
    private String matkhau;
    private String tencongty;
    private String motacongty;
    private String websitecongty;
    
    public DangkyNhaTuyenDung() {
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getTencongty() {
        return tencongty;
    }

    public void setTencongty(String tencongty) {
        this.tencongty = tencongty;
    }

    public String getMotacongty() {
        return motacongty;
    }

    public void setMotacongty(String motacongty) {
        this.motacongty = motacongty;
    }

    public String getWebsitecongty() {
        return websitecongty;
    }

    public void setWebsitecongty(String websitecongty) {
        this.websitecongty = websitecongty;
    }
    
}
