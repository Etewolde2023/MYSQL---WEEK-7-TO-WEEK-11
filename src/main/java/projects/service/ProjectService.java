package projects.service;

import projects.entity.Project;
import java.util.List;
import java.util.NoSuchElementException;


import projects.dao.ProjectDao;

public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();

	public Project addProject(Project project) {
		
		return projectDao.insertProject(project);
	}

	public List<Project> fetchAllProjects() {		
		
		return projectDao.fetchAllProjects();
	}

	public Project fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectById(projectId).orElseThrow(() -> new NoSuchElementException(
				"Project with project ID=" + projectId + " does not exist."));				
				
	}

}
