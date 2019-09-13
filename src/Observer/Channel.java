package Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	List <Subscriber> subs=new ArrayList<>();

	private String title;
	
	/* (non-Javadoc)
	 * @see Observer.Subject#getTitle()
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/* (non-Javadoc)
	 * @see Observer.Subject#setTitle(java.lang.String)
	 */
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see Observer.Subject#subscribe(Observer.Subscriber)
	 */
	@Override
	public void subscribe(Subscriber sub){
	    subs.add(sub);
	}

	/* (non-Javadoc)
	 * @see Observer.Subject#unSubscribe(Observer.Observer)
	 */
	@Override
	public void unSubscribe(Observer sub){
	    subs.remove(sub);
	}

	/* (non-Javadoc)
	 * @see Observer.Subject#notifySubscriber()
	 */
	@Override
	public void notifySubscriber(){

	for(Observer sub:subs){
	  sub.update();
	}

	}
	   /* (non-Javadoc)
	 * @see Observer.Subject#upload(java.lang.String)
	 */
	@Override
	public void upload(String title){
	   this.title=title;
	   notifySubscriber();

	    }
}
