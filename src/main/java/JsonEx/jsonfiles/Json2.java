package JsonEx.jsonfiles;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Json2 {
    public static void writeToJson(JSONObject object, String fileNameToWrite) throws IOException {
        try{
            FileWriter writer = new FileWriter(fileNameToWrite);
            writer.write(object.toJSONString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static JSONObject readDataFromJsonFile(String fileName) throws IOException, ParseException {
        JSONParser pimParser = new JSONParser();
        FileReader pimFile = new FileReader(fileName);
        Object obj1 = pimParser.parse(pimFile);
        JSONObject jsonObject = (JSONObject) obj1;
        return jsonObject;
    }

    public static void addKeyAndValues(JSONObject json, String key, String value){ //
//        Map<String, Object> details = new LinkedHashMap<>();

        json.put(key, value);

//        details.put(key, value);
    }


    public static void main(String[] args) throws IOException, ParseException {
        //read
        String dataFromJson = readDataFromJsonFile("src/main/java/JsonEx/jsonfiles/Newdata.json").toJSONString();
        System.out.println(dataFromJson);

        JSONObject data = new JSONObject(readDataFromJsonFile("src/main/java/JsonEx/jsonfiles/Newdata.json"));
        addKeyAndValues(data, "beyza", "test");

        System.out.println(data.toJSONString());


//        JSONObject data2 = (JSONObject) data.replace("beyza", "test1");
        data.replace("beyza", "test", "test1");
        data.replace("eventName", "mspCreated", "mspCreated1");
        System.out.println("NEW VALUE\n"+data.toJSONString());



    }
}
