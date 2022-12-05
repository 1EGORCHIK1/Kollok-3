

public class Cameras {
    
    private ICameraCrop iCameraCrop;
    private D5MarkIII d5MarkIII;
    private T8i t8i;
    private D3500 d3500;


    public Cameras(IFabricaDeCameras factory){
        this.setiCameraCrop(factory.createCameraCrop());
        this.d5MarkIII(factory.createCameraCrop());

    }

    private String d5MarkIII(ICameraCrop createCameraCrop) {
        return this.getD5MarkIII().showCameraCrop();
    }

    public String problem(){
        return this.iCameraCrop.problem();
    }


    public ICameraCrop getiCameraCrop() {
        return iCameraCrop;
    }

    public void setiCameraCrop(ICameraCrop iCameraCrop) {
        this.iCameraCrop = iCameraCrop;
    }

    public D5MarkIII getD5MarkIII() {
        return d5MarkIII;
    }

    public void setD5MarkIII(D5MarkIII d5MarkIII) {
        this.d5MarkIII = d5MarkIII;
    }

    public D3500 getD3500() {
        return d3500;
    }

    public void setD3500(D3500 d3500) {
        this.d3500 = d3500;
    }

    public T8i getT8i() {
        return t8i;
    }

    public void setT8i(T8i t8i) {
        this.t8i = t8i;
    }
    
}

 class D3500 implements ICameraCrop {
    @Override
    public String problem() {
        return "Model";
    }

    @Override
    public String showCameraCrop() {
        return "model D3500";
    }
}

 class D5MarkIII implements ICameraFullFrame{
    @Override
    public String showCameraFullFrame() {
        return "model Full Frame D5";
    }

    @Override
    public String showCameraCrop() {
        return "model";
    }
}

 class D650 implements ICameraFullFrame{
    @Override
    public String  showCameraFullFrame() {
        return "model D650";
    }

    @Override
    public String showCameraCrop() {
        return "Crop";
    }
}

 class Fabrica {
}

class FabricaCanon implements  IFabricaDeCameras{


    @Override
    public ICameraCrop createCameraCrop() {
        return new T8i();
    }
}

class FabricaNikon implements  IFabricaDeCameras{

    @Override
    public ICameraCrop createCameraCrop() {
        return new D3500();
    }
}

interface ICameraFullFrame  {

    String showCameraFullFrame();
    String showCameraCrop();
}

interface ICameraCrop {
    String problem();


    String showCameraCrop();


}

 interface IFabricaDeCameras {

    ICameraCrop createCameraCrop();

}

class T8i implements ICameraCrop{

    @Override
    public String problem() {
        return "Model";
    }

    @Override
    public String showCameraCrop() {
        return "model T8i";
    }
}


