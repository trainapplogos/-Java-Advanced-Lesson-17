package ua.lviv.trainapplogos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Column(name = "accred_level")
	private Integer levelOfAccreditation;
	
	@Column(name = "num_inst")
	private Integer numberOfInstitutes;
	
	@Column(name = "num_stud")
	private Integer numbetOfStudents;
	
	@Column
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLevelOfAccreditation() {
		return levelOfAccreditation;
	}

	public void setLevelOfAccreditation(Integer levelOfAccreditation) {
		this.levelOfAccreditation = levelOfAccreditation;
	}

	public Integer getNumberOfInstitutes() {
		return numberOfInstitutes;
	}

	public void setNumberOfInstitutes(Integer numberOfInstitutes) {
		this.numberOfInstitutes = numberOfInstitutes;
	}

	public Integer getNumbetOfStudents() {
		return numbetOfStudents;
	}

	public void setNumbetOfStudents(Integer numbetOfStudents) {
		this.numbetOfStudents = numbetOfStudents;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", levelOfAccreditation=" + levelOfAccreditation
				+ ", numberOfInstitutes=" + numberOfInstitutes + ", numbetOfStudents=" + numbetOfStudents + ", address="
				+ address + "]";
	}
}

