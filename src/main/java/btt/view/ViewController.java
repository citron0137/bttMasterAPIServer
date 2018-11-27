package btt.view;

import lombok.*;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Controller
@AllArgsConstructor
public class ViewController {

    @GetMapping("/")
    public String main(Model model){
	model.addAttribute("search", new Search());
        return "main";
    }

    @PostMapping("/")
    public String mainSubmit(@ModelAttribute Search search){
	return "result";
    }

}
