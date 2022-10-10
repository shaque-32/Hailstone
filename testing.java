public class testing {
    
    
    public static void main (String[]args){
        hailstone();
    }


    public static void hailstone(){
        int check = 0;
        for (int i=1; i<=200;i++){
            int x = i;
            
            while(x != 1){
            if (x % 2 == 0){
                check = x/2;
                x=check;
                System.out.println(x);
    
            } else if(x % 2 == 1){
                check = (x*3) + 1;
                x = check;
                System.out.println(x);
            }
            if(x==1){
                System.out.println(i + ") goes to 4, 2, 1 sequence! ");
            }
            if (i == 200 && x == 1){
                System.out.println("All numbers 1-200 following this sequence!");
            }
        }
    
        }
    }
        
    
    }
    