package com.blog.paylods;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	private int id;
	@NotEmpty
	@Size(min = 2, message = "Name must be minimum of 2 character")
	private String name;
	@Email(message = "Email is not valid")
	private String email;
	@NotEmpty
	private String password;
	@NotEmpty
	private String about;
}
