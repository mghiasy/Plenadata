package com.example.Plenadata;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class InputController {
    @GetMapping("/checkName")

    public void checkName(@RequestParam("inputName") String inputName) {
    }
}
