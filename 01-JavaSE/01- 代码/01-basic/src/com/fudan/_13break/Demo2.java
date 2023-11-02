package com.fudan._13break;

public class Demo2 {
   public static void main(String[] args) {
      Label1:for (int i = 0; i < 5; i++) {
         Label2:for (int j = 0; j < 5; j++) {
            Label3:for (int k = 0; k < 5; k++) {
               if(k==1){
                  break Label1;
               }
               System.out.println("k="+k);
            }
            System.out.println("j="+j);
         }
         System.out.println("i="+i);
      }
   }
}
