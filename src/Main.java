import java.util.Scanner;

class Main
{
    static Scanner sc = new Scanner(System.in);
    public static String[] addnotes()
    {
      System.out.print("Enter Number of Notes :");
      int n = sc.nextInt();
         sc.nextLine();
    
       String[] MGnotes = new String[n];
    
       for(int i = 0;i<MGnotes.length;i++)
      {
          System.out.println("Enter Note "+(i+1)+ " :");
          MGnotes[i] = sc.nextLine();
      }    
      return MGnotes;
       
    }

    public static void display(String[] notes)
    {
        for(int i=0;i<notes.length;i++)
      {
        if(notes[i]!=null)
        {
          System.out.println(+(i+1)+"."+notes[i]);
        }
      }
    }
    
    
    public static void searchnotes(String[] notes)
    {
        int found = 0;
        System.out.print("Enter The Word to Search:");
        String word = sc.nextLine();
        String lower = word.toLowerCase();
        for(int i = 0; i<notes.length;i++)
        {
             if(notes[i] != null)
           {
              String presentWord = notes[i].toLowerCase();
                if(presentWord.contains(lower))
             {
                 found++;
                   System.out.println((i+1)+". "+notes[i]);
              }
           } 
        } 
        if(found==0)
        {
            System.out.print("Word Not Found");            

        }
    }
    
public static void main(String[] args)
    {

        int choice;
        int i = 1;
        String[] notes = new String[5];
        while(i==1)
        {
          System.out.println("===== Welcome to MindGarden =====");
          System.out.println("1. Add Notes");
          System.out.println("2. Search Notes");
          System.out.println("3. Display");
          System.out.println("4.Exit")
          System.out.println("Enter Your Choice : ");
          choice = sc.nextInt();
          sc.nextLine();
        
          switch(choice)
         {
             case 1 :
                        notes = addnotes();
                        break;
            
            case 2 : 
                        searchnotes(notes);
                        break;
            
            case 3 : 
                        display(notes);
                        break;
            case 4 :   
                        System.out.println("Thank you for using MindGarden");
                        return;
            
            default :
                        System.out.println("Invalid Choice!! Try Again");
                        break;
         }

    
        }
        sc.close();
    }
}
