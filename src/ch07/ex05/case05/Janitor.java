package ch07.ex05.case05;

@FunctionalInterface
public interface Janitor<T> { 	//청소를 뭐할지모르니까 generic type으로 설정한다. 
	void clean(T t); 
}
