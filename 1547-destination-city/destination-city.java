class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> path : paths) {
            String start = path.get(0);
            set.add(start);
        }

        String ans = "";
        for (List<String> path : paths) {
            String end = path.get(1);
            if (!set.contains(end)) {
                return end;
            }
        }
        return "";
    }
}