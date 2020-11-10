public class Paragraph implements Element{
    private String name;
    private AlignStrategy strategy;

    Paragraph(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print(){
        if (strategy == null) {
            System.out.println("Paragraph with name: "+this.name);
        }
        else{
            strategy.render(this);
        }

    }

    @Override
    public void accept(Visitor visitor) {

    }

    public void setAlignStrategy(AlignStrategy strategy) {
        this.strategy = strategy;
    }
}
