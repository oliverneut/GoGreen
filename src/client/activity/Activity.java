package activity;

import java.net.*;
import java.io.*;
import com.google.gson.*;


/**
 * Implements a single activity that users can put in to have their carbon footprint calculated
 * @author Rauf
 * @version 0.0
 * @unfinished
 */

abstract public class Activity {

    /** formats the activity object into a string that can be parsed to the Cool Climate API */
    abstract public String requestFormatter();

    /** takes formatted string and returns data representing the carbon footprint of the activity */
    // still needs editing
    public static String coolClimateRequester(String requestString) {

        // will be replaced 'requestString' variable which is
        // a URL that each Activity subclass will (partially) uniquely generate
        String dummyURL = "http://dummy.restapiexample.com/api/v1/employee/16264";

        try {
            // make connection
            URL url = new URL(dummyURL);
            URLConnection request = url.openConnection();
            request.connect();

            // converts it to a JSON object to print data
            JsonParser jp = new JsonParser();

            // convert the input stream to a json element for easier data access
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject rootobj = root.getAsJsonObject();

            // will be replaced to work with JSON object from Cool Climate
            String dummyVariable = rootobj.get("employee_age").getAsString();

            return dummyVariable;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }

    }
    public static void main(String args[]) {
        System.out.println(coolClimateRequester("yada")); ;
    }
}

