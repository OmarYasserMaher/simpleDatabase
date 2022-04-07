package classes;

public class Statement implements SqlCommand{
    enum Type{
        SELECT,
        INSERT,
        UPDATE,
        DELETE,
        UNKNOWN
    }

    private Type type;

    @Override
    public Void setType(String str) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public String getCommandType() {
        // TODO Auto-generated method stub
        return "This is a Statement String of type: "+this.type;

    }
}
