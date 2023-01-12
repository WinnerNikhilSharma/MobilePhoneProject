package com.example.Accio.Module.Test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Consumer, String> {

    Consumer findByPhoneNumber(String number);
}
