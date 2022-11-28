package day01;

import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import utils.MyUtils;

public class Demo07 {

    public static void main(String[] args) throws Exception {

        // 获取文件系统对象
        FileSystem fs = MyUtils.getInstance();

        // 获取输出流
        FSDataOutputStream fos = fs.append(new Path("/1.txt"));
        // 追加写
        fos.writeUTF("BigData");

        // 关闭资源
        fos.close();
        fs.close();
    }
}

