package com.sanjib.service;

import com.sanjib.dto.AddressDTO;

public interface AddressIfc {

	void createAddress(AddressDTO addressDTO) throws Exception;
}
