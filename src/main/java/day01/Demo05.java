package day01;

import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import utils.MyUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo05 {
    public static void main(String[] args) throws Exception {

        // 获取文件系统对象
        FileSystem fs = MyUtils.getInstance();

        // 读取数据 获得输入流
        FSDataInputStream fis = fs.open(new Path("/4.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;
        // 读取一行
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // 关闭资源
        br.close();
        fis.close();
        fs.close();
    }
}
