package backendtech;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController{
        @GetMapping("/greeting")
        public List<CityEntry> greeting() {
                CityEntry city = new CityEntry("Berlin",52.5162, 13.3777, false);
                CityEntry city1 = new CityEntry("Paris",2.3522, 48.8566, false);
                CityEntry city2 = new CityEntry("Madrid",-3.6919, 40.4189, false);
                return List.of(city,city1,city2);

        }

}