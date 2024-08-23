package api.bertoti;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weestore")
@CrossOrigin(origins = "*")
public class WeedController {
    private List<Weed> weeds = new ArrayList<>();

    public WeedController(){
        weeds.addAll(List.of(
            new Weed("kunk", 52.20,  10.5),
            new Weed("Vinicius Haze", 60.00, 20.5),
            new Weed("Nadaleto", 70.00,  30.5)
        ));
    }

    @GetMapping
    public Iterable<Weed> getWeeds(){
        return weeds;
    }

    @GetMapping("/{id}")
    public Optional<Weed> getWeedById(@PathVariable int id){
        for (Weed w : weeds) {
            if(w.getId() == id){
                return Optional.of(w);
            }
        }
        return Optional.empty();
    }

    @DeleteMapping("/{id}")
    public void deleteWeed(@PathVariable int id){
        weeds.removeIf(w -> w.getId() == id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Weed> alteraWeed(@PathVariable int id, @RequestBody Weed updatedWeed) {
        for (Weed w : weeds) {
            if (w.getId() == id) {
                w.setName(updatedWeed.getName());
                w.setPrice(updatedWeed.getPrice());
                w.setThc(updatedWeed.getThc());
                return new ResponseEntity<>(w, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Weed> addWeed(@RequestBody Weed newWeed) {
        System.out.println("Adicionando nova erva: " + newWeed.toString());
        weeds.add(newWeed);
        return new ResponseEntity<>(newWeed, HttpStatus.CREATED);
    }

}