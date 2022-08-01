
package aralarindaasal;

import javax.swing.JOptionPane;

public class Aralarindaasal {
    
    public static void main(String[] args) {
         int i,j;
        String sayi1 = JOptionPane.showInputDialog("birinci sayıyı giriniz");
        int s1 = Integer.parseInt(sayi1);
        String sayi2 =  JOptionPane.showInputDialog("ikinci sayıyı giriniz");
          int s2 = Integer.parseInt(sayi2);
          int sayac = 0;
          for(i = 2; i<s1; i++)
          {
      for(j = 2; j<s2; j++)
      {
          if(s1%i==0 && s2%j==0)
           sayac++; 
      }
          }
       if(sayac != 0)
       {
           JOptionPane.showMessageDialog(null, "aralarında asal değiller");
       }
      else
       {
      for( i=1; i<s1; i++)
           if(s1%i==0 && s2%i==0)
       System.out.println("iki sayı arasındaki p-asal sayısı:" +i);
       }
    }
}
