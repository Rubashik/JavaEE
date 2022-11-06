

public class ClassFactory{
    public static CharacterClass getClass(String type){
        if(type.equals("Fighter")) return new Fighter();
        if(type.equals("Sorcerer")) return new Sorcerer();
        return null;
    }

}
