public class Gear implements IGear {

    private Type type;
    private boolean isDown, isBreakSet;
    private Wheel[] wheels;

    @Override
    public void up(){

    }

    @Override
    public void down(){

    }

    @Override
    public void setBrake(){

    }

    @Override
    public void releaseBrake(){

    }


}

enum Type{
    Front, Rear
}
