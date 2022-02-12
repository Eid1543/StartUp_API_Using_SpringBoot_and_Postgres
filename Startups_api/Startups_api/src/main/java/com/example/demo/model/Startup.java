package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Startup {
	
	@Id
	@SequenceGenerator (
			name = "student_sequence",
			sequenceName  = "student_sequence",
			allocationSize = 1 
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
			)
	private Long id ;
	private Double researchAndDevelopment_Spend;
	private Double administration_Spend;
	private Double marketing_Spend;
	private String state; 
	private Double profit;
	
	public Startup() {
		super();
	}



	public Startup(Double researchAndDevelopment_Spend, Double administration_Spend, Double marketing_Spend,
			String state, Double profit) {
		super();
		this.researchAndDevelopment_Spend = researchAndDevelopment_Spend;
		this.administration_Spend = administration_Spend;
		this.marketing_Spend = marketing_Spend;
		this.state = state;
		this.profit = profit;
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getResearchAndDevelopment_Spend() {
		return researchAndDevelopment_Spend;
	}
	public void setResearchAndDevelopment_Spend(Double researchAndDevelopment_Spend) {
		this.researchAndDevelopment_Spend = researchAndDevelopment_Spend;
	}
	public Double getAdministration_Spend() {
		return administration_Spend;
	}
	public void setAdministration_Spend(Double administration_Spend) {
		this.administration_Spend = administration_Spend;
	}
	public Double getMarketing_Spend() {
		return marketing_Spend;
	}
	public void setMarketing_Spend(Double marketing_Spend) {
		this.marketing_Spend = marketing_Spend;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Double getProfit() {
		return profit;
	}
	public void setProfit(Double profit) {
		this.profit = profit;
	}



	@Override
	public String toString() {
		return "Startup [id=" + id + ", researchAndDevelopment_Spend=" + researchAndDevelopment_Spend
				+ ", administration_Spend=" + administration_Spend + ", marketing_Spend=" + marketing_Spend + ", state="
				+ state + ", profit=" + profit + "]";
	} 
	
	
	
	
	
	
	

}
