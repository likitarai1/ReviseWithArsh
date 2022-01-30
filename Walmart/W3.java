public boolean winnerOfGame(String colors) {
        char prev = 'C';
        int a = 0, b = 0;
        for (int i = 0, cnt = 0; i < colors.length(); ++i) {
            char cur = colors.charAt(i);
            if (cur == prev) {
                if (++cnt > 2) {
                    if (cur == 'A') {
                        ++a;
                    }else {
                        ++b;
                    }
                }
            }else {
                cnt = 1;
            }
            prev = cur;
        }
        return a > b;
    }