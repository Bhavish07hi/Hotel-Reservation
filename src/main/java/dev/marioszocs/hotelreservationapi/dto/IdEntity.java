package dev.marioszocs.hotelreservationapi.dto;

import lombok.Data;

@Data
public class IdEntity {
    private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
