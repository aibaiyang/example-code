package com.example.demo.collections;

import com.google.common.base.Joiner;
import com.google.common.collect.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class GuavaCollections {

    public static void main(String[] args) {

        //创建List
        List<String> list = Lists.newArrayList("a","b","c");
        list.add("d");
        //反转List
        System.out.println(Lists.reverse(list)); // [d, c, b, a]

        //将List集合转换为特定规则的字符串
        String listResult = Joiner.on("-").join(list);
        System.out.println(listResult); // a-b-c-d

        //定义Map
        Map<String,String > map = Maps.newHashMap();
        map.put("name","by");
        map.put("age","23");
        System.out.println(map); //{name=by, age=23}
        //将Map集合转换为特定规则的字符串
        String mapResult = Joiner.on(",").withKeyValueSeparator("=").join(map);
        System.out.println(mapResult); // name=by,age=23

        //定义Map中放List的形式（Map<String,List<Integer>>）
        Multimap<String,Integer> maps = ArrayListMultimap.create();
        maps.put("map",1);
        maps.put("map",2);
        System.out.println(maps); //{map=[1, 2]}

        //定义Set
        Set<String> set = Sets.newHashSet();
        set.add("value");
    }
}
