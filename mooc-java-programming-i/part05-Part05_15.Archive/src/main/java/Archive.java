public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier,String name){
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier(){
        return this.identifier;
    }

    public String getName(){
        return this.name;
    }

    public boolean equals(Object compared){
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }
        Archive comArchive = (Archive) compared;
        return this.identifier.equals(comArchive.identifier);
    }

    public String toString(){
        return this.identifier+": "+this.name;
    }
}
