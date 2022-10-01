package com.app.dto;
import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookingDTO {
	@JsonProperty("bookingId")
	private int bookingId;
	
	private LocalDate bookingDate;
	@NotBlank(message="Check in date should be mentioned")
	private LocalDate checkInDate;
	@NotBlank(message="Check out date should be mentioned")
	private LocalDate checkOutDate;
	@NotBlank(message="mode should be mentioned")
	private int modeOfBooking;
	@NotBlank(message="booking amount should be mentioned")
	private double bookingAmount;
	@NotBlank(message="total days should be mentioned")
	private int totalDays;
	@NotBlank(message="Total Amount should be mentioned")
	private double totalAmount;
	@NotBlank(message="status should be mentioned")
	private int status;
	
	private int customer;
}
