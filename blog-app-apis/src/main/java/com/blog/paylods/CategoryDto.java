package com.blog.paylods;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {
	private Integer categoryId;
	@NotBlank(message = "Title shouls not be blank")
	private String categoryTitle;
	@NotBlank(message = "Description should not be blank")
	private String categoryDescription;
}
