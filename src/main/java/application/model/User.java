package application.model;

/**
 * Created by Rahul Bhandwalkar on 3/3/2016.
 */



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
@Entity
@Table(name = "USER")
@ToString
public class User {

    @Id
    @NotNull(groups = {Insert.class,Update.class,Delete.class})
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;
    @NotEmpty
    @Size(max = 64)
    @Column(name = "LAST_NAME")
    private String lastName;

    public @interface  Insert{}
    public @interface Delete{}
    public @interface Update{}
}
