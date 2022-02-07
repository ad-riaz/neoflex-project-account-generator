package ru.neoflex.accountgenerator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
public class BankAccount {
    @JsonProperty("firstName")
    @NonNull
    private String firstName;

    @JsonProperty("middleName")
    @NonNull
    private String middleName;

    @JsonProperty("lastName")
    @NonNull
    private String lastName;

    @JsonProperty("accountNumber")
    @NonNull
    private long accountNumber;

    @JsonProperty("sex")
    @NonNull
    private Sex sex;
}
