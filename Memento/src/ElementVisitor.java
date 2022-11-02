import java.util.TreeMap;

public class ElementVisitor implements DataElementsVisitor{

    @Override
    public TreeMap visit(Character ch) {
        TreeMap jobj = new TreeMap();
        jobj.put("Name",ch.getName());
        return jobj;
    }

    @Override
    public TreeMap visit(CharacterClass cl) {
        TreeMap jobj = new TreeMap();
        jobj.put("Class", cl.toString());
        return jobj;
    }

    @Override
    public TreeMap visit(CharacterRace cr) {
        TreeMap jobj = new TreeMap();
        jobj.put("Race", cr.toString());
        return jobj;
    }

    @Override
    public TreeMap visit(Stats st) {
        TreeMap jobj = new TreeMap();
        jobj.put("Attributes",st.getAttrib());
        return jobj;
    }
}
