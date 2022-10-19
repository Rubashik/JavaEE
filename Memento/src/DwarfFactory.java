public class DwarfFactory implements RaceAbstractFactory{
    @Override
    public Dwarf create(String type) {
        return new Dwarf(type,new Stats(2,0,2,0,0,0));
    }
}
