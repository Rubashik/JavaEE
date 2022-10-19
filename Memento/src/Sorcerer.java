import java.util.ArrayList;
import java.util.List;
public class Sorcerer extends CharacterClass{

    private List<String> spells;

    public Sorcerer(){
        this.name="Sorcerer";
        this.dice=6;
        this.spells = new ArrayList<>();
        this.spells.add("Meteor");
        this.spells.add("Earthquake");

    }

    @Override
    public void printMagicka() {
        System.out.println("Class "+name+" knows spells:");
        for(String spell:spells){
            System.out.println(spell);
        }

    }
}
