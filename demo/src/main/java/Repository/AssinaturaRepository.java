package Repository;


import Entity.AssinaturasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssinaturaRepository extends JpaRepository<AssinaturasEntity, Integer> {
}
