package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items= new HashMap<String, Item>();
    
    public Registry(){
        loadItems();
    }


    public Item createItem(String type){
        Item item=null;

       try{

           item=(Item)(items.get(type)).clone();

       }
       catch (CloneNotSupportedException e){
           e.printStackTrace();;

       }


        return item;
    }

    private void loadItems() {

        Movie movie =  new Movie();
        movie.setRuntime(1237);
        movie.setTitle("Basic Movie");
        movie.setPrice(24);
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberofPages(8);
        book.setTitle("Basic Movie");
        book.setPrice(24);
        items.put("Book", book);

    }

}
