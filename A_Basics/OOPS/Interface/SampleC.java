package A_Basics.OOPS.Interface;

public interface SampleC extends SampleA, SampleB {

	@Override
	default void hello() {
		// TODO Auto-generated method stub
		SampleB.super.hello();
	}

	
	

}
