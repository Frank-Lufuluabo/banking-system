package za.ac.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.banking.model.Account;

public interface AccountRepository extends JpaRepository<Account,String> {
}
