package PACKAGE_NAME;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Chaxun {
    public ArrayList getAllFileName(String path, ArrayList<String> fileName) {
        File file = new File(path);
        File[] files = file.listFiles();
        if (files == null) {
            fileName.addAll(Arrays.asList());
        }
        for (File a : files) {
            if (a.isDirectory()) {
                fileName.addAll(Arrays.asList(a.getName()));
                getAllFileName(a.getAbsolutePath(), fileName);
            } else {
                fileName.addAll(Arrays.asList(a.getName()));
            }
        }
        return fileName;
    }

    public ArrayList getAllFilePath(String path, ArrayList<String> filePath) {
        File file = new File(path);
        File[] files = file.listFiles();
        if (files == null) {
            filePath.addAll(Arrays.asList());
        }
        for (File a : files) {
            if (a.isDirectory()) {
                filePath.addAll(Arrays.asList(a.getAbsolutePath()));
                getAllFilePath(a.getAbsolutePath(), filePath);
            } else {
                filePath.addAll(Arrays.asList(a.getAbsolutePath()));
            }
        }
        return filePath;
    }

    public ArrayList getAllFileLastModified(String path, ArrayList<String> fileLastModified) {
        File file = new File(path);
        File[] files = file.listFiles();
        if (files == null) {
            fileLastModified.addAll(Arrays.asList());
        }
        for (File a : files) {
            if (a.isDirectory()) {
                String b = String.valueOf(a.lastModified());
                fileLastModified.add(b);
                getAllFileLastModified(a.getAbsolutePath(), fileLastModified);
            } else {
                fileLastModified.add(String.valueOf(a.lastModified()));
            }
        }
        return fileLastModified;
    }
    public ArrayList getAllFileId(String path, ArrayList<Integer> fileId,int i) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (File a : files) {
            if (a.isDirectory()) {
                fileId.add(i);
                getAllFileId(a.getAbsolutePath(), fileId,++i);
            } else {
                fileId.add(i);
            }
        }
        return fileId;
    }
}