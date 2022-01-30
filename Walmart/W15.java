public int divide(int dividend, int divisor) {
        if(dividend == 0) {
            return 0;
        }

        long posDivd = dividend;
        long posDivr = divisor;
        boolean divdSign = true, divrSign = true;

        if(dividend < 0) {
            posDivd = -posDivd;
            if(posDivd < 0) {
                posDivd = Integer.MAX_VALUE;
            }
            divdSign = false;
        }

        if(divisor < 0) {
            posDivr = -posDivr;
            if(posDivr < 0) {
                posDivr = Integer.MAX_VALUE;
            }
            divrSign = false;
        }

        if(posDivr == 1) {
            if(divdSign == divrSign) {
                return (int) Math.min(posDivd, Integer.MAX_VALUE);
            } else {
                return (int) Math.max(-posDivd, Integer.MIN_VALUE);
            }
        }

        long temp = posDivr;
        long count = 0;
        while(temp <= posDivd) {
            temp += posDivr;
            count++;
        }

        if(divdSign == divrSign) {
            return (int) Math.min(count, Integer.MAX_VALUE);
        } else {
            return (int) Math.max(-count, Integer.MIN_VALUE);
        }
    }