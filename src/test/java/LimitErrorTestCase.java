import static org.junit.Assert.fail;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.util.ValidationEventCollector;

import ar.facundovs.projects.factories.MathOperationFactory;
import ar.facundovs.projects.model.ExtendedOperator;
import ar.facundovs.projects.model.MathOperation;
import ar.facundovs.projects.model.Operator;
import org.junit.Test;


public class LimitErrorTestCase
{

    private static final int NUMBER_OF_ERRORS = 11;

    @Test
    public void testUnmarshall()
    {
        Unmarshaller unmarshaller = null;
        ValidationEventCollector validationCollector = new JAXB2ValidationEventCollector();

        try
        {
            unmarshaller = JAXBContext.newInstance(MathOperation.class, Operator.class, ExtendedOperator.class, MathOperationFactory.class).createUnmarshaller();
            unmarshaller.setEventHandler(validationCollector);
        }
        catch (JAXBException e )
        {
            fail("error in initialisation");
        }

        for (int i = 0; i < NUMBER_OF_ERRORS; i ++)
        {
            try
            {
                unmarshaller.unmarshal(new File("src/test/resources/test.xml"));
            }
            catch (JAXBException e)
            {
                e.printStackTrace();
            }
        }
    }


    private class JAXB2ValidationEventCollector extends ValidationEventCollector {
        @Override
        public boolean handleEvent(ValidationEvent event) {
            super.handleEvent(event);
            return false;
        }
    }

}
