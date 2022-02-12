package guru.springframework.api.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Company implements Serializable {

    private String name;
    private String catchPhrase;
    private String bs;

    private static final long serialVersionUID = 524440844878293194L;
    
}
