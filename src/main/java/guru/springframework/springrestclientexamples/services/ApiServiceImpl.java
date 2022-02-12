package guru.springframework.springrestclientexamples.services;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import java.util.List;

import guru.springframework.api.domain.User;

@Service
public class ApiServiceImpl implements ApiService {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/users?_limit=";

    private RestTemplate restTemplate;   

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Long limit) {
        // UserData userData = restTemplate.getForObject("http://private-anon-25adba0643-apifaketory.apiary-mock.com/api/user?limit=" + limit, UserData.class);
        // return userData.getData();
        // UserList response = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users?_limit=" + limit, UserList.class);
        // return response.getUsers();

        ResponseEntity<User[]> response = restTemplate.getForEntity( BASE_URL + limit, User[].class);

        User[] usersArray = response.getBody();

        List<User> users = Arrays.asList(usersArray);

        return users;

    }
    
}
