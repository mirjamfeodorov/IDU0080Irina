
package ee.ttu.tud.idu0080.kuller;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2013-04-11T23:34:45.330+03:00
 * Generated source version: 2.7.4
 * 
 */
public final class Kuller_KullerSOAP_Client {

    private static final QName SERVICE_NAME = new QName("http://idu0080.tud.ttu.ee/kuller/", "kuller");

    private Kuller_KullerSOAP_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Kuller_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Kuller_Service ss = new Kuller_Service(wsdlURL, SERVICE_NAME);
        Kuller port = ss.getKullerSOAP();  
        
        {
        System.out.println("Invoking getKullerid...");
        ee.ttu.tud.idu0080.kuller.KulleridVastus _getKullerid__return = port.getKullerid();
        System.out.println("getKullerid.result=" + _getKullerid__return);


        }

        System.exit(0);
    }

}