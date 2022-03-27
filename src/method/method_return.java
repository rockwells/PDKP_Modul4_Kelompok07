package method;

public class method_return {
    public double pajak3r(){
        double pajak = 0.1 * 300000;
        return pajak ;
    }

    public double bpajak3r(){
        double pajak = 0.1 * 100000;
        return pajak ;
    }

    public double sisa (int s, double total){ ;
        double sisa = s - total;
        System.out.println("sisa saldo anda : " + sisa);
        return sisa;
    }
}
