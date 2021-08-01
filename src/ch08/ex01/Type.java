package ch08.ex01;//자바파일안에 클래스를 2개이상 정의할 수 있다 (나쁜방법이라 지금까지 사용 안했음) annotation만들기 

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE) 		//소스단계까지 살아남게하겠다. (소스에는 있고 바이트코드에는 없다.) 
@Target(ElementType.TYPE) //target:위치를 정해줌  Scope을 지정. "annotation을 만들땐 위치와 범위를 정해줘야한다."
public @interface Type { //한 놈만 퍼블릭.annotation으로 쓸거여서  @를 붙여준다. 
	String name();
	int value();
	
}
@Retention(RetentionPolicy.CLASS )//여기서 class는 자바파일로 만들어진 것. 따로 리텐션 지정하지않으면 클래스가 기본값이다.
@Target(ElementType.FIELD) 	//FIELD는 멤버변수의 동의어다. -> 위치를 FIELD로 설정.
@interface Field{ 		//default임 .
	int value();
}

@Retention(RetentionPolicy.RUNTIME) 	//실행되는동안, 객체까지 살아남게하고싶다면 runtime 
@Target(ElementType.CONSTRUCTOR)		//사용위치는 생성자이다. 라고 선언 
@interface Constructor{
	int value() default 0;
}

@Target(ElementType.METHOD)
@interface Method {
	
}
//retention을 따로 적지않으면 기본값은 모두 class이다. 
@Target(ElementType.PARAMETER)
@interface Param {
	
}

@Target(ElementType.LOCAL_VARIABLE)
@interface Local{
	
}

@Target(ElementType.ANNOTATION_TYPE) 	
@interface Annotation{
	
}

@Target({ElementType.TYPE, ElementType.FIELD})//타겟을 두군데로 지정하고싶을떈 집합기호넣어서 나열.
@interface Universal{ 
	
}

