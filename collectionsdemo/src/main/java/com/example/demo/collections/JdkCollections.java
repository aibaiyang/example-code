package com.example.demo.collections;

import java.util.*;

public class JdkCollections {

    public static void main(String[] args) {

        List<String>  list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        //Iterator遍历List集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String parm = (String) iterator.next();
            System.out.println(parm);
            if(parm.equals("a")){
                iterator.remove();
            }
        }
        System.out.println(list);

        //排序操作
        Collections.reverse(list);
        System.out.println(list);

        //遍历MAP
        traverseMap();
    }

    /**
     * 遍历Map
     *
     * 获取方法：
     * 第一种方式: 使用keySet
     * 需要分别获取key和value，没有面向对象的思想
     * Set<K> keySet() 返回所有的key对象的Set集合
     */
   static void traverseMap(){
       Map<Integer, String> map = new HashMap<>();
       map.put(1, "aaaa");
       map.put(2, "bbbb");
       map.put(3, "cccc");
       System.out.println(map);

       Set<Integer> ks = map.keySet();
       Iterator<Integer> it = ks.iterator();
       while (it.hasNext()) {
           Integer key = it.next();
           String value = map.get(key);
           System.out.println("key=" + key + " value=" + value);
       }
   }
}
