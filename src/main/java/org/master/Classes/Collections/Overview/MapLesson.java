package org.master.Classes.Collections.Overview;

import java.util.HashMap;
import java.util.Map;

public class MapLesson {

    public static void main(String[] args) {

        Map <String, String> language = new HashMap<>();
        language.put("java", "software java language");
        language.put("c", "software c language");
        language.put("python", "software python language");
        language.put("lisp", "software lisp language");

        System.out.println(language.get("java"));

        if (language.containsKey("java")){
            System.out.println("java is on the map");
        }else {
            language.put("java", "java added");
        }


        System.out.println("--------------------------");

        if (language.remove("python", "software python language")){
            System.out.println("python removed");
        }else {
            System.out.println("python is not removed");
        }

        System.out.println(language.replace("java", "java2"));


        for (String key: language.keySet()){
            System.out.println(key + " : " + language.get(key));
        }



    }

}
