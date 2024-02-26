package PractiseProgram;

import java.util.HashMap;

public class MapCheck {
    public static void main(String[] args){
        int a=10;
        int b;
        b=a;
        System.out.println("a:"+a +" "+ "b:"+b);
        a=20;
        b=a;
        System.out.println("a:"+a +" "+ "b:"+b);

        HashMap<String,Integer> map=new HashMap<>();
        map.put("a1",10);
        HashMap<String,Integer> map1=new HashMap<>();
        map1=map;
        System.out.println("map:"+map+" "+ "map1:"+map1);
        map1.put("a1",20);
        map=map1;
        System.out.println("map:"+map+" "+ "map1:"+map1);
    }
}
