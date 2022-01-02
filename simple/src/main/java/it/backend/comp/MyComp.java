package it.backend.comp;

import it.backend.beans.MyBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myComp1")
public class MyComp {

    /*@Autowired*/
    private MyBean1 myBean;

    {
        if(myBean!=null)
            System.out.println("Component:"+ myBean.value());
    }

    //@Autowired
    /*public MyComp(MyBean1 myBean){
        this.myBean = myBean;
        System.out.println("Constructor-Component:"+ myBean.value());
    }*/

    @Autowired
    @Qualifier("myBean1")
    public void setMyBean(MyBean1 myBean){
        this.myBean = myBean;
        System.out.println("Component:"+ myBean.value());
    }
}
