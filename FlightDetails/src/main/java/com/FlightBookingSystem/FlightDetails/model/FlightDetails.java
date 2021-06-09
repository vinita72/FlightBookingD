package com.FlightBookingSystem.FlightDetails.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
// @Document(collection="Flight")
public class FlightDetails{
	@Id
	private int id;
	private String from_location;
	private String to_location;
	private int total_seats;
	private double price;
	
	// private Date date;
	
		
	public FlightDetails(int id, String from_location, String to_location, int total_seats, double price) {
		super();
		this.id = id;
		this.from_location = from_location;
		this.to_location = to_location;
		this.total_seats = total_seats;
		this.price = price;
	}


	public FlightDetails(String emailId, String firstName, String paymentStatus) {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom_location() {
		return from_location;
	}
	public void setFrom_location(String from_location) {
		this.from_location = from_location;
	}
	public String getTo_location() {
		return to_location;
	}
	public void setTo_location(String to_location) {
		this.to_location = to_location;
	}
	public int getTotal_seats() {
		return total_seats;
	}
	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	/*
	 * @Override public int size() { // TODO Auto-generated method stub return 0; }
	 * 
	 * 
	 * @Override public boolean isEmpty() { // TODO Auto-generated method stub
	 * return false; }
	 * 
	 * 
	 * @Override public boolean contains(Object o) { // TODO Auto-generated method
	 * stub return false; }
	 * 
	 * 
	 * @Override public Iterator<FlightDetails> iterator() { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * 
	 * @Override public Object[] toArray() { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * 
	 * @Override public <T> T[] toArray(T[] a) { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * 
	 * @Override public boolean add(FlightDetails e) { // TODO Auto-generated method
	 * stub return false; }
	 * 
	 * 
	 * @Override public boolean remove(Object o) { // TODO Auto-generated method
	 * stub return false; }
	 * 
	 * 
	 * @Override public boolean containsAll(Collection<?> c) { // TODO
	 * Auto-generated method stub return false; }
	 * 
	 * 
	 * @Override public boolean addAll(Collection<? extends FlightDetails> c) { //
	 * TODO Auto-generated method stub return false; }
	 * 
	 * 
	 * @Override public boolean addAll(int index, Collection<? extends
	 * FlightDetails> c) { // TODO Auto-generated method stub return false; }
	 * 
	 * 
	 * @Override public boolean removeAll(Collection<?> c) { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * 
	 * @Override public boolean retainAll(Collection<?> c) { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * 
	 * @Override public void clear() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * 
	 * @Override public FlightDetails get(int index) { // TODO Auto-generated method
	 * stub return null; }
	 * 
	 * 
	 * @Override public FlightDetails set(int index, FlightDetails element) { //
	 * TODO Auto-generated method stub return null; }
	 * 
	 * 
	 * @Override public void add(int index, FlightDetails element) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 * 
	 * @Override public FlightDetails remove(int index) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * 
	 * @Override public int indexOf(Object o) { // TODO Auto-generated method stub
	 * return 0; }
	 * 
	 * 
	 * @Override public int lastIndexOf(Object o) { // TODO Auto-generated method
	 * stub return 0; }
	 * 
	 * 
	 * @Override public ListIterator<FlightDetails> listIterator() { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * 
	 * @Override public ListIterator<FlightDetails> listIterator(int index) { //
	 * TODO Auto-generated method stub return null; }
	 * 
	 * 
	 * @Override public List<FlightDetails> subList(int fromIndex, int toIndex) { //
	 * TODO Auto-generated method stub return null; }
	 */
	
	
	
}
