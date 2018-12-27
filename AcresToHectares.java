class AcresToHectares{
    public static void main(String args[]){
        double acres,hectares;
        acres=Double.parseDouble(args[0]);
        hectares=acres/2.4711;
        System.out.println("acres to hectares:"+hectares);
        double acres1,hectares1;
        hectares1=Double.parseDouble(args[1]);
        acres1=hectares1*2.4711;
        System.out.println("hectares to acres:"+acres1);
    }
}
