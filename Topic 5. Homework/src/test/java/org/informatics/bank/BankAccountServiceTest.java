package org.informatics.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountServiceTest {
    private BankAccountService bankAccountService;
    private BigDecimal initialBalance;

    @BeforeEach
    void setUp() {
        BankAccount bankAccount1 = new BankAccount("BG63UBBS88883192808001", BigDecimal.valueOf(5000.00));
        bankAccountService = new BankAccountService(bankAccount1);
        initialBalance = bankAccountService.getBankAccount().getBalance();
    }

    @Test
    void whenEnoughFundsInBankAccount_thenReturnTrue() {
        BigDecimal amount = bankAccountService.withdraw(BigDecimal.valueOf(500.00));

        // Тегленето е успешно, ако балансът е намалял
        assertTrue(amount.compareTo(initialBalance) < 0);
    }

    @Test
    void whenNotEnoughFundsInBankAccount_thenReturnFalse() {
        BigDecimal amount = bankAccountService.withdraw(BigDecimal.valueOf(5800.00));

        // Тегленето е неуспешно, ако балансът остане същият
        assertEquals(initialBalance, amount);
    }

    @Test
    void whenNegativeAmountOfMoneyInBankAccount_thenReturnFalse() {
        // Опитваме се да зададем отрицателен баланс
        bankAccountService.getBankAccount().setBalance(new BigDecimal("-500"));

        // Взимаме текущия баланс след опита за промяна
        BigDecimal currentBalance = bankAccountService.getBankAccount().getBalance();

        // Проверяваме дали балансът не се е променил
        assertEquals(initialBalance, currentBalance);
    }

    @Test
    void whenAmountOfInterestIsNegative_thenReturnZero() {
        BigDecimal interestRate = bankAccountService.accumulateInterest(BigDecimal.valueOf(-5));

        // Очаква се 0, защото лихвата е отрицателна
        assertEquals(BigDecimal.ZERO, interestRate);

        // Балансът не трябва да се променя
        assertEquals(BigDecimal.valueOf(5000.00), bankAccountService.getBankAccount().getBalance());
    }

    @Test
    void whenInterestIsBetween0And100_thenReturnTrue() {
        BigDecimal interestRate = BigDecimal.valueOf(20);

        // Проверка, че натрупаната лихва е по-голяма от 0 и по-малка от 100
        assertTrue(interestRate.compareTo(BigDecimal.ZERO) > 0
                && interestRate.compareTo(BigDecimal.valueOf(100)) <= 0);
        BigDecimal accumulatedInterest = bankAccountService.accumulateInterest(interestRate);

        // Проверка, че балансът е нараснал с натрупаната лихва
        assertEquals(initialBalance.add(accumulatedInterest), bankAccountService.getBankAccount().getBalance());
    }

    @Test
    void whenInterestAmountIsBiggerThan100_thenReturnOne() {
        BigDecimal interestRate = bankAccountService.accumulateInterest(BigDecimal.valueOf(150));

        // Очаква се да върне 0, защото 150% е над позволения лимит
        assertEquals(BigDecimal.ZERO, interestRate);

        // Балансът не трябва да се променя
        assertEquals(BigDecimal.valueOf(5000.00), bankAccountService.getBankAccount().getBalance());
    }
}