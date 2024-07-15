package System;

import java.util.List;

public class ObjectBox<T> {

    private List<T> zlist;

    public List<T> getZlist() {
        return zlist;
    }

    public void setZlist(List<T> zlist) {
        this.zlist = zlist;
    }

    public boolean addElement(T t){
        return zlist.add(t);
    }

    public void zForEach(){
        zlist.forEach(System.out::println);
    }

    
}
