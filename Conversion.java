class Conversion{

    public static void main(String args[]){
        int binary[]={0,0,0,0,0,0,0};
            int rem,i=0,num=14;
            while(num>  0){
                    rem=num%2;
                    num/=2;

                    binary[i]=rem;
                    System.out.println(binary[i]+",");

                    i++;
            }

            int bin=binary.length();
                        System.out.println(bin+",");
            for(i=bin;i>=0;i--){
                    System.out.println(binary[i]+",");
            }

    }
}
