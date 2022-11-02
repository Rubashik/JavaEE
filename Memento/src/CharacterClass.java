import java.util.TreeMap;

public abstract class CharacterClass implements DataElement{

    protected String name;
    protected int dice;

    public abstract void printMagicka();

    public int getDice(){
        return dice;
    }
    public String toString(){
        return "Class: "+name+"; uses "+dice+"D dice to roll hp";
    }

    @Override
    public TreeMap access(DataElementsVisitor vis) {
        return vis.visit(this);
    }
}
