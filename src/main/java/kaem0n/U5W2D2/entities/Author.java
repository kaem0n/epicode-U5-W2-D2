package kaem0n.U5W2D2.entities;

import lombok.*;

import java.time.LocalDate;
import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Author {
    @Setter(AccessLevel.NONE)
    private long id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthday;
    private String avatar;

    public Author(String name, String surname, String email, LocalDate birthday) {
        this.id = new Random().nextLong();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthday = birthday;
        this.avatar = "https://ui-avatars.com/api/?name=" + name + "+" + surname;
    }
}
