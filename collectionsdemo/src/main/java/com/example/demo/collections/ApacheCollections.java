package com.example.demo.collections;

import com.example.demo.entity.User;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ApacheCollections {

    public static void main(String[] args) {

        User user = new User();
        user.setId(1L);
        user.setName("by");

        User user1 = new User();
        user1.setId(2L);
        user1.setName("ly");

        User user2 = new User();
        user2.setId(3L);
        user2.setName("hy");

        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);

        List<User> list1 = new ArrayList<>();
        list1.add(user);

        List<User> listResult = new ArrayList<>();
/*// 并集
        Collection<User> unionList = CollectionUtils.union(list, list1);
        System.out.println(unionList); // [User(id=1, name=by, alimony=null), User(id=2, name=ly, alimony=null)]
// 交集
        Collection<User> intersectionList = CollectionUtils.intersection(list, list1);
        System.out.println(intersectionList); // [User(id=1, name=by, alimony=null)]
// 集合相减
        Collection<User> subtractList = CollectionUtils.subtract(list, list1);
        System.out.println(subtractList); // [User(id=2, name=ly, alimony=null)]*/

        for(User user3: list){
            long id =user3.getId();
            for(User user4:list1){
                long uid = user4.getId();
                if(uid == id){
                    listResult.add(user4);
                }
            }
        }
        System.out.println(listResult);
    }

}
