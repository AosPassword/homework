package PACKAGE_NAME;
public class FileProperty {
    private String Name;
    private String Kind;
    private String AbsolutelyPath;
    private String Operation;
    private String FinalChangeTime;
    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getOperation() {
        return Operation;
    }

    public void setOperation(String operation) {
        Operation = operation;
    }

    public String getFinalChangeTime() {
        return FinalChangeTime;
    }

    public void setFinalChangeTime(String finalChangeTime) {
        FinalChangeTime = finalChangeTime;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public String getAbsolutelyPath() {
        return AbsolutelyPath;
    }

    public String getKind() {
        return Kind;
    }

    public void setAbsolutelyPath(String absolutelyPath) {
        AbsolutelyPath = absolutelyPath;
    }

    public void setKind(String kind) {
        Kind = kind;
    }
    public String toString() {
        String result=null;
        for (int i=0;i<getId();i++){
            result+="\t";
        }
         result+="Name:"+getName()+"\tKind:"+getKind()
                +"\tAbsolutepath"+getAbsolutelyPath()+"\tFinalChangeTime"+getFinalChangeTime()
                +"\tOperation"+getOperation();
        return result;
    }
}
