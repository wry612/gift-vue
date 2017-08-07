package cn.datai.gift.utils.file;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.Zip;
import org.apache.tools.ant.types.FileSet;

import java.io.File;

/**
 * ZIP压缩工具
 * Created by H.CAAHN on 2016/12/2.
 */
public class ZipCompressor {
    public static void compress(String srcPathName, String destFilePath) {
        File srcdir = new File(srcPathName);
        if (!srcdir.exists())
            throw new RuntimeException(srcPathName + "不存在！");

        Project prj = new Project();
        Zip zip = new Zip();
        zip.setProject(prj);
        zip.setDestFile(new File(destFilePath));
        FileSet fileSet = new FileSet();
        fileSet.setProject(prj);
        fileSet.setDir(srcdir);
        zip.addFileset(fileSet);

        zip.execute();
    }
}
