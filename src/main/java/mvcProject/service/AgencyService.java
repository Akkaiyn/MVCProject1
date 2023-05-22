package mvcProject.service;

import mvcProject.entity.Agency;

import java.util.List;

public interface AgencyService {
    void saveAgency(Agency agency);

    List<Agency> getAllAgencies();

    Agency getAgencyById(Long id);

    String updateAgency(Long id, Agency agency);

    void deleteCompany(Long id);
}
