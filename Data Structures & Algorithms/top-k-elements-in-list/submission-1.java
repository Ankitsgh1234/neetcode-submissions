class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> mp = new HashMap<>();

        for (int x : nums) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }

        LinkedHashMap<Integer, Integer> sortedMap =
            mp.entrySet()
              .stream()
              .sorted((a, b) -> b.getValue() - a.getValue()) // Descending
              .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (a, b) -> a,
                      LinkedHashMap::new));

        int[] ans = new int[k];
        int i = 0;

        for (int key : sortedMap.keySet()) {
            ans[i++] = key;
            if (i == k) break;
        }

        return ans;
    }
}