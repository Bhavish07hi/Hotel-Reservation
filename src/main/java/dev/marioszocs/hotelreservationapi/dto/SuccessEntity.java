package dev.marioszocs.hotelreservationapi.dto;

import lombok.Data;

@Data
public class SuccessEntity {
    private boolean success;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
