package entelect.training.incubator.spring.booking.repository;

import entelect.training.incubator.spring.booking.model.Booking;
import entelect.training.incubator.spring.customer.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer> {
//    Optional<Booking> makeBooking(Integer customerId, Integer flightId);
//
//    Optional<Booking> getBookingById(Integer id);
//
  //  Optional<Booking> searchBookingByCustomer(Integer customerId);

    Optional<Booking> findBycustomerId(Integer customerId);
//
//    Optional<Booking> searchBookingByReference(Integer reference);
}
