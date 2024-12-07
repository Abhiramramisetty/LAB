package com.klef.jfsd.exam;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
//Table per Class Strategy
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		@Column(name="vname")
		private String name;
		@Column(name="vtype")
		private String type;
		@Column(name="vspeed")
		private int speed;
		@Column(name="vcolor")
		private String color;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}

}
