package GroupId.ArtifactId;

import com.google.gson.Gson;

class Persion{
	Persion(){}
	Persion(String name,int age){
		this.name = name;
		this.age = age;
	}
	String name;
	int age;
}

/**
 * Json!
 *
 */
public class App 
{	
	private static Gson gson = new Gson();
    public static void main( String[] args )
    {
    	Persion persion = new Persion("WgCo",29);
    	String personToJson = gson.toJson(persion);
        System.out.println( personToJson );
    }
}
