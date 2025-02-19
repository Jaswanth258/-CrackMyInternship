class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int remainder = columnNumber%26;
            columnTitle.append((char) (remainder + 'A'));
            columnNumber /= 26;
        }   
        return columnTitle.reverse().toString();
    }
}
