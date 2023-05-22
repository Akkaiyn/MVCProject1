package mvcProject.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import mvcProject.entity.Agency;
import mvcProject.repository.AgencyRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;
import java.util.List;
@Repository
@Transactional
@RequiredArgsConstructor
public class AgencyRepositoryImpl implements AgencyRepository {
    @PersistenceContext
    private  EntityManager entityManager;

    @Override
    public void saveAgency(Agency agency) {
        entityManager.persist(agency);

    }

    @Override
    public List<Agency> getAllAgencies() {
        return entityManager.createQuery("select a from Agency a", Agency.class).getResultList();
    }

    @Override
    public Agency getAgencyById(Long id) {
        return null;
    }

    @Override
    public String updateAgency(Long id, Agency agency) {
        return null;
    }

    @Override
    public void deleteCompany(Long id) {
        Agency agency = entityManager.find(Agency.class, id);
        entityManager.remove(agency);

    }
}
