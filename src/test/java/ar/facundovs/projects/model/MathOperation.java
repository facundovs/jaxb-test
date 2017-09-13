
package ar.facundovs.projects.model;


import javax.naming.spi.ObjectFactory;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import ar.facundovs.projects.factories.MathOperationFactory;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso(MathOperationFactory.class)
public class MathOperation
{
    private String value ;

    @XmlElementRef(type=JAXBElement.class, name="operator", namespace = "operator")
    private JAXBElement<? extends Operator> operator;

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public void setOperator(JAXBElement<? extends Operator> operator)
    {
        this.operator = operator;
    }

    public JAXBElement<? extends Operator> getOperator()
    {
        return operator;
    }
}
