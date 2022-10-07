package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

            //  @NotNull --> Field shouldn't be null
            //  @NotEmpty -->   Field shouldn't be ""
            //  @NotBlank -->   Field shouldn't be "   "

    //  @NotNull --> @NotNull
    //  @NotEmpty -->   @NotEmpty+@NotNull
    //  @NotBlank -->   @NotBlank+@NotEmpty+@NotNull

    @NotBlank
    private String firstName;
    private String lastName;

    //Thymeleaf accept yyyy-MM-dd but LocalDate accepts mm-dd-yy
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
