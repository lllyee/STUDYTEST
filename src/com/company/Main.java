package com.company;
import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      /*  FileReader fr = new FileReader("C:\\Users\\Dell\\IdeaProjects\\untitled\\test.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        Map<String, String> map = new HashMap<String, String>();
        while ((line = br.readLine()) != null) {
            String[] split = line.split(" ");
            if (map.containsKey(split[0])) {
                StringBuffer sb = new StringBuffer(map.get(split[0]));
                sb.append(split[1]);
                map.put(split[0], sb.toString());
            } else {
                map.put(split[0], split[1]);
            }
        }
        FileWriter newfr=new FileWriter("C:\\Users\\Dell\\IdeaProjects\\untitled\\test1.txt");
        BufferedWriter newbr=new BufferedWriter(newfr);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String mapkey = entry.getKey();
            String mapvalue = entry.getValue();
            System.out.println(mapkey + " " + mapvalue);
            newbr.write(mapkey);
            newbr.write(" ");
            newbr.write(mapvalue);
            newbr.newLine();
        }newbr.close();

*/
        Integer [] test={1,3,4,-1};
        List<Integer> list= Arrays.asList(test);




    }
}