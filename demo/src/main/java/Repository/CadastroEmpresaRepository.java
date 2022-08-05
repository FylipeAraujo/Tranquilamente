package Repository;

import Entity.CadastroEmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroEmpresaRepository extends JpaRepository<CadastroEmpresaEntity, Integer> {
}
