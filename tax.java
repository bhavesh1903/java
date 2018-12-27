class Tax{
    public static void main(String args[]){
        int price,quantity,totalPurchase;
        price=Integer.parseInt(args[0]);
        quantity=Integer.parseInt(args[1]);
        totalPurchase=(price*quantity)+((1235*100)/100);
        System.out.println("total purchase is:"+totalPurchase);
    }
}
