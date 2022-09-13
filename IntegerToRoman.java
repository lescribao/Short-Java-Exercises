class Solution {
    public String intToRoman(int num) {
        
        int total1000 = 0;
        int total900 = 0;
        int total500 = 0;
        int total400 = 0;
        int total100 = 0;
        int total90 = 0;
        int total50 = 0;
        int total40 = 0;
        int total10 = 0;
        int total9 = 0;
        int total5 = 0;
        int total4 = 0;
        int total1 = 0;
        
        
        while(num >= 1000) {
            num = num - 1000;
            total1000++;
        }
        while(num >= 900) {
            num = num - 900;
            total900++;
        }
        while(num >= 500) {
            num = num - 500;
            total500++;
        }
        while(num >= 400) {
            num = num - 400;
            total400++;
        }
        while(num >= 100) {
            num = num - 100;
            total100++;
        }
        while(num >= 90) {
            num = num - 90;
            total90++;
        }
        while(num >= 50) {
            num = num - 50;
            total50++;
        }
        while(num >= 40) {
            num = num - 40;
            total40++;
        }
        while(num >= 10) {
            num = num - 10;
            total10++;
        }
        while(num >= 9) {
            num = num - 9;
            total9++;
        }
        while(num >= 5) {
            num = num - 5;
            total5++;
        }
        while(num >= 4) {
            num = num - 4;
            total4++;
        }
        while (num >= 1) {
            num = num -1;
            total1++;
        }
    
        String result = "";
        
        for(int a = 0; a < total1000; a++) {
            result = result + "M";
        }
        for(int b = 0; b < total900; b++) {
            result = result + "CM";
        }
        for(int c = 0; c < total500; c++) {
            result = result + "D";
        }
        for(int d = 0; d < total400; d++) {
            result = result + "CD";
        }
        for(int e = 0; e < total100; e++) {
            result = result + "C";
        }
        for(int f = 0; f < total90; f++) {
            result = result + "XC";
        }
        for(int g = 0; g < total50; g++) {
            result = result + "L";
        }
        for(int h = 0; h < total40; h++) {
            result = result + "XL";
        }
        for(int j = 0; j < total10; j++) {
            result = result + "X";
        }
        for(int q = 0; q < total9; q++) {
            result = result + "IX";
        }
        for(int u = 0; u < total5; u++) {
            result = result + "V";
        }
        for(int v = 0; v < total4; v++) {
            result = result + "IV";
        }
        for(int y = 0; y < total1; y++) {
            result = result + "I";
        }
        
        return result;
        
    }
}
