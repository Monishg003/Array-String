class Solution {
    public int romanToInt(String s) {
        int total=0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for(int i=0;i<s.length();i++){
            if(i+1<s.length() && map.get(s.charAt(i+1))>map.get(s.charAt(i))){
            int key=map.get(s.charAt(i+1))-map.get(s.charAt(i));
            total+=key;
            i=i+1;
            }
            else{
                total+=map.get(s.charAt(i));
            }
        }
        return total;
    }
}

// Input
// s =
// "LVIII"
// Output
// 58
