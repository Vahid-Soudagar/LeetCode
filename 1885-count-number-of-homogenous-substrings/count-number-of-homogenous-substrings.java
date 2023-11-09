class Solution {
    public int countHomogenous(String s) {
        long res  = 0;
        char[] c = s.toCharArray();
        int start =0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=c[start])
            {
                int appear = i-start;
                while(appear>0)
                {
                    res+=appear;
                    appear-=1;
                }
                start=i;
            }
        }

        int appear = c.length-start;
        while(appear>0)
        {
            res+=appear;
            appear-=1;
        }

        return (int)(res%(Math.pow(10,9)+7));
    }
}

/*
class Solution {
    public int countHomogenous(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int mod = 1_000_000_007;
        int sp = 0;
        int ep = 0;
        int count = 0;
        while (ep < s.length()) {
            char ch = s.charAt(ep);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while (!isHomogenous(map)) {
                char spChar = s.charAt(sp);
                int freq = map.get(spChar);
                if (freq == 1) {
                    map.remove(spChar);
                } else {
                    map.put(spChar, freq - 1);
                }
                sp++;
            }
            count = count + (ep - sp + 1);
            ep++;
        }
        return count%mod;
    }

    public boolean isHomogenous(HashMap<Character, Integer> map) {
        return map.size() == 1 || map.isEmpty();
    }
}

*/