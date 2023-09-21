package com.example;

import java.util.Arrays;
import java.util.Comparator;

public class Array172 {
    public static void main(String[] args) {

        Item[] items = new Item[5];
        items[0] = new Item("javascript", 4000);
        items[1] = new Item("python", 6000);
        items[2] = new Item("dart", 2000);
        items[3] = new Item("java", 8000);
        items[4] = new Item("c#", 6500);

        // sort(Object[]) - Object 는 모든 객체의 조상이기 때문에, 어떤 객체의 배열이든 올 수 있다.
//        Arrays.sort(items);
        Arrays.sort(items, (item1, item2) -> item1.getName().compareTo(item2.getName()));

        for(Item item : items){
            System.out.println(item);
        }
    }
}

// method가 하나만 있는 인터페이스기 때문에 람다 인터페이스이다.
//class ItemSorter implements Comparator {
////    compare란 o1 - o2 해서 앞에것이 크면 양수 뒤에것이 크면 음수
//    @Override
//    public int compare(Object o1, Object o2) {
//        Item item1 = (Item)o1;
//        Item item2 = (Item)o2;
//        return item1.getName().compareTo(item2.getName());
//    }
//}

//Comparable 는 어떤 item이 큰지 작은지 기준을 정하는 인터페이스다
class Item implements Comparable {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

//    parameter로 들어온 Object와 내 자신을 비교하는 메소드
//    compareTo에서는 Object를 받아들이도록 했지만 실재로는 item이 들어온다.
    // 홍길동, 고길동
//    @Override
//    public int compareTo(Object o) {
//        Item d = (Item)o;
//        return this.name.compareTo(d.name); // 양수, 0, 음수
//    }

    @Override
    public int compareTo(Object o) {
        Item d = (Item)o;
        return this.price - d.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}