//package moringaschool.todo;
//
//import android.view.View;
//
///**
// * Created by Wakoli on 22-Aug-15.
// */
//public class Task extends ParseObject {
//    public Task(){
//
//    }
//    public boolean isCompleted(){
//        return getBoolean("completed");
//    }
//    public void setCompleted(boolean complete){
//        put("completed", complete);
//    }
//    public String getDescription(){
//        return getString("description");
//    }
//    public void setDescription(String description){
//        put("description", description);
//    }
//
//    public void createTask(View v){
//        if (mTaskInput.getText().length() > 0){
//            Task task = new Task();
//            task.setDescription(mTaskInput.getText().toString());
//            task.setCompleted(false);
//            task.saveEventually();
//            mTaskInput.setText("");
//        }
//    }
//}
