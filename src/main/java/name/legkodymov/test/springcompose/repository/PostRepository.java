package name.legkodymov.test.springcompose.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import name.legkodymov.test.springcompose.model.Post;

public interface PostRepository extends ListCrudRepository<Post, Long> {
    
}