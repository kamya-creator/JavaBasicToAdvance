package Interfaces;


// Interface can extend other interfaces as well by comma separated
public interface NonFlyingLiving extends Bird, LivingThings {

    /*
    All variables in interface is public static final i.e they work as constant , child of interface can access them but can't change them
     */
        public static final int MAX_HEIGHT =10;
}
