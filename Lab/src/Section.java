import java.util.ArrayList;

public class Section implements Element {
    public String title;
    ArrayList<Element> elements = new ArrayList<>();

    public Section(String title, ArrayList<Element> elements) {
        this.title = title;
        this.elements = elements;
    }

    public Section(String title) {
        this.title = title;
    }

    public int add(Element element) {
        elements.add(element);
        return elements.indexOf(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    public Element getElement(int index) {
        return elements.get(index);
    }

    public void print() {
        System.out.println(title);

        for(Element i : elements) {
            i.print();
        }
    }
}
