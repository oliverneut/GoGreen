package client;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * Client application with main method.
 */
public class Application {
    /**
     * Main method.
     * @param args Provided arguments.
     */

    public static void main(String[] args) {
        String url = "http://localhost:8080/login";
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, String> parametersMap = new LinkedMultiValueMap<String, String>();
        parametersMap.add("email", "alice@gmail.com");
        parametersMap.add("password", "alicepwd");
        Login login = restTemplate.postForObject(url, parametersMap, Login.class);
        System.out.println("Welcome " + login.toString());
    }
}
