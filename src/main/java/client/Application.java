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
        System.out.println("Welcome " + loginToServer("alice@gmail.com","alicepwd").toString());
    }

    public static Login loginToServer(String email, String password) {
        String apiEndpointUrl = "http://localhost:8080/login";
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, String> parametersMap = new LinkedMultiValueMap<String, String>();
        parametersMap.add("email", email);
        parametersMap.add("password", password);
        Login login = restTemplate.postForObject(apiEndpointUrl, parametersMap, Login.class);
        return login;
    }
}
