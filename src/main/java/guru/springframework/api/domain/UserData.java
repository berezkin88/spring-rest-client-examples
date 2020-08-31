package guru.springframework.api.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author Aleksandr Beryozkin
 */

@Getter
@Setter
@NoArgsConstructor
public class UserData {

    private List<User> data;
}
