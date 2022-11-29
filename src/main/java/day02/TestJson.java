package day02;

import bean.User;
import com.alibaba.fastjson.JSON;

public class TestJson {
    public static void main(String[] args) {

        User user = new User("Tom", 22);
        // javabean-->json
        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString);

        // json-->javabean
        User user1 = JSON.parseObject(jsonString, User.class);
        System.out.println(user1);
    }
}
