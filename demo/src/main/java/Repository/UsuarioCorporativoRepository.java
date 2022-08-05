package Repository;


import Entity.UsuarioCorporativoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioCorporativoRepository extends JpaRepository<UsuarioCorporativoEntity, Integer> {

}
