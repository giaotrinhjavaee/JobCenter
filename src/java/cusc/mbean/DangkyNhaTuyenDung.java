package cusc.mbean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

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

    @PostConstruct
    public void init() {
        // initialization code
    }

    @PreDestroy
    public void shutdown() {
        // shutdown code
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
