public class ClassFactory {
    public static CharacterClass getClass(String type){
        if("Fighter".equalsIgnoreCase(type)) return new Fighter();
        else if("Sorcerer".equalsIgnoreCase(type)) return new Sorcerer();
        return null;
    }
}
