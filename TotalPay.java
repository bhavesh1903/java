class TotalPay{
    public static void main(String args[]){
        double hours,basicPay,totalPay;
        hours=Double.parseDouble(args[0]);
        basicPay=Double.parseDouble(args[1]);
        totalPay=hours*basicPay;
            System.out.println("employess salary is:"+totalPay);

        }
}
