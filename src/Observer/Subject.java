package Observer;

public interface Subject {

	String getTitle();

	void setTitle(String title);

	void subscribe(Subscriber sub);

	void unSubscribe(Observer sub);

	void notifySubscriber();

	void upload(String title);

}