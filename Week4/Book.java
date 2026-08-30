public class Book
{
    private String title;
    private String author;
    private String bookCode;
    private boolean loaned;

    public Book(String title,String author,String bookCode)
    {
        if(title!=null&&!title.isBlank())
            this.title=title;
        if(author!=null&&!author.isBlank())
            this.author=author;
        if(bookCode!=null&&!bookCode.isBlank())
            this.bookCode=bookCode;
        loaned=false;
    }

    public boolean borrowBook()
    {
        if(!loaned)
        {
            loaned=true;
            return true;
        }
        return false;
    }

    public boolean returnBook()
    {
        if(loaned)
        {
            loaned=false;
            return true;
        }
        return false;
    }

    public boolean isAvailable()
    {
        return !loaned;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getBookCode()
    {
        return bookCode;
    }

    public boolean isLoaned()
    {
        return loaned;
    }

    public String toString()
    {
        return "Book{title='"+title+"', author='"+author+"', bookCode='"+bookCode+"', loaned="+loaned+"}";
    }
}