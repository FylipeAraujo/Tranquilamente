package Repository;


import Entity.UsuarioFisicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioFisicoRepository extends JpaRepository<UsuarioFisicoEntity, Integer> {
}
