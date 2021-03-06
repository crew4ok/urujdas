package ru.uruydas.news.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.uruydas.common.web.WebCommons;
import ru.uruydas.favourites.model.FavourResult;
import ru.uruydas.news.model.News;
import ru.uruydas.news.service.NewsService;

import java.util.List;

@RestController
@RequestMapping(WebCommons.VERSION_PREFIX + "/news/favourites")
public class FavouritesNewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping(method = RequestMethod.GET)
    public List<News> getLatestFavourites() {
        return newsService.getLatestFavourites(WebCommons.PAGING_COUNT);
    }

    @RequestMapping(method = RequestMethod.GET, params = "id")
    public List<News> getFavouritesFromId(@RequestParam("id") Long id) {
        return newsService.getFavouritesFromId(id, WebCommons.PAGING_COUNT);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public FavourResult favourNews(@PathVariable("id") Long id) {
        return newsService.favour(id);
    }
}
