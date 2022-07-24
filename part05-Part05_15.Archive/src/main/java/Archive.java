public class Archive {

    private String name;
    private String id;

    public Archive(String identifier, String name) {
        this.name = name;
        this.id = identifier;
    }

    public String toString() {
        return this.id + ": " + this.name;
    }

    public boolean equals(Object compare) {

        if (this == compare) {
            return true;
        }

        if (!(compare instanceof Archive)) {
            return false;
        }

        Archive compareArchive = (Archive) compare;

        if (this.name.equals(compareArchive.name) && this.id.equals(compareArchive.id)) {
            return true;
        } 
        
        if (this.id.equals(compareArchive.id)) {
            return true;
        }

        return false;
    }
}
