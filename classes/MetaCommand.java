package classes;

public class MetaCommand implements SqlCommand{

  enum Command {
    EXIT,
    HELP,
    TABLES,
    UNKNOWN
  }

  private Command command;

  public MetaCommand(String str) {
    str = str.toLowerCase();
    this.setType(str);

  }
  @Override
  public Void setType(String str){
    if (str.equals("exit")){
      this.command=Command.EXIT;
    }
    else if(str.equals("help"))
    {
      this.command=Command.HELP;
    }
    else if(str.equals("tables"))
    {
      this.command=Command.TABLES;
    }
    else{
      this.command=Command.UNKNOWN;
    }
    return null;

    }

  @Override
  public String getCommandType() {
    // TODO Auto-generated method stub
    return "This is a MetaCommand String of type: "+this.command;
  }
}
