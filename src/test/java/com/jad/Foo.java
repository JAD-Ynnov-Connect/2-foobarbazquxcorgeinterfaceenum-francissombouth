public class Foo implements IFoo{
    private IBaz baz;
    private List<IBar> bars = new ArrayList<>();
    private IQux qux;
    private ICorge corge;

    public Foo(IBaz baz, IQux qux, ICorge corge){
        this.baz=baz;
        this.qux=qux;
        this.corge=corge;
    }

    public void addBar(IBar bar){
        bars.add(bar);
    }
    public ICorge getCorge() {
    return corge;
    }
    
}