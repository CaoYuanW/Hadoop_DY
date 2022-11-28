package day01;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;

public class Demo02 {
    public static void main(String[] args) throws Exception{

        // 获取文件系统对象
        FileSystem fs = FileSystem.get(new URI("hdfs://linux01:8020"), new Configuration(), "root");

        // 下载文件
        fs.copyToLocalFile(new Path("/test1/test1.txt"),new Path("C:\\Users\\admin\\Desktop\\test1.txt"));

        // 关闭资源
        fs.close();

    }
}
