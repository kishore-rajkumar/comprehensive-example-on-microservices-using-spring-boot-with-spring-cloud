/**
 * @author SIRAJ CHAUDHARY
 * 
 * https://github.com/SirajChaudhary
 * 
 * https://www.linkedin.com/in/sirajchaudhary/
 */

package com.airport.checking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.airport.checking.entity.CheckingEntity;

@Repository
public interface CheckingRepository extends JpaRepository<CheckingEntity, Long> {

	@Query("SELECT c FROM CheckingEntity c WHERE c.bookingId = ?1")
	Optional<CheckingEntity> findByBookingId(Long bookingId);
}