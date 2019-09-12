package fr.formation.inti.beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import fr.formation.inti.service.StudentService;


@ManagedBean
@ApplicationScoped
public class ManagerStudent extends StudentService{

}
