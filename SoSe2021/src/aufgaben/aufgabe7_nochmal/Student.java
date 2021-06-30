package aufgaben.aufgabe7_nochmal;


public class Student implements Listener {
	
	private String name;
	private Publisher publisher;
	
	public Student(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		String msg = publisher.getUpdate(this);
		System.out.println(this.name + " received " + msg);
	}

	@Override
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
		publisher.register(this);
		System.out.println(this.name + " registered!");
	}

	@Override
	public void removePublisher(Publisher publisher) {
		publisher.unregister(this);
		System.out.println(this.name + " deregistered");	
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o == this) return true;
		if(this.getClass()!=o.getClass()) return false;
		
		Student student = (Student) o;
		return (this.name == student.name);
	}

}
