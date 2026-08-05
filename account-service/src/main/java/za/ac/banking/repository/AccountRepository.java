package za.ac.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.banking.model.Account;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,String> {

    boolean existsByEmail(String email);
    boolean existsByAccountNumber(String accountNumber);
    Optional<Account> findByAccountNumber(String accountNumber);
}
