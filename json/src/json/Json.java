package json;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

public class Json {
	public static void demo()
	{
		//JavaBean->Json
		Person per = new Person();
		per.setName("hukelin");
		per.setAge(23);	
		Address adress = new Address("jiujiang","nanchang");
		per.setAdress(adress);
		
		JSONObject jsonBean = new JSONObject(per); 
		
		System.out.println(jsonBean);
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		String myString = new JSONObject().put("json","hello world").toString();
//		System.out.print(myString);
		Map<String,String> map = new HashMap<>();
		map.put("hu", "hello");
		map.put("ke", "world");
		map.put("lin", "go");
		JSONObject json = new JSONObject(map); 
		//Map->Json
		System.out.println(json);
		demo();
		
		//文件->字符串
//		File file = new File("L:\\Software\\Eclipse\\json\\src\\json\\per.json");
//		FileUtils.readFileToString(file);
		String s = FileUtils.readFileToString(new File("L:\\Software\\Eclipse\\json\\src\\json\\per.json"));
		JSONObject js = new JSONObject(s); 
		System.out.print(js);
//		String s = FileUtils.readFileToString(new File("L:\\Software\\Eclipse\\json\\src\\json\\per.json"));
	}
}
