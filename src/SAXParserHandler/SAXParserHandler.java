package SAXParserHandler;

import com.imooc.entity.Book;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

/**
 * Created by lsq on 2/16/17.
 */
public class SAXParserHandler extends DefaultHandler{

    int bookIndex=0;
    String value=null;
    Book book=null;
    private ArrayList<Book> bookList=new ArrayList<Book>();

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    /*
    * 用來標釋解析開始
    * */
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("解析開始");
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("解析結束");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        if(qName.equals("book")){
            bookList.add(book);
            bookIndex++;
            book=new Book();
            System.out.println("開始遍歷第"+bookIndex+"本書");
            int num=attributes.getLength();
            for(int i=0;i<num;i++){
                System.out.println("book元素的第"+(i+1)+"個屬性名是："+attributes.getQName(i));
                System.out.println("book元素的第"+(i+1)+"個屬性值是："+attributes.getValue(i));
                if(attributes.getValue(i).equals("id")){
                    book.setId(attributes.getValue(i));
                }
            }
        }
        else if(!qName.equals("book")&& !qName.equals("bookstore")){
            System.out.println(qName);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        if(qName.equals("book")){
            book=null;
            System.out.println("結束第"+bookIndex+"本書");
            System.out.println();
        }
        else if(qName.equals("name")){
            book.setName(value);
        }
        else if(qName.equals("year")){
            book.setYear(value);
        }
        else if(qName.equals("author")){
            book.setAuthor(value);
        }
        else if(qName.equals("language")){
            book.setLanguage(value);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        value=new String(ch,start,length);
        if(!value.trim().equals("")){
            System.out.println(value);
        }
    }
}
