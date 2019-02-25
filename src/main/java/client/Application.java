package client;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
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
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        String url = "http://localhost:8080/login";

        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
        map.add("email", "alice@gmail.com");
        map.add("password", "alicepwd");

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String,String>>(map, headers);

        RestTemplate restTemplate = new RestTemplate();
        Login response = restTemplate.postForObject(url, request , Login.class );
        System.out.println(response.toString());
    }

    /**
     * Sends an HTTP request to the server with str as param.
     * @param str Name to be displayed.
     */
}
