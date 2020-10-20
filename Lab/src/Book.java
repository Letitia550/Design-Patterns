import java.util.ArrayList;

public class Book{
    private String title;
    private ArrayList<Author> authors = new ArrayList<Author>();
    private TableOfContents tableOfContents;
    ArrayList<Element> content = new ArrayList<>();

    public void print()
    {
        System.out.println("Books's title:" + title);

        System.out.print("Book's authors: ");
        for(Author i : authors) {
            i.print();
        }

        tableOfContents.print();

        for(Element i : content) {
            i.print();
        }
    }

    public Book(String title, TableOfContents tableOfContents) {
        this.title = title;
        this.tableOfContents = tableOfContents;
    }

    public void addAuthor(Author author)
    {
        this.authors.add(author);
    }

    public void addContent(Element element) {
        content.add(element);
    }
}
