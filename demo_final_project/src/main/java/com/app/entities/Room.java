package com.app.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="room")
@Getter
@Setter
@ToString

public class Room {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="room_id")
	private int roomId;
	@Column(length=10)
	private String roomNum;
	@Column(name="floor_num")
	@NotNull
	private int floorNum;
	@Column(name="unit_price")
	@NotNull
	private double unitPrice;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cat_id")
	@NotNull
	private RoomCategory roomCategory;
}
