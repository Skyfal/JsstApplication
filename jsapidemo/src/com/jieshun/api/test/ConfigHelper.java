package com.jieshun.api.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 配置文件帮助类，完成属性文件的加载及缓存
 * @author 刘淦潮
 *
 */
public class ConfigHelper {

	//缓存
	private static HashMap<String,Properties> cached=new HashMap<String,Properties>(); 
	
	/**
	 * 根据属性文件名加取配置文件内容
	 * @param fileName 属性文件名
	 * @return 返回Properties类型的属性文件
	 */
	public static Properties getProperties(String fileName){
		//如果缓存已有，即从缓存中取
		if(cached.containsKey(fileName)){
			return cached.get(fileName);
		}
		//否则，从文件系统加载及缓存起来
		Properties prop=loadProperties("config/"+fileName);
		if(prop!=null){
			cached.put(fileName, prop);
		}
		return prop;
	}
	
	/**
	 * 从文件 系统中加载指定的属性文件
	 * @param fileName
	 * @return
	 */
	private static Properties loadProperties(String fileName){
		try {
			String pattern = "\\.properties$/";
			File file=new File(fileName.matches(pattern)?fileName:fileName+".properties");
			Properties prop=new Properties();
//			prop.load(new FileInputStream(file));
			prop.load(new FileReader(file));
			return prop;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, Object> map = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		list.add(map);
		
		
		
		
		
		return null;
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
