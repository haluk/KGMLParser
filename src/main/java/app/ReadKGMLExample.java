package app;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import schema.Entry;
import schema.Pathway;
import schema.Relation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by hd on 8/14/15.
 */
public class ReadKGMLExample {
    private static final Logger LOGGER = Logger.getLogger(ReadKGMLExample.class.getName());

    public static void main(String[] args) {
        try {
            // XML UnMarshalling
            JAXBContext jaxbContext = JAXBContext.newInstance("schema");
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            SAXParserFactory spf = SAXParserFactory.newInstance();

            spf.setXIncludeAware(true);
            spf.setNamespaceAware(true);
            spf.setValidating(true);

            XMLReader xr = (XMLReader) spf.newSAXParser().getXMLReader();

            // URL of KEGG Pathway
            URL url = new URL("http://rest.kegg.jp/get/hsa05130/kgml");
            SAXSource source = new SAXSource(xr, new InputSource(url.openStream()));

            // Reads XML
            Pathway pathway = (Pathway) unmarshaller.unmarshal(source);

            LOGGER.info("Information about the pathway: " + pathway.getName());
            LOGGER.info("Number: " + pathway.getNumber());
            LOGGER.info("Title: " + pathway.getTitle());
            LOGGER.info("Organism: " + pathway.getOrg());
            LOGGER.info("Number of entries: " + pathway.getEntry().size());
            LOGGER.info("Number of relations: " + pathway.getRelation().size());

            HashMap<String, String> entries = new LinkedHashMap();
            for(Entry entry : pathway.getEntry())
                entries.put(entry.getId(), entry.getName());

            List<Relation> relations = pathway.getRelation();
            for(Relation relation : relations) {
                LOGGER.info("Relation: " + entries.get(relation.getEntry1()) + "->" + entries.get(relation.getEntry2())
                        + "\tType: " + relation.getType());
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
