package testgroup.filmography.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import testgroup.filmography.model.Film;
import testgroup.filmography.service.FilmService;
import testgroup.filmography.service.FilmServiceImpl;

import java.util.List;

@Controller
public class FilmController {
    private FilmService filmService = new FilmServiceImpl();

//    private static Film film;
//    @Override
//    public String toString() {
//        return film.getTitle() + " "+ film.getYear() + " "+ film.getGenre()+ " "+ film.isWatched();
//    }
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView allFilms() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("films");
//        return modelAndView;
//    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView allFilms() {
        List<Film> films =filmService.allFilms();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("films");
        modelAndView.addObject("filmsList", films);
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

}
