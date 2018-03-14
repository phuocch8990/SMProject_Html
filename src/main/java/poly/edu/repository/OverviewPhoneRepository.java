package poly.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poly.edu.entity.OverviewPhone;

@Repository
public interface OverviewPhoneRepository extends JpaRepository<OverviewPhone, String>{

}
