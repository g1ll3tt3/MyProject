package project.model.dao;

import java.util.List;

import project.model.bean.Account;
import project.model.bean.Person;

public interface IPersonDAO {
	public List<Person> getListPerson();
	public Person getPersonInforById(String id);
	public boolean checkExistPerson(String id);
	public int addPerson(Person person);
	public int deletePerson(String id);
	public int updatePerso(Person person);
	public List<Account> getListAccountOfPersonByPersonId(String id);
}
