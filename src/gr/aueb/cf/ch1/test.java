package gr.aueb.cf.ch1;

public class test {
    public static void main(String[] args) {
        int fp=0,sp=0;
        for(int row=1;row<=8;row++){
            for(int col=1;col<=11;col++){
                if (col==1 || col==11 || (col==fp || col==sp) && row<=10/2+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            if (row==1){
                fp=1;
                sp=11;
            }
            fp++;
            sp--;
        }
    }
}


