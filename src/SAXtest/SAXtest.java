package SAXtest;


import SAXParserHandler.SAXParserHandler;
import com.imooc.entity.Book;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * Created by lsq on 2/16/17.
 */
public class SAXtest {
    public static void main(String args[]){
        SAXParserFactory factory=SAXParserFactory.newInstance();
        try {
            SAXParser parser=factory.newSAXParser();
            SAXParserHandler handler=new SAXParserHandler();
                parser.parse("books.xml",handler);
            System.out.println("共有"+handler.getBookList().size()+"本書");
            for(Book book:handler.getBookList()){
                System.out.println(book.getId());
                System.out.println(book.getName());
                System.out.println(book.getYear());
                System.out.println(book.getAuthor());
                System.out.println(book.getLanguage());
                System.out.println("====finish====");
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
