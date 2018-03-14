package poly.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import poly.edu.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
//
//	@Query("select * from Product p join OverviewPhone ovp ON p.overviewPhones = ovp.id")
//	public List<Product> findAllProduct();
}
