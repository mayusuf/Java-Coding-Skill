package LinkedList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args) {

        List<Character> alphabet = new LinkedList<>();

        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');

        System.out.println(alphabet);
        System.out.println(alphabet.get(1));

        Iterator<Character> itr = alphabet.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(int i=0; i<alphabet.size(); i++){
            System.out.println(alphabet.get(i));
        }

        alphabet.add(0,'a');
        alphabet.addFirst('b');
        alphabet.addLast('c');

        alphabet.remove(0);

        alphabet.removeFirst();
        alphabet.removeLast();

        System.out.println(alphabet);
    }
}
