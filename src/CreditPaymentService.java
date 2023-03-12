public class CreditPaymentService {
    public double calculate (double sumCredit, int n){
        double mps = 9.99/12/100;
        double x = mps * Math.pow(1+mps, n);
        double y = Math.pow(1+mps,n)-1 ;
        double k = x/y;
        double payment = sumCredit * k;
        return payment;
    }
}