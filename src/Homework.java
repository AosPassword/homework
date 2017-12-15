import PACKAGE_NAME.Chaxun;
import PACKAGE_NAME.FileProperty;

import java.util.ArrayList;

public class Homework {
    public static void main(String[] args) {
        String path="F:\\steam";
        Chaxun chaxun=new Chaxun();
        ArrayList<String> fileLastModified=new ArrayList();
        ArrayList<String> fileName=new ArrayList();
        ArrayList<String> filePath=new ArrayList();
        ArrayList<String> fileKind=new ArrayList<>();
        ArrayList<Integer> fileId=new ArrayList<>();
        fileLastModified = chaxun.getAllFileLastModified(path,fileLastModified);
        fileName = chaxun.getAllFileName(path,fileName);
        filePath = chaxun.getAllFilePath(path,filePath);
        fileId  =chaxun.getAllFileId(path,fileId,0);
        ArrayList<FileProperty> files=new ArrayList<>();
        for (int i = 0; i <fileName.size() ; i++) {
            FileProperty fileProperty=new FileProperty();
            fileProperty.setName(fileName.get(i));
            fileProperty.setAbsolutelyPath(filePath.get(i));
            fileProperty.setFinalChangeTime(fileLastModified.get(i));
            fileProperty.setId(fileId.get(i));
            fileProperty.setOperation("yes");
            if(fileProperty.getName().contains(".")) {
                fileProperty.setKind(fileProperty.getName().substring(fileProperty.getName().lastIndexOf("."), fileProperty.getName().length()));
            }else {
                fileProperty.setKind("Directory");
            }
            files.add(fileProperty);
        }
        for (FileProperty a:files){
            String result="";
            for (int i=0;i<a.getId();i++){
                result+="\t";
            }
            result+="Name:"+a.getName()+"\tKind:"+a.getKind()
                    +"\tAbsolutepath"+a.getAbsolutelyPath()+"\tFinalChangeTime"+a.getFinalChangeTime()
                    +"\tOperation"+a.getOperation();
            System.out.println(result);
        }
    }
}
