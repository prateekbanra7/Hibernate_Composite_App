package in.abc.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ProgrammerProjectinfo {

	@EmbeddedId
	private ProjectInfo info;

	@Column(name = "pname", length = 20)
	private String programmerName;
	
	@Column(name = "depNo")
	private Integer deptNo;
	
	@Column(name = "projName",length = 20)
	private String projectName;

	public ProgrammerProjectinfo() {
		
	}

	public ProgrammerProjectinfo(ProjectInfo info, String programmerName, Integer deptNo, String projectName) {

		this.info = info;
		this.programmerName = programmerName;
		this.deptNo = deptNo;
		this.projectName = projectName;
	}



	@Override
	public String toString() {
		return "ProgrammerProjectinfo [programmerName=" + programmerName + ", deptNo=" + deptNo + ", projectName="
				+ projectName + "]";
	}

}
