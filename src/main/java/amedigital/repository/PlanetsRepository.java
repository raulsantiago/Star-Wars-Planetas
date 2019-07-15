package amedigital.repository;

import amedigital.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface PlanetsRepository extends MongoRepository<Planets, String> {

    public List<Planets> findByNameLikeIgnoreCase(String name);

}
