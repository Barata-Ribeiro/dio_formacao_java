import com.barataribeiro.gof.singleton.SingletonEager;
import com.barataribeiro.gof.singleton.SingletonLazy;
import com.barataribeiro.gof.singleton.SingletonLazyHolder;

public class App {
    public static void main(String[] args) throws Exception {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println();

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        System.out.println();

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
    }
}
