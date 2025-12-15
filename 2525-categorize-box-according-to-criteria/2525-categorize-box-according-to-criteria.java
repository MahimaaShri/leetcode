class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulk=false;
        boolean heav=false;
        long vol=1L*length*width*height;
        if(length>=10000||width>=10000||height>=10000||vol>=1000000000L)
        {
            bulk=true;
        }
        if(mass>=100)
        {
            heav=true;
        }
        if(bulk && heav)
        {
            return "Both";
        }
        if(bulk)
        {
            return "Bulky";
        }
        if(heav)
        {
            return "Heavy";
        }
            return "Neither";
    }
}