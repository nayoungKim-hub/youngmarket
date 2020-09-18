package nyoung.youngmarket.domain;

public class Product {
    private int pdnum;
    private String pdname;
    private int pdcode;
    private String pdprice;
    private String pdimg;
    private String pddes;

    public int getPdnum() {
        return pdnum;
    }

    public void setPdnum(int pdnum) {
        this.pdnum = pdnum;
    }

    public String getPdname() {
        return pdname;
    }

    public void setPdname(String pdname) {
        this.pdname = pdname;
    }

    public int getPdcode() {
        return pdcode;
    }

    public void setPdcode(int pdcode) {
        this.pdcode = pdcode;
    }

    public String getPdprice() {
        return pdprice;
    }

    public void setPdprice(String pdprice) {
        this.pdprice = pdprice;
    }

    public String getPdimg() {
        return pdimg;
    }

    public void setPdimg(String pdimg) {
        this.pdimg = pdimg;
    }

    public String getPddes() {
        return pddes;
    }

    public void setPddes(String pddes) {
        this.pddes = pddes;
    }
}
