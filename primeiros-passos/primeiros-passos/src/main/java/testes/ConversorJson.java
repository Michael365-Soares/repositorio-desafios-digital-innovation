package testes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Component
public class ConversorJson {
	 @Autowired
     private Gson gson;
	 @Autowired
	 private ViaCepResponse response;
     
     public ViaCepResponse converter(String json) {
    	 response=gson.fromJson(json,ViaCepResponse.class);
    	 return response;
    	 
     }
     
}
