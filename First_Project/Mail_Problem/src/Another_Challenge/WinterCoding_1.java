//package Another_Challenge;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//import static java.lang.String.*;
//
//public class WinterCoding_1 {
//    static Map<Integer, String> linkHashMap = new LinkedHashMap<Integer, String>();
//
//
//    public static void main(String[] args) {
//
//        String skill = "CBD";
//        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
//        System.out.println(solution(skill, skill_trees));
//    }
//
//    public static int solution(String skill, String[] skill_trees) {
//        int answer = 0;
//        int dp[] = new int[skill.length()];
//
//        //order by skill
//        linkHashMap = new LinkedHashMap<Integer, String>();
//        for (int i = 0; i < skill.length(); i++) {
//            linkHashMap.put(i, valueOf(skill.charAt(i)));
//            System.out.println(linkHashMap.get(i));
//        }
//
//        for (int i = 0; i < skill_trees.length; i++) {
//            String sub_skill = skill_trees[i];
//            for (int j = 0; j < sub_skill.length(); j++) {
//                if (sub_skill.charAt(j) == skill.charAt(0)) {
//                    int last = j+skill.length();
//
//                    if(last > sub_skill.length()) {
//                        last = sub_skill.length();
//                    }
//
//                    String check = sub_skill.substring(j,last);
//
//                    if (find_order(check,linkHashMap)) {
//                        answer++;
//                    }
//                }
//
//            }
//        }
//        return answer;
//
//    }
//
//    private static boolean find_order(String check, Map<Integer, String> linkHashMap) {
//
//
//        String[] order = new String[check.length()];
//        for (int i = 0; i < order.length; i++) {
//            order[i] += linkHashMap.get(i);
//
//        }
//
//    }
//
//
//}
