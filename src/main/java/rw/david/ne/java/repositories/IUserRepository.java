package rw.david.ne.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.david.ne.java.models.User;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IUserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByEmailOrPhoneNumberOrNationalId(String email, String phoneNumber, String nationalId);

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailOrPhoneNumber(String email, String phoneNumber);


}
