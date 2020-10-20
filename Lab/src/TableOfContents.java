public class TableOfContents {
    public String table;

    public void print()
    {
        System.out.print("Table of contents: ");
        System.out.println(table);
    }

    public TableOfContents(String table) {
        this.table = table;
    }
}
