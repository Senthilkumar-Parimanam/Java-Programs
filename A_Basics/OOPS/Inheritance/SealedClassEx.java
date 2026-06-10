package A_Basics.OOPS.Inheritance;

import java.io.Serializable;

public sealed class SealedClassEx extends Thread implements Serializable, Cloneable permits PermitedClassA {
}
