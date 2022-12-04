public class Perangkat {
    private String Drive;
    private String Ram;
    private char Processor;   
  
    
public String Handphone(final String Drive, final String Ram, final char Processor) {
       this.Drive = Drive;
       this.Ram = Ram;
       this.Processor = Processor;
       
       return Drive;
    }
    
    public char getProcessor() {
       return Processor;
    }
    
    public String getRam() {
       return Ram;
    }
    
    public void setRam(String Ram) {
       this.Ram = Ram;
    }
  
    public String toString() {
       return Drive + " (" + Processor + ") at " + Ram;
    }
 }