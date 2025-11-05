package TypesOfClasses;

public class SingletonClass {
    
}
//eager initialization
class EagerInitialization{
    private static EagerInitialization conObject = new EagerInitialization();

    private EagerInitialization(){
    }

    public static EagerInitialization getInstance(){
        return conObject;
    }
}

//lazy initialization

class LazyInitialization{
    private static LazyInitialization lazyObject;

    public static LazyInitialization getInstance(){
        if(lazyObject == null){
            lazyObject = new LazyInitialization();
        }
        return lazyObject;
    }
}

//synchronization block

class synchronizationBlock{
    private static synchronizationBlock syncBlock;

    synchronized public static synchronizationBlock getInstance(){
        if(syncBlock == null){
            syncBlock = new synchronizationBlock();
        }
        return syncBlock;
    }
}

//double checked lock
class DoubleCheckedLocking{
    private static DoubleCheckedLocking doubleLocking;

    public static DoubleCheckedLocking getInstance(){
        if(doubleLocking == null){
            synchronized(DoubleCheckedLocking.class){
                if(doubleLocking == null){
                    doubleLocking = new DoubleCheckedLocking();
                }
            }
        }
        return doubleLocking;
    }
}

//bill pugh solution
class BillPughSolution{
    private BillPughSolution(){
    }

    private static class InnerBillPughClass{
        private static final BillPughSolution INSTANCE_OBJECT = new BillPughSolution();
    }

    public static BillPughSolution getInstance(){
        return InnerBillPughClass.INSTANCE_OBJECT;
    }
}

//enum singleton
enum EnumSingleton{
    INSTANCE;
}