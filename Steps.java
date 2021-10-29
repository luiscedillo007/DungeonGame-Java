public class Steps {
    public boolean a;
    public boolean b;
    public Steps prevStep;

    public Steps(boolean aIn, boolean bIn){
        a = aIn;
        b = bIn;
    }

    public void setPrevStep(Steps prev){
        prevStep = prev;
    }

    public boolean getA(){
        return a;
    }

    public boolean getB(){
        return b;
    }

    public Steps getPrevStep(){
        return prevStep;
    }
}
