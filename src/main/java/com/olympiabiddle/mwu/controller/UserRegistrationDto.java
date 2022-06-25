package com.olympiabiddle.mwu.controller;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/*User Registartion Data Transfer object will be
 * be to transfer the fieldsfrom the
 *  registration form to the User object */
@FieldMatch.List({
		@FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match"),
		@FieldMatch(first = "email", second = "confirmEmail", message = "The email fields must match") })
public class UserRegistrationDto {

	/* Annotation 
	 * @NotEmpty specifies field cannot be empty with custom error message
	 * @Size specifies the require length*/
	@NotEmpty(message ="Please enter your first name")
	@Size(min = 2, message="Must be at least 8 characters long")
	private String firstName;

	@NotEmpty(message ="Please enter your last name")
	@Size(min = 2, message="Must be at least 8 characters long")
	private String lastName;

	@NotEmpty(message ="Please enter a password")
	@Size(min = 8, max =20, message="Must be at least 8 characters long")
	private String password;

	@NotEmpty(message ="Please confirm password")
	@Size(min = 8, max =20, message="Must be at least 8 characters long")
	private String confirmPassword;

	@Email(message="Enter a valid email")
	@NotEmpty(message ="Please enter email")
	private String email;

	@Email(message="Enter a valid email")
	@NotEmpty(message ="Please enter email")
	private String confirmEmail;

	@AssertTrue(message="Please check to accept")
	private Boolean terms;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}

	public Boolean getTerms() {
		return terms;
	}

	public void setTerms(Boolean terms) {
		this.terms = terms;
	}
}
