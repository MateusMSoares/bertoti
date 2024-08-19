package api.bertoti;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weed")
public class WeedController {
    private List<Weed> weeds = new ArrayList<>();

    public WeedController(){
        weeds.addAll(List.of(
            new Weed(52.20, "kunk", 10.5),
            new Weed(60.00, "Vinicius Haze", 20.5),
            new Weed(70.00, "Nadaleto", 30.5)
        ));
    }

    @GetMapping
    Iterable<Weed> getWeeds(){
        return weeds;
    }

    @GetMapping("/{id}")
    Optional<Weed> getWeedById(@PathVariable int id){
        for (Weed w : weeds) {
            if(w.getId() == id){
                return Optional.of(w);
            }
        }
        return Optional.empty();
    }

    @DeleteMapping("/{id}")
    void deleteWeed(@PathVariable int id){
        weeds.removeIf(w -> w.getId() == id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Weed> alteraWeed(@PathVariable int id, @RequestBody Weed updatedWeed) {
        for (Weed w : weeds) {
            if (w.getId() == id) {
                w.setNome(updatedWeed.getNome());
                w.setValor(updatedWeed.getValor());
                w.setThc(updatedWeed.getThc());
                return new ResponseEntity<>(w, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}


