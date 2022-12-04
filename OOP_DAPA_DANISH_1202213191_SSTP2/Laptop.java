public class Laptop {
    private String informasi;
    private String bukaGame;
    private static char kirimEmail;
  
    
public String Handphone(final String informasi, final String bukaGame, final char kirimEmail) {
       this.informasi = informasi;
       this.bukaGame = bukaGame;
       Laptop.kirimEmail = kirimEmail;
       
       return informasi;
    }
    
    public int informasi(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
    }
    
    public int bukaGame(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
    }
    
    public int kirimEmail(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
    }

    public int addNumbers(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
  
    }
    public String toString() {
       return informasi+ " (" + kirimEmail + ") at " + bukaGame;
    }

    /**
     * @param args
     */
    public static void main()
    
        final Main obj = new Main();
        int result = obj.addNumbers(kirimEmail, kirimEmail);
        System.out.println("Sum is: " + result);
    }
}