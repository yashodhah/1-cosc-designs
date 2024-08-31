package dev.h.yashodha.design_playground.interactor.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BankAccount {

    @Id
    String id;
    String branchCod;
}
