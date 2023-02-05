/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Andrija - PC
 */
public class MySession {
    private static MySession instance;
    private Map<String,Object> data;

    private MySession() {
    data = new HashMap<>();
    }
    
    public static MySession getInstance(){
        if(instance == null) instance = new MySession();
        
        return instance;
    }
    
    public Object getValue(String key){
        if(data.containsKey(key)) return data.get(key);
        
        return null;
    }
    
    public void addValue(String key, Object value){
        data.put(key, value);
    }
}
