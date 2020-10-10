package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

/**
 * CRUD operation for specimens
 * @author Administrator
 *
 */
public interface ISpeimenService {
	/**
	 * Get specimens from persistance layer 
	 * @param id a unique lookup
	 *@return a specimen with a matching id
	 */
	SpecimenDTO fetchById(int id);

	/**
	 * persist the given DTO 
	 * @param specimenDTO
	 *
	 */
	
	void save(SpecimenDTO specimenDTO);

}