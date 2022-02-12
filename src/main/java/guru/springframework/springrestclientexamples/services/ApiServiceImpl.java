package guru.springframework.springrestclientexamples.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;

import java.util.List;

import guru.springframework.api.domain.User;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate; 
    private String api_url;  

    public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    @Override
    public List<User> getUsers(Long limit) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder
            .fromUriString(api_url)
            .queryParam("_limit", limit);

        ResponseEntity<User[]> response = restTemplate.getForEntity( uriBuilder.toUriString(), User[].class);

        User[] usersArray = response.getBody();

        List<User> users = Arrays.asList(usersArray);

        return users;

    }
    
}
