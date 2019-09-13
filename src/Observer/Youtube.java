package Observer;

public class Youtube {

	public static void main(String[] args) {
		
		Subject channel=new  Channel();
		Subscriber s1=new Subscriber("Akshay");
		Subscriber s2=new Subscriber("Amit");
		Subscriber s3=new Subscriber("Rinky");
		Subscriber s4=new Subscriber("Suresh");
		Subscriber s5=new Subscriber("Mohan");


		channel.subscribe(s1);
		channel.subscribe(s2);
		channel.subscribe(s3);
		channel.subscribe(s4);
		channel.subscribe(s5);



		s1.subscribechannel(channel);
		s2.subscribechannel(channel);
		s3.subscribechannel(channel);
		s4.subscribechannel(channel);
		s5.subscribechannel(channel);


		channel.upload("how to learn Programing");
		
		
		System.out.println("\n ====== 1 Subscriber Unbsubscribe the channel =========\n");

		channel.unSubscribe(s3);
		
		channel.upload("New Video for Python Programming");
	}
}
