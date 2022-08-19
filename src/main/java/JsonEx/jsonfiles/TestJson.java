package JsonEx.jsonfiles;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestJson {

    public static void writeToJson(JSONObject object, String fileNameToWrite) throws IOException {
        try{
            FileWriter writer = new FileWriter(fileNameToWrite);
            writer.write(object.toJSONString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }


/*
    public static void addKeyAndValues(String key, Object value){ //
        Map<String, Object> details = new LinkedHashMap<>();
        details.put(key, value);
    }
*/



    public static JSONObject readDataFromJsonFile(String fileName) throws IOException, ParseException {
        JSONParser pimParser = new JSONParser();
        FileReader pimFile = new FileReader(fileName);
        Object obj1 = pimParser.parse(pimFile);
        JSONObject jsonObject = (JSONObject) obj1;
        return jsonObject;
    }






        public static void main(String[] args) throws IOException, ParseException {
        JSONParser pimParser = new JSONParser();
        FileReader pimFile = new FileReader("src/main/java/JsonEx/jsonfiles/Newdata.json");
        Object obj1 = pimParser.parse(pimFile);

        JSONObject pimBody = (JSONObject) obj1;

        System.out.println(pimBody);

        String eventType = (String) pimBody.get("eventName");
        String mspId = (String) pimBody.get("mspId");


        System.out.println(eventType+ mspId);

        //JSONObject obj2 = new JSONObject();
        pimBody.put("name", "mkyong.com");
        pimBody.put("age", 100);

        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");

        pimBody.put("messages", pimBody.get("types"));




        try(FileWriter writer = new FileWriter("src/main/java/JsonEx/jsonfiles/Newdata1.json")){
            writer.write(pimBody.toJSONString());
        }catch (Exception e ){
            e.printStackTrace();
        }
        System.out.println(pimBody);

//////////////////////////////////////// functions ////////////////////////////////////////////////////////////*/*/**/*/*/


        System.out.println("function:\n"+ readDataFromJsonFile("src/main/java/JsonEx/jsonfiles/Newdata1.json"));

//        addKeyAndValues();



        //writeToJson(obj11, "src/main/java/JsonEx/jsonfiles/Newdata1.json");







        ////////////////////////////////////////////// Json parse example //////////////////////////////////
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("src/main/java/JsonEx/jsonfiles/Testdata.json");
        //Read JSON file
        Object obj = jsonParser.parse(reader);

        JSONArray usersList = (JSONArray) obj;
        System.out.println("Users List-> "+usersList); //This prints the entire json file






        for(int i=0;i<usersList.size();i++)
        {
            JSONObject users = (JSONObject) usersList.get(i);
            System.out.println("Users -> "+users);//This prints every block - one json object
            JSONObject user = (JSONObject) users.get("users");
            System.out.println("User -> "+user); //This prints each data in the block
            String username = (String) user.get("username");
            String password = (String) user.get("password");
            System.out.println("The username in JSON is: "+username);
            System.out.println("The password in JSON is: "+password);
        }

    }
}
