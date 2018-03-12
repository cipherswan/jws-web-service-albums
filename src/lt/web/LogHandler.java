package lt.web;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.ws.LogicalMessage;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.util.Collections;
import java.util.Set;

public class LogHandler implements LogicalHandler<LogicalMessageContext> {

    public Set<QName> getHeaders()
    {
        return Collections.emptySet();
    }

    @Override
    public boolean handleMessage(LogicalMessageContext context) {
        Boolean outboundProperty = (Boolean)
                context.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outboundProperty) {
            System.out.println("\nOutbound message:");
        } else {
            System.out.println("\nInbound message:");
        }

        System.out.println("** Response: " + context.getMessage().toString());
        return true;
    }

    @Override
    public boolean handleFault(LogicalMessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {

    }
}
