public class forWhileDo_while {
    public static void main(String[] args){

        //for
        System.out.println("----------for----------");
        for(int i = 1 ; i<=3 ; i++){
            System.out.println("i= " + i);
        }

        //while
        System.out.println("----------while----------");
        System.out.println("...önce yazdır sonra arttır...");
        int n = 1;
        while (n<=3){
            System.out.println("n= " + n);
            n++;
        }
        System.out.println("...önce arttır sonra yazdır");
        int m = 1;
        while (m<=3){
            m++;
            System.out.println("m= " + m);
        }
        System.out.println("...önce arttır sonra yazdır sonra yine arttır");
        int o = 1;
        while (o<=3){
            o++;
            System.out.println("o = " + o);
            o++;
        }

        //while-do
        System.out.println("----------while-do----------");
        int x = 1;
        do {
            System.out.println("x = " + x);
            x++;
        }
        while (x<=3);






    }
}
