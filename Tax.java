class Tax{
    public static void main(String args[]){
        int price,quantity;
        double totalPurchase;
        price=Integer.parseInt(args[0]);
        quantity=Integer.parseInt(args[1]);
        totalPurchase=(price*quantity)+12.35%100;
        System.out.println("total purchase is:"+totalPurchase);
    }
}
