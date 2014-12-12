/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.others.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 *
 * @author cgx1844568
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean[] boolArray = new boolean[]{true, false, true};
        JSONArray jsonArray = JSONArray.fromObject(boolArray);
        System.out.println(jsonArray);

        JSONArray jsonArray1 = JSONArray.fromObject("['json','is','easy']");
        System.out.println(jsonArray1);

        List list = new ArrayList();
        list.add("first");
        list.add("second");
        JSONArray jsonArray2 = JSONArray.fromObject(list);
        System.out.println(jsonArray2);

        Map map = new HashMap();
        map.put("name", "json");
        map.put("bool", Boolean.TRUE);
        map.put("int", 1);
        map.put("arr", new String[]{"a", "b"});
        map.put("func", "function(i){ return this.arr[i]; }");
        map.put("date", new Date());
        JSONObject jsonObject = JSONObject.fromObject(map);
        System.out.println(jsonObject);

        System.out.println("-------------------------------------1");
        MyBean mb = new MyBean();
        JSONObject jsonObject2 = JSONObject.fromObject(mb);
        System.out.println(jsonObject2);
        System.out.println("-------------------------------------2");
        jsonObject2.put("date", "2012-12-12");
        JsonConfig cfg = new JsonConfig();
        cfg.registerJsonValueProcessor(Date.class, new JsonValueProcessorImpl());
        //json转换为对象bean时,Date处理
        MyBean bean = (MyBean) JSONObject.toBean(JSONObject.fromObject(jsonObject2, cfg), MyBean.class);
        MyBean bean1 = (MyBean) JSONObject.toBean(JSONObject.fromObject(jsonObject2), MyBean.class);
        System.out.println("" + bean.getDate());
        
        System.out.println("-------------------------------------111");
        MyBean mb1 = new MyBean();
        mb1.setBl(Boolean.FALSE);
        List<MyBean> list1 = new ArrayList<>();
        list1.add(mb);
        list1.add(mb1);
        //Date类型从list转换为json时
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class , new JsonValueProcessorImpl());
        JSONArray jo = JSONArray.fromObject(list1, jsonConfig);
        System.out.println("-------------------------------------3" + jo.toString());
    }
}
