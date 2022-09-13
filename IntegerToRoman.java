class Solution {
    public String intToRoman(int num) {
                
        String result = "";
        
        
        while(num >= 1000) {
            num = num - 1000;
            result = result + "M";
        }
        while(num >= 900) {
            num = num - 900;
            result = result + "CM";
        }
        while(num >= 500) {
            num = num - 500;
            result = result + "D";
        }
        while(num >= 400) {
            num = num - 400;
            result = result + "CD";
        }
        while(num >= 100) {
            num = num - 100;
            result = result + "C";
        }
        while(num >= 90) {
            num = num - 90;
            result = result + "XC";
        }
        while(num >= 50) {
            num = num - 50;
            result = result + "L";
        }
        while(num >= 40) {
            num = num - 40;
            result = result + "XL";
        }
        while(num >= 10) {
            num = num - 10;
           result = result + "X";
        }
        while(num >= 9) {
            num = num - 9;
            result = result + "IX";
        }
        while(num >= 5) {
            num = num - 5;
            result = result + "V";
        }
        while(num >= 4) {
            num = num - 4;
            result = result + "IV";
        }
        while (num >= 1) {
            num = num -1;
            result = result + "I";
        }

        
        return result;
        
    }
}
