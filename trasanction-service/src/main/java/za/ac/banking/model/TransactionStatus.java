package za.ac.banking.model;

/**
 * Transaction Lifecycle Flow:
 * PENDING -> PROCESSING -> COMPLETED (Clean transaction)
 *                       -> PENDING_VERIFICATION (Suspicious detected)
 *                                 -> COMPLETED (Verified)
 *                                 -> FLAGGED (SAGA REFUND)
 *                       -> FAILED
 *                       -> FLAGGED
 */

public enum TransactionStatus {

    PENDING,
    PROCESSING,
    PENDING_VERIFICATION,
    COMPLETED,
    FAILED,
    FLAGGED
}
