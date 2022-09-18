class result{
    public int myAtoi(String s) {
        int i=0;
        boolean min= false;
        s=s.trim();
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(!Character.isDigit(ch) && j==0) {
                if(ch=='-')
                    min=true;
                else if(ch=='+')
                    continue;
                else
                    break;
            }
            else if(Character.isDigit(ch)) {
                if((Integer.MAX_VALUE-(ch-48))/10<i) return (min? Integer.MIN_VALUE: Integer.MAX_VALUE);
                i=i*10+(ch-48);
            }
            else
                break;
        }
        return (min)?i*-1:i;
    }
}
