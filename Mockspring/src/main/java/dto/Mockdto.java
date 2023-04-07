package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Mockdto {
	@Id
private int id;
private String name;
private String stream;
private String mockratings;
private String sub;
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
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
public String getMockratings() {
	return mockratings;
}
public void setMockratings(String mockratings) {
	this.mockratings = mockratings;
}
public String getSub() {
	return sub;
}
public void setSub(String sub) {
	this.sub = sub;
}

}
