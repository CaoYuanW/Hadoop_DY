package day01;

import org.apache.hadoop.fs.*;
import utils.MyUtils;

import java.util.Arrays;
import java.util.List;


public class Demo04 {
    public static void main(String[] args) throws Exception {

        // 获取文件系统对象
        FileSystem fs = MyUtils.getInstance();

        // 获取指定目录下文件信息 是否递归
        RemoteIterator<LocatedFileStatus> locatedFileStatusRemoteIterator = fs.listFiles(new Path("/"),false);
        // 迭代文件
        while (locatedFileStatusRemoteIterator.hasNext()){
            LocatedFileStatus next = locatedFileStatusRemoteIterator.next();
            // 文件路径
            System.out.println(next.getPath());
            // 文件名称
            System.out.println(next.getPath().getName());
            // 文件块物理切割大小
            System.out.println(next.getBlockSize());
            // 文件大小
            System.out.println(next.getLen());
            // 文件所属组
            System.out.println(next.getGroup());
            // 文件所属者
            System.out.println(next.getOwner());
            // 文件修改时间
            System.out.println(next.getModificationTime());
            // 文件副本数
            System.out.println(next.getReplication());
            // 文件权限
            System.out.println(next.getPermission());
            // 文件块信息
            BlockLocation[] blockLocations = next.getBlockLocations();
            for (BlockLocation blockLocation : blockLocations) {
                // 偏移量
                System.out.println(blockLocation.getOffset());
                // 数据块所在主机名
                String[] hosts = blockLocation.getHosts();
                List<String> hostNames = Arrays.asList(hosts);
                System.out.println(hostNames);
            }
        }


        // 关闭资源
        fs.close();
    }
}
