package ru.neoflex.accountgenerator.model;

import java.util.Objects;
import java.util.UUID;

public class BankAccount {

    private final UUID uuid;
    private String firstName;
    private String middleName;
    private String lastName;
    private long accountNumber;
    private Sex sex;

    /**
     * BankAccount constructor
     * @param firstName
     * @param middleName
     * @param lastName
     * @param accountNumber
     */
    public BankAccount(String firstName, String middleName, String lastName, long accountNumber, Sex sex) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.sex = sex;
        uuid = UUID.randomUUID();
    }

    /**
     *
     * @return client's bank account uuid
     */
    public UUID getUuid() {
        return uuid;
    }

    /**
     *
     * @return client's firstname
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return client's middlename
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     *
     * @param middleName
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     *
     * @return client's lastname
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return client's fullname
     */
    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    /**
     *
     * @return client's account number
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param accountNumber
     */
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *
     * @param o
     * @return true if objects are equal, and false if they don't.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount that = (BankAccount) o;
        return getUuid() == that.getUuid() && getAccountNumber() == that.getAccountNumber() && getFirstName().equals(that.getFirstName()) && getMiddleName().equals(that.getMiddleName()) && getLastName().equals(that.getLastName());
    }

    /**
     *
     * @return BankAccount object hashcode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getUuid(), getFirstName(), getMiddleName(), getLastName(), getAccountNumber()) * 31;
    }

    /**
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "Bank account: " + firstName + " " + middleName + " " + lastName + "\nAccount number: " + accountNumber;
    }
}
