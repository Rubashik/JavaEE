import java.util.Set;
import java.util.TreeMap;

public class Character implements DataElement {
    private String name;
    private CharacterClass dndclass;
    private CharacterRace race;
    private Stats chStats;

    public CharacterRace getRace() {
        return race;
    }

    public void setRace(CharacterRace race) {
        this.race = race;
    }

    public Character(String name, CharacterClass dndclass, CharacterRace race) {
        this.name = name;
        this.dndclass = dndclass;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stats getAtributes() {
        return chStats;
    }
    public void addRaceBonuses() {
        System.out.println("Recalculating attributes for "+this.race.toString());
        Set<String> key=this.chStats.getAttrib().keySet();
        for(String title:key){
            int val=this.chStats.getAttrib().get(title)+this.race.getRaceBonuses().getAttrib().get(title);
            this.chStats.getAttrib().put(title, val);
        }
    }

    public void setAtributes(Stats attributes) {
        this.chStats = attributes;
    }
    public void printSheet(){
        System.out.println("Name: "+name+"\nClass: "+dndclass);
        race.print();
        chStats.printStats();
    }

    public void battleCry(){
        race.shout();
    }

    public CharacterClass getDndClass() {
        return dndclass;
    }

    @Override
    public TreeMap access(DataElementsVisitor vis) {
        return vis.visit(this);
    }
}