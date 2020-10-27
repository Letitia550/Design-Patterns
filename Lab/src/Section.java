import java.util.ArrayList;

public class Section implements Element{
    protected String sectionTitle;
    protected ArrayList<Element> contentElements = new ArrayList<>();

    Section(String sectionTitle){
        this.sectionTitle=sectionTitle;
    }

    public int add(Element elm){
        contentElements.add(elm);
        return contentElements.indexOf(elm);
    }

    public void remove(Element elm){
        contentElements.remove(elm);
    }

    public Element getElement(int index){
        return contentElements.get(index);
    }

    public void print(){
        System.out.println("Section: "+this.sectionTitle);
        for(Element i : contentElements){
            i.print();
        }
    }
}