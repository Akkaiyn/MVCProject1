package mvcProject.service.serviceImpl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import mvcProject.entity.Agency;
import mvcProject.repository.AgencyRepository;
import mvcProject.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
@RequiredArgsConstructor

public class AgencyServiceImpl implements AgencyService {
    private final   AgencyRepository agencyRepository;



    @Override
    public void saveAgency(Agency agency) {
        agencyRepository.saveAgency(agency);

    }

    @Override
    public List<Agency> getAllAgencies() {
        return agencyRepository.getAllAgencies();
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
        agencyRepository.deleteCompany(id);

    }
}
