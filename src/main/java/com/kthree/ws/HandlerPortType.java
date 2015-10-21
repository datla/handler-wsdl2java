
package com.kthree.ws;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1-b03-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "HandlerPortType", targetNamespace = "http://HandlerTestService.org/wsdl")
@HandlerChain(file = "HandlerPortType_handler.xml")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HandlerPortType {


    /**
     * 
     * @param action
     * @return
     *     returns com.kthree.ws.MyResultType
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public MyResultType doHandlerTest(
        @WebParam(name = "action", partName = "action")
        MyActionType action);

}
