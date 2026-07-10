public class Note
{
          private String title;
          private String category;
          private String createdAt;
          private String content;
          private boolean completed;

       public Note(String title, String category,String content,String createdAt)
        {
            this.title = title;
            this.category = category;
            this.createdAt = createdAt;
            this.content = content;
            this.completed = false;

        }


  public void displayNote()
    {
        System.out.println("------------------------------");
        System.out.println("Title      : " + title);
        System.out.println("Category   : " + category);
        System.out.println("Created At : " + createdAt);
        System.out.println("Content    : " + content);
        System.out.println("Completed  : " + completed);
        System.out.println("------------------------------");
    }

    public String getTitle()
    {
        return title;
    }

    public String getCategory()
    {
        return category;
    }

    public String getCreatedAt()
    {
        return createdAt;
    }

    public String getContent()
    {
        return content;
    }

    public boolean isCompleted()
    {
        return completed;
    }

    public void markAsCompleted()
    {
        completed = true;
    }

    public void setTitle(String title)
  {
     this.title = title;

  }
   public void setCategory(String category)
  {
     this.category = category;

  }
  public void setcreatedAt(String createdAt)
  {
     this.createdAt = createdAt;

  }
   public void setcontent(String content)
  {
     this.content = content;

  }



}

