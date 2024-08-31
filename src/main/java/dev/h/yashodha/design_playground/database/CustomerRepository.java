package dev.h.yashodha.design_playground.database;

import dev.h.yashodha.design_playground.interactor.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {
}
