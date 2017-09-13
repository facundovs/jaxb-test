package ar.facundovs.projects.factories;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import ar.facundovs.projects.model.ExtendedOperator;
import ar.facundovs.projects.model.Operator;

@XmlRegistry
public class MathOperationFactory
{

    @XmlElementDecl(name="operator", namespace = "operator")
    public JAXBElement<Operator> createOperator(Operator operator) {
        return new JAXBElement<Operator>(new QName("operator"), Operator.class, operator);
    }

    @XmlElementDecl(name="operator", substitutionHeadNamespace = "operator", substitutionHeadName = "operator")
    public JAXBElement<ExtendedOperator> createExtendedOperator(ExtendedOperator operator) {
        return new JAXBElement<ExtendedOperator>(new QName("operator"), ExtendedOperator.class, operator);
    }

    //@XmlElementDecl(name="addOperator", substitutionHeadName="operator")
    //public JAXBElement<Operator> createAdd(Operator operator) {
    //    return new JAXBElement<Operator>(new QName("addOperator"), Operator.class, operator);
    //}
    //@XmlElementDecl(name="subOperator", namespace = "test", substitutionHeadName="operator")
    //public JAXBElement<Operator> createSub(Operator operator) {
    //    return new JAXBElement<Operator>(new QName("subOperator"), Operator.class, operator);
    //}

}
