import java.util.Scanner;
import java.util.ArrayList;


class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void addnotes(ArrayList<Note> notes)
    {
          System.out.print("Enter Title: ");
          String title = sc.nextLine();

          System.out.print("Enter Category: ");
          String category = sc.nextLine();

          System.out.print("Enter Content: ");
          String content = sc.nextLine();

          System.out.print("Enter Created At: ");
          String createdAt = sc.nextLine();
          notes.add(new Note(title,category,content,createdAt));
          System.out.println("Note Added Succesfully");
    }


    public static void editnotes(ArrayList<Note> notes)
    {
        System.out.println("Look for notes you want to edit");
        display(notes);
        System.out.println("Select The Note You want to edit");
        String word = sc.nextLine();
        for(int i=0;i<notes.size();i++)
        {
            if(notes.get(i).getTitle().equals(word))
            {
                System.out.println("Enter New Title");
                String newTitle = sc.nextLine();
                System.out.println("Enter New Category");
                String newCategory = sc.nextLine();
                System.out.println("Enter New Content");
                String newContent = sc.nextLine();
                notes.get(i).setTitle(newTitle);
                notes.get(i).setCategory(newCategory);
                notes.get(i).setcontent(newContent);
            }

        }
    }



    public static void display(ArrayList<Note> notes)
    {
        for(int i=0;i<notes.size();i++)
      {
        if(notes.get(i)!=null)
        {
          notes.get(i).displayNote();
        }
      }
    }
    
        public static void searchnotes(ArrayList<Note> notes)
    {
        int found = 0;
        System.out.print("Enter The Word to Search:");
        String word = sc.nextLine();
        String lower = word.toLowerCase();
        for(int i = 0; i<notes.size();i++)
        {
             if(notes.get(i) != null)
           {
              String presentWord = notes.get(i).getTitle().toLowerCase();
                if(presentWord.contains(lower))
             {
                 found++;
                  notes.get(i).displayNote();
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
        ArrayList<Note> notes = new ArrayList<>();     
        while(i==1)
        {
          System.out.println("===== Welcome to MindGarden =====");
          System.out.println("1. Add Notes");
          System.out.println("2. Search Notes");
          System.out.println("3. Edit Note");
          System.out.println("4. Display");
          System.out.println("Enter Your Choice : ");
          choice = sc.nextInt();
          sc.nextLine();
        
          switch(choice)
         {
             case 1 :
                        addnotes(notes);
                        break;
            
            case 2 : 
                        searchnotes(notes);
                        break;
            
            case 3 : 
                        editnotes(notes);
                        break;         
            
            case 4 :
                        display(notes);
                        break;
            case 5 :   
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
        int i = 1;
        ArrayList<Note> notes = new ArrayList<>();     
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
                        addnotes(notes);
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
