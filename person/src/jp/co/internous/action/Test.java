package jp.co.internous.action;

public class Test {

	public static void main(String[]args){
		Person taro=new Person();
		Person jiro=new Person();
		Person hanako=new Person();
		Person yuki=new Person();
		Robot aibo=new Robot();
		Robot asimo=new Robot();
		Robot pepper=new Robot();
		
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="0902345678";
		taro.address="tokyo";
		
		
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="0902345678";
		jiro.address="tokyo";
		
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="0902345678";
		hanako.address="tokyo";
		
		yuki.name="吉田勇樹";
		yuki.age=29;
		yuki.phoneNumber="0902345678";
		yuki.address="tokyo";
		
		aibo.name="aibo";
		
		asimo.name="asimo";
		
		pepper.name="pepper";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		System.out.println(yuki.name);
		System.out.println(yuki.age);
		System.out.println(yuki.phoneNumber);
		System.out.println(yuki.address);
		
		
		taro.talk();
		taro.walk();
		taro.run();
		
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		pepper.talk();
		pepper.walk();
		pepper.run();
		
	}
	
	}
