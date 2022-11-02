
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException{
        ElementVisitor visitor=new ElementVisitor();
        JSONObject jsonObject = new JSONObject();
        FileWriter file = new FileWriter("output.json");

        Character player1=new Character("Thorin II \"Oakenshield\"",
                ClassFactory.getClass("Barbarian"),
                RaceFactory.getRace(new DwarfFactory(), "Mountain Dwarf"));
        player1.setAtributes(Stats.generate());
        player1.addRaceBonuses();

        List<DataElement> list = new ArrayList<>();
        list.add(player1);
        list.add(player1.getDndClass());
        list.add(player1.getRace());
        list.add(player1.getAtributes());

        for(DataElement elem:list){
            jsonObject.putAll(elem.access(visitor));
        }

        file.write("[");
        file.write(jsonObject.toJSONString());
        list.clear();
        Character player2=new Character("Feanor of Noldor",
                ClassFactory.getClass("Wizard"),
                RaceFactory.getRace(new ElfFactory(), "High Elf"));
        player2.setAtributes(Stats.generate());
        player2.addRaceBonuses();

        list.add(player2);
        list.add(player2.getDndClass());
        list.add(player2.getRace());
        list.add(player2.getAtributes());

        for(DataElement elem:list){
            jsonObject.putAll(elem.access(visitor));
        }
        file.write(",");

        file.write(jsonObject.toJSONString());
        file.write("]");
        file.close();

    }
}