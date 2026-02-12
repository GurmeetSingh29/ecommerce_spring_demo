package com.nagarro.ecommerceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model){
       /* String blobImageUrl =
                "https://quickecommerce01stn.blob.core.windows.net/quick-commerce-stoage-container/product-image/Passport_size_picture.png";*/
    //    String blobImageUrl =  "https://quickecommerce01stn.blob.core.windows.net/quick-commerce-stoage-container/product-image/Passport_size_picture.png?sp=r&st=2026-02-01T08:13:35Z&se=2026-02-03T16:28:35Z&spr=https&sv=2024-11-04&sr=b&sig=BzlfuJw5zIl1gxp%2BIS%2BnwGyGOwsZd1FdwJAw37tmMek%3D";

        model.addAttribute("imageUrl", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Example.jpg/320px-Example.jpg");
        return "home";
    }

}
