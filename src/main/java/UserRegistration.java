//Create a program which will take input from users for registration and save the info to a json file. The system will require following user info:
//Full Name, email, password, address, mobile no.

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) throws IOException, ParseException {
        String fileName="./src/main/resources/user.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONObject userObj = new JSONObject();
        Scanner input = new Scanner(System.in);


        System.out.print("Enter Full Name: ");
        userObj.put("Full Name", input.nextLine());

        System.out.print("Enter Email: ");
        userObj.put("Email", input.nextLine());

        System.out.print("Enter Password: ");
        userObj.put("Password", input.nextLine());

        System.out.print("Enter Address: ");
        userObj.put("Address", input.nextLine());

        System.out.print("Enter Mobile No: ");
        userObj.put("Mobile No", input.nextLine());
        JSONArray jsonArray = (JSONArray) obj;
        jsonArray.add(userObj);
        System.out.print(jsonArray);
        FileWriter file = new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();
        System.out.println("Saved!");




    }
}
