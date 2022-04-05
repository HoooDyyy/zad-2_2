import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
  System.out.println("Co chcesz zrobic:");
  System.out.println("1.Liczenie znaków");
  System.out.println("2.Zamiana liter ");
  System.out.println("3.Podkreślenia ");
  System.out.println("Wprowadz dowolny tekst");
    
    Scanner scan = new Scanner(System.in);
    String tekst = scan.nextLine();
    int x = scan.nextInt();
    
    switch(x)
    {
        case 1 : 
        {
         
        int dlugosc = tekst.length();
        System.out.println("Dlugosc tekstu wynosi "+dlugosc);
          
          }
        break;
    
    case 2:
      
    {
       

      char[] tablica = tekst.toCharArray();
      char znak;
      int kod;
      for (int i = 0;tekst.length()>i; i++)
        {
          kod=(int)tablica[i];
       if(kod>64&& kod<91)
        {
          kod=kod+32;
          znak=(char)kod;
          tablica[i]=znak;
          }
      else 
       {
          kod=kod-32;
         znak=(char)kod;
         tablica[i]=znak;
         }
          
        }
      for (int i = 0;tekst.length()>i; i++)
        {
          System.out.print(tablica[i]);
        }
          
          
      
    break; 
    }
        case 3:
      
    tekst = tekst.replaceAll(" ", "_");
        System.out.println(tekst);
    break; 
    }
    }
}
  
