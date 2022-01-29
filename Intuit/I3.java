int missingNo = -1;
 
            // To indicate whether the sequence failed
            // anywhere for current length.
            boolean fail = false;
 
            // Find subsequent numbers with previous number as n
            for (int i = m; i != str.length(); i += 1 + Math.log10(n)) {
                // If we haven't yet found the missing number
                // for current length. Next number is n+2. Note
                // that we use Log10 as (n+2) may have more
                // length than n.
                if ((missingNo == -1)
                        && (getValue(str, i, (int) (1 + Math.log10(n + 2))) == n + 2)) {
                    missingNo = n + 1;
                    n += 2;
                } // If next value is (n+1)
                else if (getValue(str, i, (int) (1 + Math.log10(n + 1))) == n + 1) {
                    n++;
                } else {
                    fail = true;
                    break;
                }
            }
 
            if (!fail) {
                return missingNo;
            }