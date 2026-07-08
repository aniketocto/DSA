class Solution {
    public String defangIPaddr(String address) {       
        // return address.replace(".", "[.]"); 
        String str = "";
        for(char ch: address.toCharArray())
        {
            if(ch == '.')
            {
                str += "[.]";
            }
            else
            {
                str += ch;
            }
        }

        return str;
    }
}