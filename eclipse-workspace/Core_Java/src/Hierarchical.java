
class Gift {

	String message="Your Precious Gift Is Ready";
	void wrap()
	{
		System.out.println("Gift is wrapped...!!");
	}
}
class BirthdayGift extends Gift
{
	void giftForBirthday()
	{
		System.out.println("Message: "+message);
		System.out.println("Birthday gift Opened..");
		System.out.println("Surprise!!! PS5");
	}
}
class AnniversaryGift extends Gift
{
	void giftForAnniversary()
	{
		System.out.println("Anniversary gift Opened..");
		System.out.println("Surprise!!! BMW M5 competition");
	}
}
class ValentinesDayGift extends Gift
{
	void giftForValentine()
	{
		System.out.println("Valentines Day gift Opened..");
		System.out.println("Surprise !!! Flowers ");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		
		ValentinesDayGift vg=new ValentinesDayGift();
		vg.wrap();
		vg.giftForValentine();
		
		
		BirthdayGift bg=new BirthdayGift();
		bg.wrap();
		bg.giftForBirthday();
		
		
		
	}
}
