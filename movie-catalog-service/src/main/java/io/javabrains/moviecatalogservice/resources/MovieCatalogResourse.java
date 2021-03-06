package io.javabrains.moviecatalogservice.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import io.javabrains.moviecatalogservice.models.Movie;
import io.javabrains.moviecatalogservice.models.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResourse {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

		RestTemplate restTemplate = new RestTemplate();

		// get all rated movie IDs
		List<Rating> ratings = Arrays.asList(new Rating("1234", 4), new Rating("4353", 3));

		return ratings.stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://8082/movies/" + rating.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(), "Desc", rating.getRating());

		}).collect(Collectors.toList());

		// For each movie ID, call movie info service and get details

		// Put them all together

	}

}
