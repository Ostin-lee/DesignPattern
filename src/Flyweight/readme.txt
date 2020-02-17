1. Flyweight ������..

Flyweight �� ������ ���� �����ؼ� ��ü ������ �ٿ� ������ ����� ���Դϴ�. Ŭ���� ���� factory�� ���ϴ�. �׸��� �� factory������ �ڽ��� ���� ��ü���� �����մϴ�. �̹� ������ �ִ� ��ü�� ���� ��û�� ������ ���� �����ϰ� �ִ� ��ü�� �����ְ�, ������ ���� ���� ���� ��û�ϸ� ���� ��ü�� ����� ���� ����Ʈ�� �߰���Ű�� �����ݴϴ�.

2. ����

---------------- Person class �� Person�� Flyweight�� �����ϴ� Factory -------------

package ch13_Flyweight;
import java.util.HashMap;
import java.util.Map;
public class PersonFactory {
    private static Map<String, Person> map = new HashMap<String, Person>();
    public synchronized static Person getPerson(String name){
        if (!map.containsKey(name)) {
            Person tmp = new Person(name);
            map.put(name, tmp);
        }
        return map.get(name);
    }
    public static class Person {
        private final String name;
        private Person(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
}

---------------- Flyweight�� ����� factory�� ����ϴ� TestŬ���� -------------

package ch13_Flyweight;
import ch13_Flyweight.PersonFactory.Person;
public class Test {
    public static void main(String[] args) {
        Person p1 = PersonFactory.getPerson("ȫ�浿");
        Person p2 = PersonFactory.getPerson("�踻��");
        Person p3 = PersonFactory.getPerson("ȫ�浿");
        
        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
    }
}

---------------- �׽�Ʈ ��� -------------
false
true

�׽�Ʈ �ڵ忡�� p1�� p3�� �Ѵ� "ȫ�浿"�̶� String�� �̿��ؼ� ��ü�� �ֹ��մϴ�. ���� String���� ��ü�� �ֹ������Ƿ� ���� ��ü�� ���ϵ˴ϴ�. �ι�° ��û������ ���� �������� �ʽ��ϴ�.

������ �����Ϸ��� Ŭ������ Person�Դϴ�. Person�� PersonFactory�� ���� �����˴ϴ�. �ٽ� ���� Person�� Flyweight �� ����ϰ�, PersonFactory�� Flyweight Factory�� ����մϴ�. 

���������� Map�� �̿��ؼ� Person�� �ν��Ͻ��� �����մϴ�.(�Ϲ����� Flyweight�� �� Map���� �����մϴ�.) Map�� key, value�� � Ŭ������ �����Ǵ��� ���캸��. value�� �翬�� ���� Ÿ�԰� ���ƾ� ������, key�� �������� �� �������� ���� �����غ��� �մϴ�. ���� HashMap�� ����ϰ� �����Ƿ�, key�� ����� Ŭ�������� hashCode()�� equals()�� �� �����Ǿ��־�� �մϴ�.

PersonFactory�� getPerson() �޽��� sysnchronized�� ó���� �Ǿ��ֽ��ϴ�. HashMap�� �ƴ϶� Hashtable�� ����, �˾Ƽ� synchonized�� �ɸ�����, �װ� Hashtable�� �޽�� �ȿ����� �ɸ��ٴ� ���Դϴ�. �������� ���ó���� if ���� �ϳ��� synchronized ���� �� �־�� �ϱ� ������ �޽�忡 synchronized�� �ɷ� �־�� �մϴ�. Hashtable�� �ذ��ؼ��� �� �˴ϴ�. �ٽ� ������ �ϸ�, if �� �ȿ��� �ϴ� ���� �� �ܰ�� �Ǿ��ֽ��ϴ�. �̹� �ִ� ������ üũ�� �ϰ�(1�ܰ�) ������ ���� ����ϴ�.(2�ܰ�) 1,2 �ܰ谡 �������� �ϳ��� synchronized �ȿ� ���� �Ѵٴ� ���Դϴ�. Hashtable�� ����, ������ �ܰ躰�� synchronized�� �ɸ��ϴ�.

3. Flyweight  �߰� ����

Flyweight Ŭ����(���⼭�� Person)�� �����ϸ� �����ڸ� �ܺη� �������� �ʴ� ���� �����ϴ�. �� ���� ����� �ֽ��ϴ�.
ù°�� ������ ����� ��ó�� Flyweight Factory���� ���� Ŭ������ ������ �����鼭 �����ڸ� �ܺη� �������� �ʴ� ����Դϴ�.
�ι�°�� Flyweight�� Ŭ���� ������ public���� �����ڴ� default(package-privae �Ǵ� friendly ��� �մϴ�. �����ڸ� �������� �ʴ� ����) �� �����ϰ�, Flyweight Factory Ŭ������ ���� ��Ű�� �ȿ� �ִ� ����Դϴ�.

4. JAVA API�� �ִ� Flyweight 

�Ϲ������� immutable Ÿ�Ը��� ��� ������ ������ � �޽�带 �����ϴ� ��쿡�� flyweight�� ����մϴ�. Servlet �� �� ��ǥ���� ���Դϴ�. �ϳ��� servlet�� ���� �����尡 ���ÿ� ������ �� �ֽ��ϴ�. ������, �� ��û���� ó���ϴ� ���� �ϳ��� �ν��Ͻ� �Դϴ�. javax.servlet.Servlet �������̽��� �������� ����, service �޽��� ���� �����忡�� ���ÿ� �����ų �� �ֽ��ϴ�.
���� ���� Servlet�� ���� ��� ������ �����ϴ� ������ ����� �� �˴ϴ�. ���� �̼��� �ð� ���̷� ���� �� �ֽ��ϴ�. ����� ������ ����ϴ� Servlet�� ��� ����� ������ Servlet�� �����ϰ� �Ǹ�, �ٸ� ����ڰ� �� Servlet�� �������� �� ������ ���� �ֽ��ϴ�.


http://egloos.zum.com/iilii/v/4066794
