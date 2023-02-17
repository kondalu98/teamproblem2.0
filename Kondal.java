import java.util.*;
class vis1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nuber of teams");
        int size=sc.nextInt();
        String[] str=new String[size];
        System.out.println("enter name of teams");
        for (int i=0;i<size;i++) {
            str[i]=sc.next();
            
        }
        System.out.println("schdule for teams ");
        displayMatches( str,size);
        
             
        }
       static void displayMatches(String[] str,int size){
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size/2;j++){
                int t1=(i+j)%(size-1);
                int t2=(size-1-j+i)%(size-1);
                if(j==0){
                    t2=size-1;
                }
                System.out.println(str[t1]+"\tvs\t"+str[t2]);
            }
         }
       }
        
    }
