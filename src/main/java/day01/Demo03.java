package day01;

import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import utils.MyUtils;


public class Demo03 {
    public static void main(String[] args) throws Exception {

        // 获取文件系统对象
        FileSystem fs = MyUtils.getInstance();

        // 获取指定目录下文件或文件夹信息
        FileStatus[] fileStatuses = fs.listStatus(new Path("/"));
        for (FileStatus fileStatus : fileStatuses) {
            // 名称
            String name = fileStatus.getPath().getName();
            // 路径
            Path path = fileStatus.getPath();
            // 文件块物理切割大小
            long blockSize = fileStatus.getBlockSize();
            // 文件大小
            long len = fileStatus.getLen();
            // 修改时间
            long modificationTime = fileStatus.getModificationTime();
            // 所属组
            String group = fileStatus.getGroup();
            // 所属者
            String owner = fileStatus.getOwner();
            // 副本数
            short replication = fileStatus.getReplication();
            System.out.println(name);
            System.out.println(path);
            System.out.println(blockSize);
            System.out.println(len);
            System.out.println(modificationTime);
            System.out.println(group);
            System.out.println(owner);
            System.out.println(replication);
        }

        // 关闭资源
        fs.close();
    }
}
