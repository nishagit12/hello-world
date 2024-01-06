package com.nisha.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class QuotationController {

    private List<Quotation> quotations = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("quotations", quotations);
        model.addAttribute("newQuotation", new Quotation());
        return "index";
    }
    @PostMapping("/add")
    public String addQuotation(Quotation newQuotation) {
        quotations.add(newQuotation);
        return "redirect:/";
    }

    // Add more methods for handling CRUD operations (e.g., addQuotation, deleteQuotation)
}
