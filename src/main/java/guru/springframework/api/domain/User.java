
package guru.springframework.api.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User implements Serializable
{

    private Long id;

    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;

    private Company company;

    // private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    private final static long serialVersionUID = 270727596527329664L;

 

}
