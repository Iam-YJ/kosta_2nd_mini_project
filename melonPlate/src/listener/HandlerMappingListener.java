package listener;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import controller.Controller;

@WebListener
public class HandlerMappingListener implements ServletContextListener {
   
    public void contextDestroyed(ServletContextEvent sce)  { }

	/**
	 * �̸� ������ ��ü�� �����ؼ� Map�� �����ϰ� 
	 * Map�� application������ �����Ѵ�.
	 * */
    public void contextInitialized(ServletContextEvent e)  { 
    	//context-param���� ��������
    	ServletContext application = e.getServletContext();
    	String fileName = application.getInitParameter("fileName");
    	
    	Map<String, Controller> map = new HashMap<String, Controller>();
    	Map<String, Class<?>> clzMap = new HashMap<String, Class<?>>(); 
    	
       //�̸� �����ؾ��ϴ� ��ü�� ���� ������ ������ �ִ�
    	//~.properties������ �ε��ϱ�
    	
    	//baseName�� Ȯ���ڴ� �����Ѵ�.
    	ResourceBundle rb = ResourceBundle.getBundle(fileName);
    	for(String key : rb.keySet()) {
    		String value = rb.getString(key);
    		//System.out.println("key: " + key + ", value: " + value);
    		
    		//String ������ value�� ��ü�� ����� 
    		try {
    			Class<?> cls = Class.forName(value);
    			Controller controller = (Controller)cls.newInstance();
    			
    			System.out.println("value: " + value);
    			System.out.println("controller: " + controller);

				map.put(key, controller); //Controller ��� 
				clzMap.put(key, cls); //�޼ҵ� ��� 
				//System.out.println(key + " = " + controller);
				System.out.println("map: " + map);
				System.out.println("clzMap: " + clzMap);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
    	}
    	
    	application.setAttribute("map", map); //scope�� ���� 
    	application.setAttribute("clzMap", clzMap); //scope�� ���� 
    	 
    	
    }//�޼ҵ峡
	
}