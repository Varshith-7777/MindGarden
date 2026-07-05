import java.util.Scanner;

class Main
{
    static Scanner sc = new Scanner(System.in);
    public static Note[] addnotes()
    {
      System.out.print("Enter Number of Notes :");
      int n = sc.nextInt();
      sc.nextLine();
    
       Note[] MGnotes = new Note[n];
    
       for(int i = 0;i<MGnotes.length;i++)
      {

          System.out.print("Enter Title: ");
          String title = sc.nextLine();

          System.out.print("Enter Category: ");
          String category = sc.nextLine();

          System.out.print("Enter Content: ");
          String content = sc.nextLine();

          System.out.print("Enter Created At: ");
          String createdAt = sc.nextLine();

          MGnotes[i] = new Note(title,category,createdAt,content);
      }    
      return MGnotes;
       
    }

    public static void display(Note[] notes)
    {
        for(int i=0;i<notes.length;i++)
      {
        if(notes[i]!=null)
        {
          notes[i].displayNote();
        }
      }
    }
    
    
    public static void searchnotes(Note[] notes)
    {
        int found = 0;
        System.out.print("Enter The Word to Search:");
        String word = sc.nextLine();
        String lower = word.toLowerCase();
        for(int i = 0; i<notes.length;i++)
        {
             if(notes[i] != null)
           {
              String presentWord = notes[i].getTitle().toLowerCase();
                if(presentWord.contains(lower))
             {
                 found++;
                  notes[i].displayNote();
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
        Note[] notes = new Note[10];
        while(i==1)
        {
          System.out.println("===== Welcome to MindGarden =====");
          System.out.println("1. Add Notes");
          System.out.println("2. Search Notes");
          System.out.println("3. Display");
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
