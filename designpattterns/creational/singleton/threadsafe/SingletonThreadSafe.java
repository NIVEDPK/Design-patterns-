package creational.singleton.threadsafe;

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe instance = null;   //volatile


   private  SingletonThreadSafe(){

       if(instance!=null){
           throw new RuntimeException("Use getInstance method to create"); // prevent reflection class usage
       }

    }


    public static SingletonThreadSafe getInstance(){

       if(instance ==null){
           synchronized (SingletonThreadSafe.class){
               if(instance ==null){
                   instance=new SingletonThreadSafe();
               }

           }
       }
       return instance;

    }

}
