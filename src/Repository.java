import java.util.HashMap;
import java.util.Map;

public class Repository <T> {
    private Map<Integer, T> objects = new HashMap<Integer, T>();

    public int generateId() {
        Map.Entry<Integer, T> lastEntry = null;

        for (Map.Entry<Integer, T> entry : objects.entrySet()) {
            lastEntry = entry;
        }

        if (lastEntry == null)
            return 1;
        return lastEntry.getKey() + 1;
    }

    public void add(T obj){
        int id = generateId();
        objects.put(id, obj);
    }

    public T get(int id){
        return objects.get(id);
    }

    public void delete(int id){
        objects.remove(id);
    }

    public void update(int id, T obj){
        objects.put(id, obj);
    }

    public Map<Integer, T> getAll(){
        return objects;
    }
}
