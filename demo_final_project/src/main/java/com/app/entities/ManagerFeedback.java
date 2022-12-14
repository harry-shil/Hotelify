package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="manager_feedback")
@Setter
@Getter
@ToString
public class ManagerFeedback extends EmployeeFeedback {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="manager_id")
	@NotNull
	private Manager manager;
}
