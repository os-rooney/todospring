package de.ronios.ToDoApp;

import de.ronios.ToDoApp.aufgabe.Aufgabe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AufgabeRepository extends CrudRepository<Aufgabe, Long> {

    List<Aufgabe> findAll();
}
