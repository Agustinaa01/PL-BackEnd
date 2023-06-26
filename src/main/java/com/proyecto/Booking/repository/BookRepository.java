package com.proyecto.Booking.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.Booking.entities.Book;
public interface BookRepository extends JpaRepository<Book, Long> {
}
