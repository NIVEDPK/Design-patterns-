package creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {

        Website website= Websitefactory.getWebsite(WebsiteType.BLOG);
        System.out.println(website.getPages());


        Website website1= Websitefactory.getWebsite(WebsiteType.SHOP);
        System.out.println(website1.getPages());

    }
}
