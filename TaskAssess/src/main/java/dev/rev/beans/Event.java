package dev.rev.beans;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Event {
	
	@Id
	@Column(updatable = false, name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "events_seq", sequenceName = "events_seq", allocationSize = 1)
	private int id;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "CONTENT")
	private String content;
	
	@Column(name = "START_TIME")
	private Timestamp start;
	
	@Column(name = "END_TIME")
	private Timestamp end; 
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "CAT_ID")
	private Category category;

	public Event(int id, String title, String content, Timestamp start, Timestamp end, User user, Category category) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.start = start;
		this.end = end;
		this.user = user;
		this.category = category;
	}

	public Event() {
		super();
	}

	public Event(String title, String content, Timestamp start, Timestamp end, User user, Category category) {
		super();
		
		this.title = title;
		this.content = content;
		this.start = start;
		this.end = end;
		this.user = user;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", content=" + content + ", start=" + start + ", end=" + end
				+ ", user=" + user + ", category=" + category + "]";
	}
	
	
	
	
}
