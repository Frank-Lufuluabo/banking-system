package za.ac.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.banking.model.Transaction;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, String> {

    List<Transaction> findBySenderAccountNumberOrderByCreatedAtDesc(String accountNumber);
}
