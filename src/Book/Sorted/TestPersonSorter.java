package Book.Sorted;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;


class SortPersons implements Comparator<Person> {
    public int compare(Person a, Person b) {
        if(a.age > b.age) {
            return 1;
        } else if(a.age == b.age) {
            return 0;
        } else {
            return -1;
        }
    }

}
class Person{
    int age;
    String name;
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}


class TestPersonSorter {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        int i = 0;
        while(i < 10) {
            int age = (int)(Math.random()*20);
            String s = "temp" + i;
            persons.add(new Person(age, s));
            i++;
        }

        Collections.sort(persons, new SortPersons());
        for(Person p: persons) {
            System.out.println("age is " + p.age + " name is  " + p.name);
        }
    }




}


