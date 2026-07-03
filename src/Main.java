import java.util.Scanner;

class Main
{

    public static String[] addnotes()
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Number of Notes :");
      int n = sc.nextInt();
         sc.nextLine();
    
       String[] MGnotes = new String[n];
    
       for(int i = 0;i<MGnotes.length;i++)
      {
          System.out.print("Enter Note "+(i+1)+ " :");
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Word to Search:");
        String word = sc.nextLine();
        String lower = word.toLowerCase();
        for(int i = 0; i<notes.length;i++)
        {
             String Presentword = notes[i].toLowerCase();
            if(lower.equals(Presentword) || Presentword.contains(lower))
            {
                found++;
                System.out.print(+(i+1)+"."+notes[i]);            
            }
        }
        if(found==0)
        {
            System.out.print("Word Not Found");            

        }
    }
    
public static void main(String[] args)
 {
        System.out.println("===== Welcome to MindGarden =====");
    
        String[] notes = addnotes();    
        
        display(notes);
        searchnotes(notes);
    
  }
}
