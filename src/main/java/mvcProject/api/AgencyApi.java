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

}
