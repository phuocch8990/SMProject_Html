package poly.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.edu.entity.InvoiceDetail;

public interface InvoiceDetailsRepository extends JpaRepository<InvoiceDetail, Long>{

}
