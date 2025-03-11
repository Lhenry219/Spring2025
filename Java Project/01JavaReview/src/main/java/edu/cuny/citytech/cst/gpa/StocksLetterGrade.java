<<<<<<< HEAD
package edu.cuny.citytech.cst.gpa;

import java.util.HashMap;
import java.util.Map;


public class StocksLetterGrade {

    static Map<String, Float> map = new HashMap<>();

    static {
        map.put("A+", 4.3f);
        map.put("A", 4f);
        map.put("A-", 3.7f);
        map.put("B+", 3.3f);
        map.put("B", 3f);
        map.put("B-", 2.7f);
        map.put("C+", 2.3f);
        map.put("C", 2f);
        map.put("C-", 1.7f);
        map.put("D+", 1.3f);
        map.put("D", 1f);
        map.put("D-", 0.7f);
        map.put("F", 0f);
    }
    public static float getQPA(String letterGrade){
    	return map.getOrDefault(letterGrade,-1f);
    }
}
=======
package edu.cuny.citytech.cst.gpa;

import java.util.HashMap;
import java.util.Map;


public class StocksLetterGrade {

    static Map<String, Float> map = new HashMap<>();

    static {
        map.put("A+", 4.3f);
        map.put("A", 4f);
        map.put("A-", 3.7f);
        map.put("B+", 3.3f);
        map.put("B", 3f);
        map.put("B-", 2.7f);
        map.put("C+", 2.3f);
        map.put("C", 2f);
        map.put("C-", 1.7f);
        map.put("D+", 1.3f);
        map.put("D", 1f);
        map.put("D-", 0.7f);
        map.put("F", 0f);
    }
    public static float getQPA(String letterGrade){
    	return map.getOrDefault(letterGrade,-1f);
    }
}
>>>>>>> 579b0bf1a55d39c60fe7beceaa336e584357bda4
