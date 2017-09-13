package ar.facundovs.projects.model;

import javax.xml.bind.annotation.XmlRootElement;

public class AddOperator extends Operator
{
    private String foo;

    public String getFoo()
    {
        return foo;
    }

    public void setFoo(String foo)
    {
        this.foo = foo;
    }

}
