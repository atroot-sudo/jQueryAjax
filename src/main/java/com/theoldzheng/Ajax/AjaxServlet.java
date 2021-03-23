package com.theoldzheng.Ajax;
import com.google.gson.Gson;
import com.theoldzheng.json_Ajax.BaseServlet;
import com.theoldzheng.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.21 19:31
 */
public class AjaxServlet extends BaseServlet {

    public void helloAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ajax is coming");
        Person p3 = new Person(3, "黄大锤");
        Gson gson = new Gson();
        String s = gson.toJson(p3);
        try {
            resp.getWriter().write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void jQueryAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQueryAjax is coming");

        Person p4 = new Person(1, "铠甲勇士");
        Gson gson = new Gson();
        String s = gson.toJson(p4);


        resp.getWriter().write(s);

    }


    public void jQueryGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQueryGet is coming !");

        Person p4 = new Person(2, "铠甲勇士");
        Gson gson = new Gson();
        String s = gson.toJson(p4);
        resp.getWriter().write(s);
    }
    public void jQueryPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQueryPost is coming !");

        Person p4 = new Person(3, "铠甲勇士");
        Gson gson = new Gson();
        String s = gson.toJson(p4);
        resp.getWriter().write(s);
    }
    public void getJson(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("getJson() is coming !");

        Person p4 = new Person(4, "铠甲勇士");
        Gson gson = new Gson();
        String s = gson.toJson(p4);
        resp.getWriter().write(s);
    }
    public void getSerialize(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("getSerialize() is coming !");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        System.out.println("用户名：" + username + "密码：" +  password);

        Gson gson = new Gson();
        String s = gson.toJson(new Person(22,"Harry"));
        resp.getWriter().write(s);
    }


}


/*
class json_Test {

    public static void main(String[] args) {
        Person p1 = new Person(67, "魏忠贤");
        Gson gson = new Gson();
        //将对象转换为JSON
        String s = gson.toJson(p1);
        System.out.println(s);
        //将字符串转化为对象
        Person person2 = gson.fromJson(s, p1.getClass());
        System.out.println(person2);

        //List 与 Json的相互转换
        List<Person> personList = new ArrayList<>();
        Person p2 = new Person(55, "张北京");
        personList.add(p2);
        personList.add(p1);
        //list转化为Json
        String s1 = gson.toJson(personList);
        System.out.println(s1);

        //json转化为list
        List<Person> personList1 = gson.fromJson(s1, new personListFrom().getType());
        System.out.println(personList1);


        //json 转换Map
        Map<Integer, Person> map1 = new HashMap();
        map1.put(1, p1);
        map1.put(2, p2);

        String s2 = gson.toJson(map1);
        System.out.println(s2);

        //json -> Map
        Map<Integer, Person> map2 = gson.fromJson(s2, new TypeToken<HashMap<Integer, Person>>() {
        }.getType());
        System.out.println(map2);

    }
}
*/