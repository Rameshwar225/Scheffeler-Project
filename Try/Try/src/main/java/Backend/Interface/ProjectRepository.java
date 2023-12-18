package Backend.Interface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Backend.Entity.Project;

import java.util.List;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
    List<Project> findByProjectName(String projectName);
}
