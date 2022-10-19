public class ElfFactory implements RaceAbstractFactory{


    @Override
    public Elf create(String type) {
        return new Elf(type, new Stats(0,2,0,0,1,0));
    }
}
