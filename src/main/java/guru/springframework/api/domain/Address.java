
package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address implements Serializable
{

    private String street;
    private String suite;
    
    private String city;
    private String state;
    private String zipcode;

    private Geo geo;
    
    // private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3532048267747973846L;



}
