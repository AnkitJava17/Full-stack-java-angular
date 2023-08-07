package JavaNewFeatures.LambdaInterface;

@FunctionalInterface
public interface IChangeCase<K,V> {

    public void changeCase(K k, V v);

}
