import java.io.IOException;

/**
 * Created by Tivadar Bocz on 2017.05.23..
 */
public class Main {
    public static void main(String[] args) throws IOException {

        /**
         * XML
         *//*
        STAXParser staxParser = new STAXParser();
        List<Item> items = staxParser.readConfig("C:\\Users\\Admin\\workspace\\lanoga\\helixlab_education\\src\\main\\java\\week11\\xml\\config.xml");

        StaxWriter configFile = new StaxWriter();
        configFile.setFile("C:\\Users\\Admin\\workspace\\lanoga\\helixlab_education\\src\\main\\java\\week11\\xml\\config2.xml");
        try {
            //configFile.saveConfig();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(Item i : items){
            System.out.println(i.toString());
        }*/
/**
 * JSON
 */
        /*
        //read json file data to String
        byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\Admin\\workspace\\github\\helixlab\\src\\main\\java\\tivadarbocz\\week11\\json\\employee.json"));

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //convert json string to object
        Employee emp = objectMapper.readValue(jsonData, Employee.class)
        System.out.println(objectMapper.writeValueAsString(emp));*/
    }
}
