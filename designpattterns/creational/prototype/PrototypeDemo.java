package creational.prototype;

public class PrototypeDemo {


    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational patterns in java");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());


        Movie anothermovie = (Movie) registry.createItem("Movie");
        anothermovie.setTitle("Gang of four");

        System.out.println(anothermovie);
        System.out.println(anothermovie.getRuntime());
        System.out.println(anothermovie.getTitle());
        System.out.println(anothermovie.getUrl());



    }


}
