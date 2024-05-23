package com.ekip6.BestPriceGuarantee.service;

import com.ekip6.BestPriceGuarantee.model.Flight;
import com.ekip6.BestPriceGuarantee.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;

	public Flight saveFlight(Flight flight) {
		return flightRepository.save(flight);
	}
}
