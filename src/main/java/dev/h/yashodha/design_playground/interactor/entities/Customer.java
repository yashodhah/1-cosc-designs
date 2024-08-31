package dev.h.yashodha.design_playground.interactor.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    private String id;
    private String firstName;
    private List<BankAccount> bankAccountList;
}
