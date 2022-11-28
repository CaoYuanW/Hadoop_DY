package day01;


import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import utils.MyUtils;

public class Demo08 {
    public static void main(String[] args) throws Exception {
        // 获取文件系统对象
        FileSystem fs = MyUtils.getInstance();

        // 判断该目录下是否有文件存在
        boolean exists = fs.exists(new Path("/4.txt"));
        System.out.println(exists);

        // 创建多级目录
        fs.mkdirs(new Path("/a/b/c"));

        // 关闭资源
        fs.close();
    }
}
