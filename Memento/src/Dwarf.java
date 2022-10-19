public class Dwarf extends CharacterRace{

    Dwarf(String name, Stats stat){
        this.name=name;
        this.bonuses=stat;
    }

    @Override
    public void shout() {
        System.out.println("I am DWARF");
    }
}
