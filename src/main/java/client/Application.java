package client;

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
        RestTemplate restTemplate = new RestTemplate();
        Login login = restTemplate.getForObject("http://localhost:8080/login?email=alice@gmail.com&password=alicepwd", Login.class);
        System.out.println("Welcome" + login.toString());
    }
}
