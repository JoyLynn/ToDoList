package moringaschool.todo;

/**
 * Created by Wakoli on 22-Aug-15.
 */
public class Task extends ParseObject {
    public Task(){

    }
    public boolean isCompleted(){
        return getBoolean("completed");
    }
    public void setCompleted(boolean complete){
        put("completed", complete);
    }
    public String getDescription(){
        return getString("description");
    }
    public void setDescription(String description){
        put("description", description);ad
    }
}
