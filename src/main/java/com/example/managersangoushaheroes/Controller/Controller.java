package com.example.managersangoushaheroes.Controller;

import com.example.managersangoushaheroes.Entity.HeroesInfoEntity;
import com.example.managersangoushaheroes.Impl.HeroesInfoImpl;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class Controller {
    @Autowired
    private HeroesInfoImpl heroesInfoImpl;

    @GetMapping(path = "admin")
    public ModelAndView ListHero(Model model, @RequestParam("page") Optional<Integer> page) {
        Pageable pageable;
        int pageResult = page.orElse(1);
        pageable = PageRequest.of(pageResult, 40);
        Page<?> p = heroesInfoImpl.getAllInfoHero(pageable);
        int totalPage = p.getTotalPages();
        if (totalPage > 0){
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPage).boxed().collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }

//        List<HeroesInfoEntity>entityList = heroesInfoImpl.getListHeroes();
            model.addAttribute("listHeroes", p);
        return new ModelAndView("ListHeroes");
    }

    @RequestMapping(path = "download")
    private void Download(String url, String fileName, HttpServletResponse response){
        heroesInfoImpl.dowloadAllImage("https://www.sanguosha.cn/storage/uploads/images/pic/176.jpg", "D:\\test", response);
    }
}
