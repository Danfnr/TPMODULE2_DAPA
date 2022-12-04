public class Handphone {
    private String Informasi;
    private String Telfon;
    private char KirimSMS;   
    private char kirimSMS1dan2;

    public String Handphone(final String Informasi, final String Telfon, final char KirimSMS) {
       this.Informasi = Informasi;
       this.Telfon =Telfon;
       this.KirimSMS = KirimSMS;
       
       return Informasi;
    }
    
    public String getInformasi() {
       return Informasi;
    }
    
    public String getTelfon() {
       return Telfon;
    }
    
    /**
     * @param KirimSMS
     */
    public void setKirimSMS(String KirimSMS) {
       extracted(this.Telfon = Telfon);
    }

    /**
     * @param string
     * @return
     */
    private String extracted(String string) {
        return string;
    }
  
    public String toString() {
       return Informasi + " (" + KirimSMS + ") at " + Telfon;
    }

    public void setInformasi(String informasi) {
        Informasi = informasi;
    }

    public void setTelfon(String telfon) {
        Telfon = telfon;
    }

    public char getKirimSMS() {
        return KirimSMS;
    }

    public void setKirimSMS(char kirimSMS) {
        KirimSMS = kirimSMS;
    }

    public char getKirimSMS1dan2() {
        return kirimSMS1dan2;
    }

    public void setKirimSMS1dan2(char kirimSMS1dan2) {
        this.kirimSMS1dan2 = kirimSMS1dan2;
    }
 }