import com.barataribeiro.gof.singleton.SingletonEager;
import com.barataribeiro.gof.singleton.SingletonLazy;
import com.barataribeiro.gof.singleton.SingletonLazyHolder;
import com.barataribeiro.gof.strategy.Comportamento;
import com.barataribeiro.gof.strategy.ComportamentoAgressivo;
import com.barataribeiro.gof.strategy.ComportamentoDefensivo;
import com.barataribeiro.gof.strategy.ComportamentoNormal;
import com.barataribeiro.gof.strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {

        // Singleton

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

        System.out.println();

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
