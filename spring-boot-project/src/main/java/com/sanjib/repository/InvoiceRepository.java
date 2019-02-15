package com.sanjib.repository;

import org.springframework.data.repository.CrudRepository;

import com.sanjib.entity.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {

}
