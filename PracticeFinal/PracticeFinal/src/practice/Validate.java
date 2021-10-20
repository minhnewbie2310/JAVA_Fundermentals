/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Validate {

    //count and return number of book which has code contain digit and letter
    public int f1(List<Book> a) {
        int count = 0;
        for (Book o : a) {
            int demchu = 0;
            int demso = 0;
            for (int i = 0; i < o.getCode().length(); i++) {
                char c = o.getCode().charAt(i);
                if (Character.isDigit(c)) {
                    demso++;
                }
                if (Character.isLetter(c)) {
                    demchu++;
                }
            }
            if (demchu != 0 && demso != 0) {
                count++;
            }
        }
        return count;

    }

    //count and return number of book which has code start with "a"
    //the comparation must ignore case
    public int f2(List<Book> a) {
        int count = 0;
        for (Book o : a) {
            if (o.getCode().startsWith("a") || o.getCode().startsWith("A")) {
                count++;
            }
        }
        return count;
    }

    //sort books assending by price if price greater or equals 20
    //if book have price smaller than 20 then keep the position 
    public void f3(List<Book> a) {
        List<Book> list = new ArrayList<>();
        for (Book o : a) {
            if (o.getPrice() >= 20) {
                list.add(o);
            }
        }
        //sort by ascending
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        //add
        int index = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getPrice() >= 20) {
                a.remove(i);
                a.add(i, list.get(index));
                index++;
            }
        }
    }

    //sort list assending by last name of book.
    public void f4(List<Book> a) {
        Collections.sort(a, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                String txt1[] = o1.getName().split(" ");
                String txt2[] = o2.getName().split(" ");
                String lastName1 = txt1[txt1.length - 1];
                String lastName2 = txt2[txt2.length - 1];
                return lastName1.compareToIgnoreCase(lastName2);
            }
        });

    }

    //change all code of all book
    //input code: MLN1051309hn
    //output code:mln1051309HN
    public void f5(List<Book> a) {
        for (Book o : a) {
            String code = o.getCode();
            String result = "";
            for (int i = 0; i < code.length(); i++) {
                char c = code.charAt(i);
                if (Character.isLetter(c)) {
                    if (Character.isUpperCase(c)) {
                        c = Character.toLowerCase(c);
                    } else {
                        c = Character.toUpperCase(c);
                    }
                }
                result += c;
            }
            o.setCode(result);
        }
    }

    //remove last book which has price = min price
    public void f6(List<Book> a) {
        double min = a.get(0).getPrice();
        for (Book o : a) {
            if (o.getPrice() < min) {
                min = o.getPrice();
            }
        }
        int acc = a.size();
        for (int i = acc-1; i > 0; i--) {
            a.remove(i);
            break;
        }
    }

    //sort assending by price, if price equal then assending by name
    public void f7(List<Book> a) {
        Collections.sort(a, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return o1.getName().compareToIgnoreCase(o2.getName());
                }
            }
        });
    }

    //return list book có brand là "truyen tranh"
    public List<Book> f8(List<Book> a) {
        List<Book> tt = new ArrayList<>();
        for (Book o : a) {
            if(o.getType().equals("truyen tranh")){
                tt.add(o);
            }
        }
        return tt;
    }

    //sort ascending by price list from index
    public void f9(List<Book> a, int index) {
        List<Book> srt = new ArrayList<>();
        for (int i = index; i < a.size(); i++) {
            srt.add(a.get(index));
        }
        Collections.sort(srt, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    //sort ascending book by price in list which has brand is "truyen dai"
    // các vị trí khác không thay đổi
    public void f10(List<Book> a) {
        List<Book> list = new ArrayList<>();
        for (Book o : a) {
            if (o.getType().equalsIgnoreCase("truyen dai")) {
                list.add(o);
            }
        }
        //sort by ascending
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        //add
        int index = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getType().equalsIgnoreCase("truyen dai")) {
                a.remove(i);
                a.add(i, list.get(index));
                index++;
            }
        }
    }
    

}
