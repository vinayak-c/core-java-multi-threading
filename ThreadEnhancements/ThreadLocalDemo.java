package ThreadEnhancements;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //ThreadLocal<Integer> tl=new ThreadLocal<Integer>();
	  //overriding of initialValue method
		ThreadLocal tl=new ThreadLocal()
		{
			public Object initialValue()
			{
				return "default value is vinny";
			}
		};
      System.out.println(tl.get());
      tl.set(10);
      System.out.println(tl.get());
      tl.remove();
      System.out.println(tl.get());
	}

}
