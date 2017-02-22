package DOMTest;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by lsq on 2/15/17.
 */
public class DOMTest {
    public static void main(String args[]){
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db=dbf.newDocumentBuilder();
            Document document=db.parse("books.xml");
            NodeList bookList=document.getElementsByTagName("book");
            System.out.println("一共有"+bookList.getLength()+"本書");
            for(int i=0;i<bookList.getLength();i++){
                System.out.println("----開始遍歷第"+(i+1)+"本書----");
                Node book=bookList.item(i);
                NamedNodeMap attrs=book.getAttributes();
                System.out.println("第"+i+"本書一共有"+attrs.getLength()+"個屬性");
                for(int j=0;j<attrs.getLength();j++){
                    Node attr=attrs.item(j);
                    System.out.println("屬性名："+attr.getNodeName());
                    System.out.println("屬性值："+attr.getNodeValue());
                }
                NodeList childNode=book.getChildNodes();
                System.out.println("第"+(i+1)+"本書共有"+(childNode.getLength()-1)/2+"個子節點");
                /*Element book= (Element) bookList.item(i);
                String attrValue=book.getAttribute("id");
                System.out.println("id屬性的屬性值爲："+attrValue);*/
                System.out.println("----結束遍歷第"+(i+1)+"本書----");
                System.out.println();
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
