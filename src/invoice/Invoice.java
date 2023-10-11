package invoice;

public class Invoice {

    public String modelul;
    public String descrierea;
    public int cantitatea;
    public double pret;


   public Invoice (String modelul, String descrierea, int cantitatea, double pret) {
       this.modelul = modelul;
       this.descrierea = descrierea;
       this.cantitatea = cantitatea;
       this.pret = pret;

    }
    public String getModelul() {
        return modelul;
    }

    public void setModelul(String modelul) {
        this.modelul = modelul;
    }
    public String getDescrierea() {
        return descrierea;
    }
    public void setDescrierea(String descrierea) {
        this.descrierea = descrierea;
    }
    public int getCantitatea() {
         return cantitatea;
            }
    public void setCantitatea(int cantitatea){
//        if(cantitatea < 0){
//            System.out.println("Cantitatea este negativ");
//        } else {
        this.cantitatea = cantitatea;
    }
       public double getPret(double pret) {
            return pret;
        }
    public void setPret(double pret) {
//            if (pret < 0) {
//               System.out.println("Pretul este negativ");
//            } else {
               this.pret = pret;
            }

         public double getAmount() {
            return cantitatea * pret;
        }

    }
