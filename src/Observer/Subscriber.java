package Observer;

public class Subscriber implements Observer {

	private String name;
	private Subject channel =new Channel();

	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see Observer.Observer#update()
	 */
	@Override
	public void update(){
	  System.out.println("Hey "+name+" Video uploaded...:-"+channel.getTitle());
	}

	  /* (non-Javadoc)
	 * @see Observer.Observer#subscribechannel(Observer.Channel)
	 */
	@Override
	public void subscribechannel(Subject ch)
	{
	   channel=ch;
	}
}
