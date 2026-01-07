package com.maven;
		class Vehicle{
			void start() {
				System.out.println("vechile is running");
			}
			}
		class Car extends Vehicle {
		    void fuelType() {
		        System.out.println("Car uses electricity ");
		    }
		}
		class ElectricCar extends Car {
		    void batteryStatus() {
		        System.out.println("Electric car is 55% charged ");
		    }
		}
		public class multilevel {
		    public static void main(String[] args) {
		        ElectricCar ec = new ElectricCar();
		        ec.start();          
		        ec.fuelType();       
		        ec.batteryStatus();  
		    }
		}
		


