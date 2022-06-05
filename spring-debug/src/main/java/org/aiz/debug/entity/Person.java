package org.aiz.debug.entity;

/**
 * @ClassName Person
 * @Description Person实体类
 * @Author ZhangYao
 * @Date Create in 15:11 2022/5/28
 * @Version 1.0
 */
public class Person {
	private String id;
	private String name;

	public Person() {
	}

	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
