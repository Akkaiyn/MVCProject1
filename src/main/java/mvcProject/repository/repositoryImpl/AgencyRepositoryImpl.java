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

        return entityManager.find(Agency.class, id);
    }

    @Override
    public String updateAgency(Long id, Agency agency) {
        Agency agency1 = entityManager.find(Agency.class, id);
        agency1.setAgencyName(agency.getAgencyName());
        agency1.setCustomers(agency.getCustomers());
        agency1.setHouses(agency.getHouses());
        agency1.setEmail(agency.getEmail());
        agency1.setImage(agency.getImage());
        agency1.setCountry(agency.getCountry());
        agency1.setPhoneNumber(agency.getPhoneNumber());
        entityManager.merge(agency1);



        return null;
    }

    @Override
    public void deleteCompany(Long id) {
        Agency agency = entityManager.find(Agency.class, id);
        entityManager.remove(agency);

    }
}
