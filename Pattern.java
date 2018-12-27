class Pattern{
    public static void main(String args[]){
        int i,j,num;
        num=Integer.parseInt(args[0]);
        for(i=0;i<num;i++){
            for(j=0;j<num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
