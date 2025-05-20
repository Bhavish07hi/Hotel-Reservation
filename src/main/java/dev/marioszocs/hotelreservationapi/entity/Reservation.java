package dev.marioszocs.hotelreservationapi.entity;

import lombok.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;



@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reservation")
public class Reservation extends AuditableEntity {

    private static final long serialVersionUID = 1L;

	@Column(name = "hotel_id", nullable = false)
    private Integer hotelId;

    @Column(name = "check_in", nullable = false)
    private String checkIn;

    @Column(name = "check_out", nullable = false)
    private String checkOut;

    @Min(1)
    @Max(8)
    @Column(nullable = false)
    private Integer guests;

    @Column
    private boolean status;

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public Integer getGuests() {
		return guests;
	}

	public void setGuests(Integer guests) {
		this.guests = guests;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	

}
