public class Elf extends CharacterRace{

    Elf(String name, Stats stat){
        this.name=name;
        this.bonuses=stat;
    }
    @Override
    public void shout() {
        System.out.println("I am ELF");
    }
}
