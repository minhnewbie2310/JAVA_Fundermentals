/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author User
 */
public class Ultility {

    DictionaryWord bd1 = new DictionaryWord("bank robber", "Steals money from a bank");
    DictionaryWord bd2 = new DictionaryWord("burglar", "Breaks into a home to steal things");
    DictionaryWord bd3 = new DictionaryWord("forger", "Makes an illegal copy of something");
    DictionaryWord bd4 = new DictionaryWord("hacker", "Breaks into a computer system");
    DictionaryWord bd5 = new DictionaryWord("hijacker", "Takes control of an airplane");
    DictionaryWord bd6 = new DictionaryWord("kidnapper", "Holds someone for ransom money");
    DictionaryWord bd7 = new DictionaryWord("mugger", "Attacks and steals money from someone");
    DictionaryWord bd8 = new DictionaryWord("murderer", "Kills another person");
    DictionaryWord bd9 = new DictionaryWord("murderer", "Kills another person");

    public void bandau() {
        ArrayList<DictionaryWord> arr = new ArrayList<>();

        arr.add(bd1);
        arr.add(bd2);
        arr.add(bd3);
        arr.add(bd4);
        arr.add(bd5);
        arr.add(bd6);
        arr.add(bd7);
        arr.add(bd8);
        arr.add(bd9);
        int k = 1;
        for (DictionaryWord dictionaryWord : arr) {
            System.out.print(k + " ");
            System.out.print(dictionaryWord);
            System.out.println("");
            k++;
        }

    }

    public void hashset() {

        Set<DictionaryWord> s;
        s = new HashSet<DictionaryWord>();
        s.clear();
        s.add(bd1);
        s.add(bd2);
        s.add(bd3);
        s.add(bd4);
        s.add(bd5);
        s.add(bd6);
        s.add(bd7);
        s.add(bd8);
        s.add(bd9);
        int c = 1;
        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println((c++) + "." + it.next());
        }
        System.out.println();
    }

    public void treeset() {

        Set<DictionaryWord> s;
        s = new TreeSet<DictionaryWord>();
        s.clear();
        s.add(bd1);
        s.add(bd2);
        s.add(bd3);
        s.add(bd4);
        s.add(bd5);
        s.add(bd6);
        s.add(bd7);
        s.add(bd8);
        s.add(bd9);
        int c = 1;
        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println((c++) + "." + it.next());
        }
        System.out.println();

    }

    public void hashmap() {
        int l=1;
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.clear();
        hm.put("bank robber", "Steals money from a bank");
        hm.put("burglar", "Breaks into a home to steal things");
        hm.put("forger", "Makes an illegal copy of something");
        hm.put("hacker", "Breaks into a computer system");
        hm.put("hijacker", "Takes control of an airplane");
        hm.put("kidnapper", "Holds someone for ransom money");
        hm.put("mugger", "Attacks and steals money from someone");
        hm.put("murderer", "Kills another person");
        hm.put("murderer", "Kills another person");
        for (String object : hm.keySet()) {
            System.out.println((l++) + " ." + object + "\n" + hm.get(object));           
        }
    }
}
