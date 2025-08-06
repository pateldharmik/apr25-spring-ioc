package org.example.apr25springioc.utility;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Component
public class AppUtils {

	@Value("#{'${color}'.concat(' & Yellow')}")
	String color;
	@Value("${shape}")
	String shape;
	@Value("#{'${userNameABC}'.substring(6)}")
	String userNameABC;


	public boolean checkEven(int x){
		return x%2==0;
	}

	public boolean checkOdd(int x){
		return x%2!=0;
	}

	public boolean validateNumber(int x){
		return x%3==0;
	}

}
