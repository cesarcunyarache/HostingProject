package DataAccessObject;

import java.util.List;

public interface Crud<T> {

    public boolean Create(T t);

    public boolean Update(T t);

    public List<T> Read();

    public boolean Delete(T t);

    public T Search(T t);

}
