import Main4.Container;

class StringContainer implements Container <String>{
    
    private String item;

    @Override
    public void add(String item){
        this.item = item;
    }

    @Override
    public String get(){
        return item;
    }
}
public class Main4 {
    
}
