package ru.neoflex.accountgenerator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class BankAccount {
    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("middleName")
    private String middleName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("accountNumber")
    private long accountNumber;

    @JsonProperty("sex")
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
    }

    public BankAccount() {}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount that = (BankAccount) o;
        return getAccountNumber() == that.getAccountNumber() && Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getMiddleName(), that.getMiddleName()) && Objects.equals(getLastName(), that.getLastName()) && sex == that.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getMiddleName(), getLastName(), getAccountNumber(), sex);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNumber=" + accountNumber +
                ", sex=" + sex +
                '}';
    }
}
