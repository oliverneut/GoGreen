package client;

import objects.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Client application with main method.
 */
public class Application {
    static String eMail;
    /**
     * Main method.
     * @param args Provided arguments.
     */
    public static void main(String[] args) {
        System.out.println("Welcome " + loginToServer("alice@gmail.com","alicepwd").toString());
    }

    /**
     * Sends an HTTP request to the server with str as param.
     * @param email Email of the login
     * @param password Password of the login
     */
    public static LoginResponse loginToServer(String email, String password) {
        final String baseUrl = "http://localhost:" + 8080 + "/login/";
        URI uri = null;
        try {
            uri = new URI(baseUrl);
        } catch (URISyntaxException e) {
            System.err.println(e);
        }
        String newEmail = email.toLowerCase();
        LoginRequest loginReq = new LoginRequest();
        loginReq.setEmail(newEmail);
        loginReq.setPassword(password);
        System.out.println("oke");
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<LoginRequest> request = new HttpEntity<>(loginReq, headers);
        RestTemplate restTemplate = new RestTemplate();
        LoginResponse login = restTemplate.postForObject(uri, request, LoginResponse.class);
        eMail = newEmail;
        return login;
    }

    /**
     * Creates an account on the database.
     * @param email Email of user.
     * @param name Name of user.
     * @param password Password of user.
     * @param confirm Confirmation of password.
     * @return Returns the response of the server.
     */
    public static RegisterResponse createAccount(String email,String name ,String password, String confirm) {
        final String baseUrl = "http://localhost:" + 8080 + "/register/";
        URI uri = null;
        try {
            uri = new URI(baseUrl);
        } catch (URISyntaxException e) {
            System.err.println(e);
        }
        RegisterResponse response = new RegisterResponse();
        if (password.equals(confirm) == false) {
            response.setName("Failed to create account: Password and confirmation does not match");
            response.setRegisterSuccess(false);
            return response;
        }
        String newEmail = email.toLowerCase();
        RegisterRequest registerReq = new RegisterRequest();
        registerReq.setEmail(newEmail);
        registerReq.setName(name);
        registerReq.setPassword(password);

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<RegisterRequest> req = new HttpEntity<>(registerReq, headers);
        RestTemplate restTemplate = new RestTemplate();
        RegisterResponse responseMessage = restTemplate.postForObject(uri, req, RegisterResponse.class);
        if (responseMessage.registerSuccess == false) {
            response.setName("Failed to create account");
            response.setRegisterSuccess(false);
            return response;
        } else {
            response.setName("Account " + responseMessage.getName() + " created");
            response.setRegisterSuccess(true);
            return response;
        }
    }

    public static void addVegMeal(int amount){
        final String baseUrl = "http://localhost:" + 8080 + "/addvegmeal/";
        URI uri = null;
        try {
            uri = new URI(baseUrl);
        } catch (URISyntaxException e) {
            System.err.println(e);
        }

        VegetarianMealRequest vegReq = new VegetarianMealRequest();
        vegReq.setAmount(amount);
        vegReq.setEmail(eMail);

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<VegetarianMealRequest> req = new HttpEntity<>(vegReq, headers);
        RestTemplate restTemplate = new RestTemplate();
        VegetarianMealResponse response = restTemplate.postForObject(uri, req, VegetarianMealResponse.class);

        if(response.isAddVegetarianMealSuccess()){
            System.out.println("Succesfully added veg meal to db");
        }
    }

}
