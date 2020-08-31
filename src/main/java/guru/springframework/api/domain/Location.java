package guru.springframework.api.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Aleksandr Beryozkin
 */

@Setter
@Getter
@NoArgsConstructor
public class Location implements Serializable {
    private String street;
    private String city;
    private String state;
    private String postcode;
}
