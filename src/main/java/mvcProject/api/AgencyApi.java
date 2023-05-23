package mvcProject.api;

import lombok.RequiredArgsConstructor;
import mvcProject.entity.Agency;
import mvcProject.service.AgencyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/agencies")
@RequiredArgsConstructor
public class AgencyApi {
    private final AgencyService agencyService;
    @GetMapping
    public String getCompany(Model model){
        model.addAttribute("agencies", agencyService.getAllAgencies());
        return "mainPage";
    }
@GetMapping("/new")
    public String createAgency(Model model){
        model.addAttribute("newAgency", new Agency());
        return "newAgency";
    }
@PostMapping("/save")
    public String  saveAgency(@ModelAttribute("newAgency") Agency agency){
        agencyService.saveAgency(agency);
        return "redirect:/agencies";

    }
@DeleteMapping("/{id}/delete")
    public String deleteAgency(@PathVariable("id") Long id){
        agencyService.deleteCompany(id);
        return "redirect:/agencies";
    }
@GetMapping("/{id}/get")
    public String getAgencyById(@PathVariable("id") Long id, Model model){
      model.addAttribute("agency",  agencyService.getAgencyById(id));
        return "agencyPage";
    }
@GetMapping("/{id}/edit")

    public String update(@PathVariable("id") Long id, Model model){
        model.addAttribute("editAgency",
                agencyService.getAgencyById(id));
        return "updateAgency";


    }
@PostMapping("/updateAgency/{id}")
    public String saveUpdate(@ModelAttribute("editAgency")
                             Agency agency, @PathVariable("id") Long id){
        agencyService.updateAgency(id, agency);
        return "redirect:/agencies";


    }
}
