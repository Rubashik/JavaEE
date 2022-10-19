
public class Demo {
    public static void main(String[] args){
        Character player=new Character("BOBO",ClassFactory.getClass("Fighter"),
                RaceFactory.getRace(new DwarfFactory(), "Dwarf"));
        player.setAtributes( Stats.generate());
        player.addRaceBonuses();
        player.printSheet();
        player.battleCry();

        Character player2=new Character("El",ClassFactory.getClass("Sorcerer"),
                RaceFactory.getRace(new ElfFactory(), "Elf"));
        player2.setAtributes( Stats.generate());
        player2.addRaceBonuses();
        player2.printSheet();
        player2.battleCry();


    }
}