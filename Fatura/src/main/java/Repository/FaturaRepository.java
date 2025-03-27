package Repository;

import Model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {
}

