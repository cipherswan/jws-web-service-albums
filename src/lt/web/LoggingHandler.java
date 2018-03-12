package lt.web;

import org.w3c.dom.Node;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Collections;
import java.util.Set;

public class LoggingHandler implements SOAPHandler<SOAPMessageContext> {
    @Override
    public Set<QName> getHeaders() {
        return Collections.EMPTY_SET;
    }

  //  private void log(SOAPMessageContext context) throws IOException, SOAPException, TransformerException {
    //    SOAPMessage msg = context.getMessage();


        // Now you have the XML as a String:
     //   System.out.println(sw.toString());



       // System.out.println("SOAP message: ");
        //System.out.println(sw.toString());
       // msg.writeTo(System.out);
   // }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {

       // SOAPEnvelope soapEnvelope = soapPart.getEnvelope();

      //  SOAPHeader soapHeader = soapEnvelope.getHeader();


       // SOAPBody soapBody = soapEnvelope.getBody();
        try {
            SOAPPart soapPart = context.getMessage().getSOAPPart();
            Source source = soapPart.getContent();
            Node root = ((DOMSource) source).getNode();
            Transformer transformer = null;
            try {
                transformer = TransformerFactory.newInstance().newTransformer();
            } catch (TransformerConfigurationException e) {
                e.printStackTrace();
            }
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            try {
                transformer.transform(new DOMSource(root), new StreamResult(System.out));
            } catch (TransformerException e) {
                e.printStackTrace();
            }
        } catch (SOAPException e) {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {

    }
}
