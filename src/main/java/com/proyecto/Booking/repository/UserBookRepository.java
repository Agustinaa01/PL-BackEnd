package com.proyecto.Booking.repository;

import com.proyecto.Booking.entities.UserBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBookRepository extends JpaRepository<UserBook, Long> {
}
