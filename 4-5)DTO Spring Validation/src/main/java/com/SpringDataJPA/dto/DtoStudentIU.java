package com.SpringDataJPA.dto;

import java.util.Date;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
	@NotEmpty(message = "Firstname alanı boş olamaz !!")
	@Min(value=3)
	@Max(value=10)
	private String firstName;
	@Size(min=3,max=30)
	private String lastName;
	private Date birthOfDate;
	

}
