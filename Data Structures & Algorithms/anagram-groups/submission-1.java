class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        int n = strs.length;

        for (int i = 0; i < n; i++) {
            if (strs[i].equals("1")) {
                continue;
            }
            List<String> lt = new ArrayList<>();
            lt.add(strs[i]);
            for (int j = i + 1; j < n; j++) {
                if (!strs[j].equals("1")&&isAnagram(strs[i], strs[j])) {
                    lt.add(strs[j]);
                    strs[j] = "1";
                }
            }
            ans.add(lt);
        }
        return ans;
    }
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        int n = s.length();
        int m = t.length();
        if (m != n) {
            return false;
        }
        if(m==0&&n==0){
            return true;
        }
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
