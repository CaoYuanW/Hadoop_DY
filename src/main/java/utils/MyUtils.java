package utils;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

import java.net.URI;

public class MyUtils {


    // 获取FileSystem文件系统对象
    public static FileSystem getInstance() throws Exception{
        return FileSystem.get(new URI("hdfs://linux01:8020"),new Configuration(),"root");
    }

}
