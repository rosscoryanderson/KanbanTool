package com.rosscoryanderson.kanban.Services;

import com.rosscoryanderson.kanban.Repository.ProjectRepository;
import com.rosscoryanderson.kanban.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {

        // Logic

        return projectRepository.save(project);
    }
}
