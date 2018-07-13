import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Hash {
    public  static void main(String[] args){

        HashMap<Integer,String> map = new HashMap<Integer, String>();

        //값 넣는 방법
        map.put(1,"김수연");
        map.put(2,"임우재");
        map.put(3,"김보용");

        System.out.println(map);

        String str = map.get(1).toString();
        System.out.println("key값이 1인 데이터 : "+ str) ;

        Iterator<Integer> keyIterator = map.keySet().iterator();
        while(keyIterator.hasNext()){
            Integer key = keyIterator.next();
            System.out.println("key : "+ key + " , value" + map.get(key) );
        }

        /* mpa에 해당하는 전체의 값을 지우는 것.
         * map.clear();
         * System.out.print(map.isEmpty()); */


        //map.remove(1);
        System.out.println( map.remove(1));
        map.put(15,"사과");
        map.put(9,"포도");
        map.put(13,"구아바");
        map.put(7,"탕수육");
        System.out.println( map); //정렬되면 안되는데.. 내껀 정렬되는덧.

        TreeMap sortedmap = new TreeMap(map);
        System.out.println(sortedmap);






        /*
        public interface Iterator{
            boolean hasNEXT(); // 읽어올 요소가 남아있는 지 확인
            Object next();     //읽어올 요소 확인.
            void remove();       // next()로 읽어온 요소를 삭제.

        }*/


    }
}
